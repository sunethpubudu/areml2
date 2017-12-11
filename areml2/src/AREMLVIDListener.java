// Generated from AREMLVID.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AREMLVIDParser}.
 */
public interface AREMLVIDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#aremlvid}.
	 * @param ctx the parse tree
	 */
	void enterAremlvid(AREMLVIDParser.AremlvidContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#aremlvid}.
	 * @param ctx the parse tree
	 */
	void exitAremlvid(AREMLVIDParser.AremlvidContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#connectionType}.
	 * @param ctx the parse tree
	 */
	void enterConnectionType(AREMLVIDParser.ConnectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#connectionType}.
	 * @param ctx the parse tree
	 */
	void exitConnectionType(AREMLVIDParser.ConnectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(AREMLVIDParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(AREMLVIDParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(AREMLVIDParser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(AREMLVIDParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AREMLVIDParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AREMLVIDParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AREMLVIDParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AREMLVIDParser.ObjectContext ctx);
}