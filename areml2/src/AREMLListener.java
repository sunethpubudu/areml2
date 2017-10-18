// Generated from AREML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AREMLParser}.
 */
public interface AREMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AREMLParser#areml}.
	 * @param ctx the parse tree
	 */
	void enterAreml(AREMLParser.AremlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#areml}.
	 * @param ctx the parse tree
	 */
	void exitAreml(AREMLParser.AremlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#recognition}.
	 * @param ctx the parse tree
	 */
	void enterRecognition(AREMLParser.RecognitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#recognition}.
	 * @param ctx the parse tree
	 */
	void exitRecognition(AREMLParser.RecognitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AREMLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AREMLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#thing}.
	 * @param ctx the parse tree
	 */
	void enterThing(AREMLParser.ThingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#thing}.
	 * @param ctx the parse tree
	 */
	void exitThing(AREMLParser.ThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(AREMLParser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(AREMLParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#connection}.
	 * @param ctx the parse tree
	 */
	void enterConnection(AREMLParser.ConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#connection}.
	 * @param ctx the parse tree
	 */
	void exitConnection(AREMLParser.ConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AREMLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AREMLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(AREMLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(AREMLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(AREMLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(AREMLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AREMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AREMLParser.ValueContext ctx);
}