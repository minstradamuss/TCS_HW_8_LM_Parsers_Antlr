// Generated from calculator/src/main/antlr/lmr/example/Calcgram.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcgramParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(CalcgramParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcgramParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(CalcgramParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcgramParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(CalcgramParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcgramParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(CalcgramParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcgramParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CalcgramParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcgramParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalcgramParser.IntContext ctx);
}