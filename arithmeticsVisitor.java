// Generated from calculator/src/main/antlr/org/example/arithmetics.g4 by ANTLR 4.13.1

    package org.example;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arithmeticsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arithmeticsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arithmeticsParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(arithmeticsParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticsParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(arithmeticsParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticsParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(arithmeticsParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticsParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(arithmeticsParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticsParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(arithmeticsParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticsParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(arithmeticsParser.IntContext ctx);
}