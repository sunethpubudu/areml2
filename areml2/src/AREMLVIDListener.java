// Generated from AREMLVID.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

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
	 * Enter a parse tree produced by {@link AREMLVIDParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(AREMLVIDParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(AREMLVIDParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#connectionType}.
	 * @param ctx the parse tree
	 */
	void enterConnectionType(AREMLVIDParser.ConnectionTypeContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException;
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#connectionType}.
	 * @param ctx the parse tree
	 */
	void exitConnectionType(AREMLVIDParser.ConnectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#secondconnectiontype}.
	 * @param ctx the parse tree
	 */
	void enterSecondconnectiontype(AREMLVIDParser.SecondconnectiontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#secondconnectiontype}.
	 * @param ctx the parse tree
	 */
	void exitSecondconnectiontype(AREMLVIDParser.SecondconnectiontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#gender}.
	 * @param ctx the parse tree
	 */
	void enterGender(AREMLVIDParser.GenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#gender}.
	 * @param ctx the parse tree
	 */
	void exitGender(AREMLVIDParser.GenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#personProperty}.
	 * @param ctx the parse tree
	 */
	void enterPersonProperty(AREMLVIDParser.PersonPropertyContext ctx) throws ParserConfigurationException, SAXException, XPathExpressionException, IOException, TransformerException;
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#personProperty}.
	 * @param ctx the parse tree
	 */
	void exitPersonProperty(AREMLVIDParser.PersonPropertyContext ctx);
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
	void enterPerson(AREMLVIDParser.PersonContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException;
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(AREMLVIDParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AREMLVIDParser.ActionContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException;
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AREMLVIDParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AREMLVIDParser.ObjectContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException;
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AREMLVIDParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLVIDParser#secondobject}.
	 * @param ctx the parse tree
	 */
	void enterSecondobject(AREMLVIDParser.SecondobjectContext ctx) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException;
	/**
	 * Exit a parse tree produced by {@link AREMLVIDParser#secondobject}.
	 * @param ctx the parse tree
	 */
	void exitSecondobject(AREMLVIDParser.SecondobjectContext ctx);
}