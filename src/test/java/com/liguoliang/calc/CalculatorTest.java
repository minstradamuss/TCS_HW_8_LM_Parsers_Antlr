package com.liguoliang.calc;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertThat(calculator.calculate("1+2")).isEqualTo(3);
    }

    @Test
    public void testWithSpace() {
        assertThat(calculator.calculate("1   + 3  ")).isEqualTo(4);
    }

    @Test
    public void sub() {
        assertThat(calculator.calculate("5-1")).isEqualTo(4);
    }

    @Test
    public void mul() {
        assertThat(calculator.calculate("2*5")).isEqualTo(10);
    }

    @Test
    public void div() {
        assertThat(calculator.calculate("10/5")).isEqualTo(2);
    }

    @Test
    public void addAndDiv() {
        assertThat(calculator.calculate("1+2*3")).isEqualTo(7);
    }

    @Test
    public void withParentheses() {
        assertThat(calculator.calculate("(1+3)*2")).isEqualTo(8);
    }
}