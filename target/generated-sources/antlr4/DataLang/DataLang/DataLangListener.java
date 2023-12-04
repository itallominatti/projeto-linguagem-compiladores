// Generated from DataLang.g4 by ANTLR 4.4
package DataLang.DataLang;
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import lang.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataLangParser}.
 */
public interface DataLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataLangParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotExpression(@NotNull DataLangParser.LogicalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#logicalNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotExpression(@NotNull DataLangParser.LogicalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#numRows}.
	 * @param ctx the parse tree
	 */
	void enterNumRows(@NotNull DataLangParser.NumRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#numRows}.
	 * @param ctx the parse tree
	 */
	void exitNumRows(@NotNull DataLangParser.NumRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixContent}.
	 * @param ctx the parse tree
	 */
	void enterMatrixContent(@NotNull DataLangParser.MatrixContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixContent}.
	 * @param ctx the parse tree
	 */
	void exitMatrixContent(@NotNull DataLangParser.MatrixContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull DataLangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull DataLangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#popOperation}.
	 * @param ctx the parse tree
	 */
	void enterPopOperation(@NotNull DataLangParser.PopOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#popOperation}.
	 * @param ctx the parse tree
	 */
	void exitPopOperation(@NotNull DataLangParser.PopOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(@NotNull DataLangParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(@NotNull DataLangParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull DataLangParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull DataLangParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixRow}.
	 * @param ctx the parse tree
	 */
	void enterMatrixRow(@NotNull DataLangParser.MatrixRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixRow}.
	 * @param ctx the parse tree
	 */
	void exitMatrixRow(@NotNull DataLangParser.MatrixRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DataLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DataLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(@NotNull DataLangParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(@NotNull DataLangParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull DataLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull DataLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatrixExpression(@NotNull DataLangParser.MatrixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatrixExpression(@NotNull DataLangParser.MatrixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#pushOperation}.
	 * @param ctx the parse tree
	 */
	void enterPushOperation(@NotNull DataLangParser.PushOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#pushOperation}.
	 * @param ctx the parse tree
	 */
	void exitPushOperation(@NotNull DataLangParser.PushOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixElement}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElement(@NotNull DataLangParser.MatrixElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixElement}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElement(@NotNull DataLangParser.MatrixElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DataLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DataLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull DataLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull DataLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(@NotNull DataLangParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(@NotNull DataLangParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(@NotNull DataLangParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(@NotNull DataLangParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull DataLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull DataLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(@NotNull DataLangParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(@NotNull DataLangParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull DataLangParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull DataLangParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull DataLangParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull DataLangParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull DataLangParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull DataLangParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixElements}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElements(@NotNull DataLangParser.MatrixElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixElements}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElements(@NotNull DataLangParser.MatrixElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DataLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DataLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixElementList}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElementList(@NotNull DataLangParser.MatrixElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixElementList}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElementList(@NotNull DataLangParser.MatrixElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull DataLangParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull DataLangParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#vectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterVectorExpression(@NotNull DataLangParser.VectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#vectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitVectorExpression(@NotNull DataLangParser.VectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVectorDeclaration(@NotNull DataLangParser.VectorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVectorDeclaration(@NotNull DataLangParser.VectorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull DataLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull DataLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull DataLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull DataLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#numCols}.
	 * @param ctx the parse tree
	 */
	void enterNumCols(@NotNull DataLangParser.NumColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#numCols}.
	 * @param ctx the parse tree
	 */
	void exitNumCols(@NotNull DataLangParser.NumColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull DataLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull DataLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull DataLangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull DataLangParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull DataLangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull DataLangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull DataLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull DataLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(@NotNull DataLangParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(@NotNull DataLangParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDeclaration(@NotNull DataLangParser.MatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDeclaration(@NotNull DataLangParser.MatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(@NotNull DataLangParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(@NotNull DataLangParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#stackDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStackDeclaration(@NotNull DataLangParser.StackDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#stackDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStackDeclaration(@NotNull DataLangParser.StackDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull DataLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull DataLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataLangParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull DataLangParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataLangParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull DataLangParser.TernaryExpressionContext ctx);
}