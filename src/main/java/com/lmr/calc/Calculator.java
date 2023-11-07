package com.lmr.calc;

import com.lmr.calc.parser.CalculatorLexer;
import com.lmr.calc.parser.CalculatorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator {

    public int calculate(String s) {
        CharStream charStream = CharStreams.fromString(s);
        Lexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokenStream);
        ParseTree parseTree = parser.start();

        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        return calculatorVisitor.visit(parseTree);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String example1 = "5 + 8";
        String example2 = "(2 + 2) * 2";
        System.out.println(example1 + " = " + calculator.calculate(example1));
        System.out.println(example2 + " = " + calculator.calculate(example2));
    }
}
