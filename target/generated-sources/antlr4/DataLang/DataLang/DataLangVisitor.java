// Generated from DataLang\DataLang\DataLang.g4 by ANTLR 4.9.2
package DataLang.DataLang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DataLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DataLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DataLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DataLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(DataLangParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DataLangParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(DataLangParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DataLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(DataLangParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(DataLangParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DataLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DataLangParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(DataLangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorDeclaration(DataLangParser.VectorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixDeclaration(DataLangParser.MatrixDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#stackDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackDeclaration(DataLangParser.StackDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#pushOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushOperation(DataLangParser.PushOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#popOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopOperation(DataLangParser.PopOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DataLangParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DataLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(DataLangParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(DataLangParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(DataLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(DataLangParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DataLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(DataLangParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#numRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumRows(DataLangParser.NumRowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#numCols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumCols(DataLangParser.NumColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#vectorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorExpression(DataLangParser.VectorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#matrixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixExpression(DataLangParser.MatrixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(DataLangParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#matrixElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixElements(DataLangParser.MatrixElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(DataLangParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataLangParser#matrixElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixElement(DataLangParser.MatrixElementContext ctx);
}