// Generated from calculator/src/main/antlr/org/example/Calcgram.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcgramParser}.
 */
public interface CalcgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcgramParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(CalcgramParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcgramParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(CalcgramParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcgramParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(CalcgramParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcgramParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(CalcgramParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcgramParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(CalcgramParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcgramParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(CalcgramParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcgramParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CalcgramParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcgramParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CalcgramParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcgramParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CalcgramParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcgramParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CalcgramParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcgramParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalcgramParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcgramParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalcgramParser.IntContext ctx);
}