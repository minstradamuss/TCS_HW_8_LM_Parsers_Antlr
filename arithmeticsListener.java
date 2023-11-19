// Generated from calculator/src/main/antlr/lmr/example/arithmetics.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arithmeticsParser}.
 */
public interface arithmeticsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arithmeticsParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(arithmeticsParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticsParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(arithmeticsParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticsParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(arithmeticsParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticsParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(arithmeticsParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticsParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(arithmeticsParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticsParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(arithmeticsParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticsParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(arithmeticsParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticsParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(arithmeticsParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticsParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(arithmeticsParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticsParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(arithmeticsParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticsParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(arithmeticsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticsParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(arithmeticsParser.IntContext ctx);
}