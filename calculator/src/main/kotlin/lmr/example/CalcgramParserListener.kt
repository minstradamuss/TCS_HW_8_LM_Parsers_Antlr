package lmr.example
import CalcgramBaseListener
import CalcgramParser
import org.antlr.v4.runtime.tree.ErrorNode
import java.util.*

class Operand private constructor (
    val leftSummand : Int,
    val rightSummand : Int,
    val isSum : Boolean) {

    fun getValue() = leftSummand + rightSummand
    companion object {
        fun sum(leftSummand: Int, rightSummand: Int) = Operand(leftSummand, rightSummand, true)

        fun value(value: Int) = Operand(value, 0, false)
    }
}

class  CalcgramParserListener(
    val getValue: MutableMap<String, Operand> = mutableMapOf()
) : CalcgramBaseListener() {
    var setId: String? = null
        private set
    private val valuesStack = Stack<Operand>()
    var correct = true
        private set
    private var eCount = 0
    override fun enterS(ctx: CalcgramParser.SContext?) {
        setId = null
        correct = true
        eCount = 0
        valuesStack.clear()
    }

    override fun enterE(ctx: CalcgramParser.EContext?) {
        eCount++
    }

    override fun exitE(ctx: CalcgramParser.EContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        eCount--
        if (ctx.operation() != null) {
            val operation = ctx.operation().OPERATION().toString()
            val right = valuesStack.pop()
            val left = valuesStack.pop()
            valuesStack.push(
                if (operation == "+") Operand.sum(left.getValue(), right.getValue())
                else Operand.sum(left.getValue() * (if (right.isSum) right.leftSummand else right.getValue()), if (right.isSum) right.rightSummand else 0)
            )
        } else {
            valuesStack.push(Operand.value(valuesStack.pop().getValue()))
        }
    }


    override fun exitA(ctx: CalcgramParser.AContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        val value = valuesStack.pop().getValue()
        getValue[setId.toString()] = Operand.value(value)
    }

    override fun exitId(ctx: CalcgramParser.IdContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        val currId = ctx.ID().toString()
        if (eCount > 0) getValue[currId]?.let { valuesStack.push(it) } ?: run { correct = false }
        else setId = currId
    }

    override fun exitInt(ctx: CalcgramParser.IntContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        valuesStack.push(Operand.value(ctx.INT().toString().toInt()))
    }

    override fun visitErrorNode(node: ErrorNode?) {
        correct = false
    }

    override fun toString(): String = if (!correct) "Incorrect" else setId ?: valuesStack.pop().getValue().toString()

}