// Generated from DataLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataLangParser}.
 */
public interface DataLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DataLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DataLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DataLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DataLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(DataLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(DataLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVectorDeclaration(DataLangParser.VectorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVectorDeclaration(DataLangParser.VectorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDeclaration(DataLangParser.MatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDeclaration(DataLangParser.MatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#stackDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStackDeclaration(DataLangParser.StackDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#stackDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStackDeclaration(DataLangParser.StackDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#pushOperation}.
	 * @param ctx the parse tree
	 */
	void enterPushOperation(DataLangParser.PushOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#pushOperation}.
	 * @param ctx the parse tree
	 */
	void exitPushOperation(DataLangParser.PushOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#popOperation}.
	 * @param ctx the parse tree
	 */
	void enterPopOperation(DataLangParser.PopOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#popOperation}.
	 * @param ctx the parse tree
	 */
	void exitPopOperation(DataLangParser.PopOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(DataLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(DataLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DataLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DataLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(DataLangParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(DataLangParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DataLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DataLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(DataLangParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(DataLangParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#numRows}.
	 * @param ctx the parse tree
	 */
	void enterNumRows(DataLangParser.NumRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#numRows}.
	 * @param ctx the parse tree
	 */
	void exitNumRows(DataLangParser.NumRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#numCols}.
	 * @param ctx the parse tree
	 */
	void enterNumCols(DataLangParser.NumColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#numCols}.
	 * @param ctx the parse tree
	 */
	void exitNumCols(DataLangParser.NumColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#vectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterVectorExpression(DataLangParser.VectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#vectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitVectorExpression(DataLangParser.VectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatrixExpression(DataLangParser.MatrixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatrixExpression(DataLangParser.MatrixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(DataLangParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(DataLangParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixElements}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElements(DataLangParser.MatrixElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixElements}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElements(DataLangParser.MatrixElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(DataLangParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(DataLangParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixElement}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElement(DataLangParser.MatrixElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixElement}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElement(DataLangParser.MatrixElementContext ctx);
}