package lmr.example
import CalcgramBaseListener
import CalcgramParser
import org.antlr.v4.runtime.tree.ErrorNode
import java.util.*

class Operand private constructor (val leftS : Int, val rightS : Int, val isSum : Boolean) {
    fun getValue() = leftS + rightS
    companion object {
        fun sum(leftS: Int, rightS: Int) = Operand(leftS, rightS, true)
        fun `val`(value: Int) = Operand(value, 0, false)
    }
}

class  CalcgramParserListener( val getValue: MutableMap<String, Operand> = mutableMapOf()) : CalcgramBaseListener() {
    private var _setId: String? = null
    var setId: String?
        get() = _setId
        private set(value) {
            _setId = value
        }


    val valStack = Stack<Operand>()
    private var _correct = true
    var correct: Boolean
        get() = _correct
        private set(value) {
            _correct = value
        }


    private var _cnt = 0
    var eCnt: Int
        get() = _cnt
        private set(value) {
            _cnt = value
        }


    override fun enterS(ctx: CalcgramParser.SContext?) {
        setId = null
        correct = true
        eCnt = 0
    }

    override fun enterE(ctx: CalcgramParser.EContext?) {
        eCnt++
    }

    private fun shouldExit(ctx: CalcgramParser.EContext?): Boolean {
        if (ctx == null || !correct) {
            correct = false
            return true
        }
        return false
    }

    override fun exitE(ctx: CalcgramParser.EContext?) {
        eCnt--
        if (shouldExit(ctx)) {
            return
        }
        if (ctx != null) {
            if (ctx.operation() != null) {
                processOperation(ctx.operation())
            } else {
                processNonOperation()
            }
        }
    }

    private fun processOperation(operationCtx: CalcgramParser.OperationContext) {
        val operation = operationCtx.OPERATION().toString()
        val right = valStack.pop()
        val left = valStack.pop()

        valStack.push(
            if (operation == "+") Operand.sum(left.getValue(), right.getValue())
            else Operand.sum(
                left.getValue() * (if (right.isSum) right.leftS else right.getValue()),
                if (right.isSum) right.rightS else 0
            )
        )
    }

    private fun processNonOperation() {
        valStack.push(Operand.`val`(getValStackValue()))
    }

    override fun exitA(ctx: CalcgramParser.AContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        val value = getValStackValue()
        getValue[setId.toString()] = Operand.`val`(value)
    }

    override fun exitId(ctx: CalcgramParser.IdContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        val currId = ctx.ID().toString()
        if (eCnt > 0) getValue[currId]?.let { valStack.push(it) } ?: run { correct = false }
        else setId = currId
    }

    override fun exitInt(ctx: CalcgramParser.IntContext?) {
        if (ctx == null || !correct) {
            correct = false
            return
        }
        valStack.push(Operand.`val`(ctx.INT().toString().toInt()))
    }

    override fun visitErrorNode(node: ErrorNode?) {
        correct = false
    }

    override fun toString(): String {
        return setId ?: getValStackValueStr()
    }

    private fun getValStackValueStr(): String {
        return valStack.pop().getValue().toString()
    }

    private fun getValStackValue(): Int {
        return valStack.pop().getValue()
    }

}