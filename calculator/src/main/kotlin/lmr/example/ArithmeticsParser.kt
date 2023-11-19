package lmr.example

import arithmeticsLexer
import arithmeticsParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker


class MyArithmeticsParser {

    private val values: MutableMap<String, Operand> = mutableMapOf()
    fun parse(raw: String): String {
        val parseError = "Parse error"

        val eqqIndex = raw.indexOf(';')
        if (eqqIndex != raw.length - 1) return parseError

        val charStream: CharStream = CharStreams.fromString(raw)
        val lexer = arithmeticsLexer(charStream)
        val tokens = CommonTokenStream(lexer)
        val parser = arithmeticsParser(tokens)
        val arithmeticsContext: arithmeticsParser.SContext = parser.s()
        val walker = ParseTreeWalker()
        val listener = ArithmeticsParserListener(values)


        try {
            walker.walk(listener, arithmeticsContext)
        } catch (e : Exception) {
            return parseError
        }
        if (!listener.correct) return parseError

        if (listener.setId == null) {
            return "${raw.slice(0..<raw.length - 1)}=${listener};"
        }
        return "${listener.setId}=${values[listener.setId]?.getValue()};"
    }
}