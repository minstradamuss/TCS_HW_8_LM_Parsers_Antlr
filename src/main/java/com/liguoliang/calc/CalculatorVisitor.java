package com.liguoliang.calc;

import com.liguoliang.calc.parser.CalculatorBaseVisitor;
import com.liguoliang.calc.parser.CalculatorParser;

public class CalculatorVisitor extends CalculatorBaseVisitor<Integer> {

    @Override
    public Integer visitInteger(CalculatorParser.IntegerContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitMultiplication(CalculatorParser.MultiplicationContext ctx) {
        return visit(ctx.left) * visit(ctx.right);
    }

    @Override
    public Integer visitAddition(CalculatorParser.AdditionContext ctx) {
        return visit(ctx.left) + visit(ctx.right);
    }

    @Override
    public Integer visitSubtraction(CalculatorParser.SubtractionContext ctx) {
        return visit(ctx.left) - visit(ctx.right);
    }

    @Override
    public Integer visitReference(CalculatorParser.ReferenceContext ctx) {
        return super.visitReference(ctx);
    }

    @Override
    public Integer visitDivision(CalculatorParser.DivisionContext ctx) {
        return visit(ctx.left) / visit(ctx.right);
    }

    @Override
    public Integer visitStart(CalculatorParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public Integer visitParentheses(CalculatorParser.ParenthesesContext ctx) {
        return visit(ctx.inner);
    }
}
