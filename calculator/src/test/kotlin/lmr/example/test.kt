package lmr.example

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Test {

    @Test
    fun testSimpleAddition() {
        val parser = MyArithmeticsParser()
        assertEquals("2+0=2;", parser.parse("2+0;"))
    }

    @Test
    fun testSingleNumber() {
        val parser = MyArithmeticsParser()
        assertEquals("0=0;", parser.parse("0;"))
    }

    @Test
    fun testMultiplication() {
        val parser = MyArithmeticsParser()
        assertEquals("5*6=30;", parser.parse("5*6;"))
    }

    @Test
    fun testComplexExpression() {
        val parser = MyArithmeticsParser()
        assertEquals("2+2*2=6;", parser.parse("2+2*2;"))
    }

    @Test
    fun testNestedExpression() {
        val parser = MyArithmeticsParser()
        assertEquals("(((2+3)+3*2+(5+4*1)*4))+(2*2)=51;", parser.parse("(((2+3)+3*2+(5+4*1)*4))+(2*2);"))
    }

    @Test
    fun testVariableAssignment() {
        val parser = MyArithmeticsParser()
        assertEquals("a=5;", parser.parse("a=5;"))
    }

    @Test
    fun testVariableAssignmentWithVariable() {
        val parser = MyArithmeticsParser()
        assertEquals("a=5;", parser.parse("a=5;"))
        assertEquals("b=5;", parser.parse("b=a;"))
    }

    @Test
    fun testVariableWithNumber() {
        val parser = MyArithmeticsParser()
        assertEquals("a=5;", parser.parse("a=5;"))
        assertEquals("a+2=7;", parser.parse("a+2;"))
    }


}
