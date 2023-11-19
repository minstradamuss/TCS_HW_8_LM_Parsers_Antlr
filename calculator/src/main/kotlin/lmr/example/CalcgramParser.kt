package lmr.example

import CalcgramLexer
import CalcgramParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.Serializable


class CalcgramParser {

    private val values: MutableMap<String, Operand> = mutableMapOf()
    fun parse(raw: String): Serializable {
        val listener = CalcgramParserListener(values)
        val er = "Can't parse"

        if (raw.indexOf(';') != raw.length - 1 || !listener.correct) {
            return er
        }

        try {
            ParseTreeWalker().walk(listener, CalcgramParser(CommonTokenStream(CalcgramLexer(CharStreams.fromString(raw)))).s())
        } catch (e : Exception) {
            return e
        }

        return if (listener.setId == null) {
            "${raw.slice(0..<raw.length - 1)}=${listener};"
        } else {
            "${listener.setId}=${values[listener.setId]?.getValue()};"
        }
    }
}