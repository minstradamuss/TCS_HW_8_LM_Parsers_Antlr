package lmr.example
import arithmeticsBaseListener
import arithmeticsParser
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

class  ArithmeticsParserListener(
    val getValue : MutableMap<String, Operand> = mutableMapOf()
) : arithmeticsBaseListener() {
    var setId : String? = null
        private set
    private val valuesStack : Stack<Operand> = Stack()
    var correct : Boolean = true
        private set
    private var eCount : Int = 0
    override fun enterS(ctx: arithmeticsParser.SContext?) {
        setId = null
        correct = true
        eCount = 0
        valuesStack.clear()
    }
    override fun enterE(ctx: arithmeticsParser.EContext?) {
        eCount++
    }

    override fun exitE(ctx: arithmeticsParser.EContext?) {
        if (ctx == null) {
            correct = false
            return
        }
        eCount--
        if (ctx.operation() != null) {
            val operation = ctx.operation().OPERATION().toString()
            val right = valuesStack.pop();
            val left = valuesStack.pop()
            if (operation == "+") {
                valuesStack.push(Operand.sum(left.getValue(), right.getValue()))
            } else { // multiplication
                if (right.isSum) {
                    valuesStack.push(
                        Operand.sum(
                        left.getValue() * right.leftSummand, right.rightSummand
                        )
                    )
                } else {
                    valuesStack.push(
                        Operand.value(left.getValue() * right.getValue())
                    )
                }
            }
        } else {
            val last = valuesStack.pop()
            valuesStack.push(Operand.value(last.getValue()))
        }
    }

    override fun exitA(ctx: arithmeticsParser.AContext?) {
        if (ctx == null || !correct)  {
            correct = false
            return
        }
        val value = valuesStack.pop().getValue()
        getValue[setId.toString()] = Operand.value(value)
    }

    override fun exitId(ctx: arithmeticsParser.IdContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        val currId = ctx.ID().toString()
        if (eCount > 0) {
            val currIdValue = getValue[currId]
            if (currIdValue != null) valuesStack.push(currIdValue)
            else correct = false
        } else {
            setId = currId
        }
    }

    override fun exitInt(ctx: arithmeticsParser.IntContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        val value = ctx.INT().toString().toInt()
        valuesStack.push(Operand.value(value))
    }

    override fun visitErrorNode(node: ErrorNode?) {
        correct = false
    }

    override fun toString(): String {
        if (!correct) return "Incorrect"
        if (setId == null) return valuesStack.pop().getValue().toString()
        return "Set"
    }
}