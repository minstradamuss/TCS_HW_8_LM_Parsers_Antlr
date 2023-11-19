package lmr.example

import CalcgramLexer
import CalcgramParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.Serializable

val vals = mutableMapOf<String, Operand>()
class CalcgramParser {
    fun parse(raw: String): Serializable {
        val listener = CalcgramParserListener(vals)

        if (!isValidInput(raw, listener)) {
            return "Can't parse"
        }

        try {
            val parser = CalcgramParser(CommonTokenStream(CalcgramLexer(CharStreams.fromString(raw))))
            ParseTreeWalker().walk(listener, parser.s())
        } catch (e: Exception) {
            return e
        } finally {
            return formatResult(raw, listener)
        }
    }

    private fun isValidInput(raw: String, listener: CalcgramParserListener): Boolean {
        return raw.endsWith(';') && listener.correct
    }

    private fun formatResult(raw: String, listener: CalcgramParserListener): String {
        return if (listener.setId == null) {
            "${raw.substring(0, raw.length - 1)}=${listener};"
        } else {
            "${listener.setId}=${vals[listener.setId]?.getValue()};"
        }
    }
}
