// Generated from DataLang.g4 by ANTLR 4.4
package DataLang.DataLang;
 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import lang.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PRINT=7, FOR=8, VECTOR=9, 
		MATRIX=10, STACK=11, NEW=12, PUSH=13, POP=14, INT_TYPE=15, BOOLEAN_TYPE=16, 
		STRING_TYPE=17, FLOAT_TYPE=18, DOUBLE_TYPE=19, INT32_TYPE=20, INT64_TYPE=21, 
		LONG_TYPE=22, IF=23, ELSE_IF=24, ELSE=25, TERNARY=26, ID=27, INT=28, FLOAT_LITERAL=29, 
		BOOLEAN_LITERAL=30, STRING_LITERAL=31, ADDITIVE_OPERATOR=32, MULTIPLICATIVE_OPERATOR=33, 
		MODULO=34, OPEN_BRACKET=35, CLOSE_BRACKET=36, OPEN_BRACE=37, CLOSE_BRACE=38, 
		OPEN_PAREN=39, CLOSE_PAREN=40, COMMA=41, ASSIGN=42, LOGICAL_AND=43, LOGICAL_OR=44, 
		LOGICAL_NOT=45, RELATIONAL_OPERATOR=46, EQUALITY_OPERATOR=47, SEMICOLON=48, 
		COLON=49, WS=50, DOT=51;
	public static final String[] tokenNames = {
		"<INVALID>", "'<='", "'!='", "'>='", "'=='", "'<'", "'>'", "'print'", 
		"'for'", "'vector'", "'matrix'", "'stack'", "'new'", "'push'", "'pop'", 
		"'int'", "'boolean'", "'str'", "'float'", "'double'", "'int32'", "'int64'", 
		"'long'", "'if'", "'else if'", "'else'", "'?'", "ID", "INT", "FLOAT_LITERAL", 
		"BOOLEAN_LITERAL", "STRING_LITERAL", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", 
		"'%'", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'='", "'&&'", 
		"'||'", "'!'", "RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "';'", "':'", 
		"WS", "'.'"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ternaryExpression = 2, RULE_conditionalExpression = 3, 
		RULE_printStatement = 4, RULE_expressionList = 5, RULE_ifStatement = 6, 
		RULE_forLoop = 7, RULE_initialization = 8, RULE_condition = 9, RULE_update = 10, 
		RULE_variableDeclaration = 11, RULE_variableReference = 12, RULE_elementList = 13, 
		RULE_vectorDeclaration = 14, RULE_matrixElementList = 15, RULE_matrixDeclaration = 16, 
		RULE_matrixContent = 17, RULE_matrixRow = 18, RULE_stackDeclaration = 19, 
		RULE_pushOperation = 20, RULE_popOperation = 21, RULE_relationalOperator = 22, 
		RULE_expressionStatement = 23, RULE_expression = 24, RULE_logicalOrExpression = 25, 
		RULE_logicalAndExpression = 26, RULE_logicalNotExpression = 27, RULE_additiveExpression = 28, 
		RULE_multExpression = 29, RULE_atom = 30, RULE_scalarType = 31, RULE_type = 32, 
		RULE_size = 33, RULE_numRows = 34, RULE_numCols = 35, RULE_vectorExpression = 36, 
		RULE_matrixExpression = 37, RULE_elements = 38, RULE_matrixElements = 39, 
		RULE_element = 40, RULE_matrixElement = 41;
	public static final String[] ruleNames = {
		"program", "statement", "ternaryExpression", "conditionalExpression", 
		"printStatement", "expressionList", "ifStatement", "forLoop", "initialization", 
		"condition", "update", "variableDeclaration", "variableReference", "elementList", 
		"vectorDeclaration", "matrixElementList", "matrixDeclaration", "matrixContent", 
		"matrixRow", "stackDeclaration", "pushOperation", "popOperation", "relationalOperator", 
		"expressionStatement", "expression", "logicalOrExpression", "logicalAndExpression", 
		"logicalNotExpression", "additiveExpression", "multExpression", "atom", 
		"scalarType", "type", "size", "numRows", "numCols", "vectorExpression", 
		"matrixExpression", "elements", "matrixElements", "element", "matrixElement"
	};

	@Override
	public String getGrammarFileName() { return "DataLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public DataLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DataLangParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84); statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << FOR) | (1L << VECTOR) | (1L << MATRIX) | (1L << STACK) | (1L << INT_TYPE) | (1L << BOOLEAN_TYPE) | (1L << STRING_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << INT32_TYPE) | (1L << INT64_TYPE) | (1L << LONG_TYPE) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << FLOAT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL) | (1L << OPEN_PAREN) | (1L << LOGICAL_NOT))) != 0) );
			setState(89); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ASTNode node;
		public VariableDeclarationContext variableDeclaration;
		public VectorDeclarationContext vectorDeclaration;
		public MatrixDeclarationContext matrixDeclaration;
		public StackDeclarationContext stackDeclaration;
		public PushOperationContext pushOperation;
		public PopOperationContext popOperation;
		public ForLoopContext forLoop;
		public IfStatementContext ifStatement;
		public PrintStatementContext printStatement;
		public ExpressionStatementContext expressionStatement;
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VectorDeclarationContext vectorDeclaration() {
			return getRuleContext(VectorDeclarationContext.class,0);
		}
		public MatrixDeclarationContext matrixDeclaration() {
			return getRuleContext(MatrixDeclarationContext.class,0);
		}
		public PushOperationContext pushOperation() {
			return getRuleContext(PushOperationContext.class,0);
		}
		public StackDeclarationContext stackDeclaration() {
			return getRuleContext(StackDeclarationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PopOperationContext popOperation() {
			return getRuleContext(PopOperationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); ((StatementContext)_localctx).variableDeclaration = variableDeclaration();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).variableDeclaration.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); ((StatementContext)_localctx).vectorDeclaration = vectorDeclaration();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).vectorDeclaration.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); ((StatementContext)_localctx).matrixDeclaration = matrixDeclaration();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).matrixDeclaration.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100); ((StatementContext)_localctx).stackDeclaration = stackDeclaration();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).stackDeclaration.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103); ((StatementContext)_localctx).pushOperation = pushOperation();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).pushOperation.node;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106); ((StatementContext)_localctx).popOperation = popOperation();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).popOperation.node;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109); ((StatementContext)_localctx).forLoop = forLoop();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).forLoop.node;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(112); ((StatementContext)_localctx).ifStatement = ifStatement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).ifStatement.node;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115); ((StatementContext)_localctx).printStatement = printStatement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).printStatement.node;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(118); ((StatementContext)_localctx).expressionStatement = expressionStatement();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).expressionStatement.node;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public ConditionalExpressionContext c;
		public ExpressionContext t;
		public ExpressionContext f;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DataLangParser.COLON, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode TERNARY() { return getToken(DataLangParser.TERNARY, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitTernaryExpression(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); ((TernaryExpressionContext)_localctx).c = conditionalExpression();
			setState(129);
			_la = _input.LA(1);
			if (_la==TERNARY) {
				{
				setState(124); match(TERNARY);
				setState(125); ((TernaryExpressionContext)_localctx).t = expression();
				setState(126); match(COLON);
				setState(127); ((TernaryExpressionContext)_localctx).f = expression();
				}
			}


			        ((TernaryExpressionContext)_localctx).node =  (((TernaryExpressionContext)_localctx).t.node != null && ((TernaryExpressionContext)_localctx).f.node != null) ?
			            new TernaryExpressionNode(((TernaryExpressionContext)_localctx).c.node, ((TernaryExpressionContext)_localctx).t.node, ((TernaryExpressionContext)_localctx).f.node) :
			            ((TernaryExpressionContext)_localctx).c.node;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionListContext expressionList;
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(DataLangParser.PRINT, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(PRINT);
			setState(136); match(OPEN_PAREN);
			setState(137); ((PrintStatementContext)_localctx).expressionList = expressionList();
			setState(138); match(CLOSE_PAREN);
			setState(139); match(SEMICOLON);

			        ((PrintStatementContext)_localctx).node =  new PrintStatementNode(((PrintStatementContext)_localctx).expressionList.list);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ASTNode> list;
		public ExpressionContext expr;
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DataLangParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ((ExpressionListContext)_localctx).expr = expression();
			((ExpressionListContext)_localctx).list =  new ArrayList<>(); _localctx.list.add(((ExpressionListContext)_localctx).expr.node);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144); match(COMMA);
				setState(145); ((ExpressionListContext)_localctx).expr = expression();
				_localctx.list.add(((ExpressionListContext)_localctx).expr.node);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext condExpr;
		public StatementContext stmt;
		public ExpressionContext elseIfCond;
		public StatementContext elseIfStmt;
		public StatementContext elseStmt;
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(DataLangParser.CLOSE_PAREN, i);
		}
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(DataLangParser.OPEN_PAREN, i);
		}
		public TerminalNode ELSE() { return getToken(DataLangParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(DataLangParser.IF, 0); }
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(DataLangParser.CLOSE_BRACE); }
		public List<TerminalNode> ELSE_IF() { return getTokens(DataLangParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(DataLangParser.ELSE_IF, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(DataLangParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(DataLangParser.OPEN_PAREN); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(DataLangParser.CLOSE_PAREN); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(DataLangParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(DataLangParser.OPEN_BRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(IF);
			setState(154); match(OPEN_PAREN);
			setState(155); ((IfStatementContext)_localctx).condExpr = expression();
			setState(156); match(CLOSE_PAREN);
			setState(157); match(OPEN_BRACE);
			setState(158); ((IfStatementContext)_localctx).stmt = statement();
			setState(159); match(CLOSE_BRACE);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(160); match(ELSE_IF);
				setState(161); match(OPEN_PAREN);
				setState(162); ((IfStatementContext)_localctx).elseIfCond = expression();
				setState(163); match(CLOSE_PAREN);
				setState(164); match(OPEN_BRACE);
				setState(165); ((IfStatementContext)_localctx).elseIfStmt = statement();
				setState(166); match(CLOSE_BRACE);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(173); match(ELSE);
				setState(174); match(OPEN_BRACE);
				setState(175); ((IfStatementContext)_localctx).elseStmt = statement();
				setState(176); match(CLOSE_BRACE);
				}
			}


			        ((IfStatementContext)_localctx).node =  new IfStatementNode(
			            ((IfStatementContext)_localctx).condExpr.node, ((IfStatementContext)_localctx).stmt.node,
			            ((IfStatementContext)_localctx).elseIfCond.node, ((IfStatementContext)_localctx).elseIfStmt.node,
			            ((IfStatementContext)_localctx).elseStmt.node
			        );
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public ASTNode node;
		public VariableDeclarationContext init;
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> initList = new ArrayList<VariableDeclarationContext>();
		public ExpressionContext cond;
		public ExpressionContext upd;
		public ExpressionContext expression;
		public List<ExpressionContext> updList = new ArrayList<ExpressionContext>();
		public StatementContext stmt;
		public List<TerminalNode> SEMICOLON() { return getTokens(DataLangParser.SEMICOLON); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(DataLangParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(DataLangParser.OPEN_BRACE, 0); }
		public TerminalNode FOR() { return getToken(DataLangParser.FOR, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DataLangParser.SEMICOLON, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(FOR);
			setState(183); match(OPEN_PAREN);
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(184); ((ForLoopContext)_localctx).init = variableDeclaration();
				}
				break;
			case 2:
				{
				setState(185); ((ForLoopContext)_localctx).variableDeclaration = variableDeclaration();
				((ForLoopContext)_localctx).initList.add(((ForLoopContext)_localctx).variableDeclaration);
				}
				break;
			}
			setState(188); match(SEMICOLON);
			setState(189); ((ForLoopContext)_localctx).cond = expression();
			setState(190); match(SEMICOLON);
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(191); ((ForLoopContext)_localctx).upd = expression();
				}
				break;
			case 2:
				{
				setState(192); ((ForLoopContext)_localctx).expression = expression();
				((ForLoopContext)_localctx).updList.add(((ForLoopContext)_localctx).expression);
				}
				break;
			}
			setState(195); match(CLOSE_PAREN);
			setState(196); match(OPEN_BRACE);
			setState(197); ((ForLoopContext)_localctx).stmt = statement();
			setState(198); match(CLOSE_BRACE);

			        ((ForLoopContext)_localctx).node =  new ForLoopNode(
			            ((ForLoopContext)_localctx).initList.isEmpty() ? ((ForLoopContext)_localctx).init.node : ((ForLoopContext)_localctx).initList.get(0).node,
			            ((ForLoopContext)_localctx).cond.node,
			            ((ForLoopContext)_localctx).updList.isEmpty() ? ((ForLoopContext)_localctx).upd.node : ((ForLoopContext)_localctx).updList.get(0).node,
			            ((ForLoopContext)_localctx).stmt.node
			        );
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationContext extends ParserRuleContext {
		public ASTNode node;
		public VariableDeclarationContext variableDeclaration;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); ((InitializationContext)_localctx).variableDeclaration = variableDeclaration();
			 ((InitializationContext)_localctx).node =  ((InitializationContext)_localctx).variableDeclaration.node; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ASTNode cond;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); ((ConditionContext)_localctx).expression = expression();
			 ((ConditionContext)_localctx).cond =  ((ConditionContext)_localctx).expression.node; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); ((UpdateContext)_localctx).expression = expression();
			 ((UpdateContext)_localctx).node =  ((UpdateContext)_localctx).expression.node; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public ScalarTypeContext scalarType;
		public Token ID;
		public ExpressionContext expression;
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ((VariableDeclarationContext)_localctx).scalarType = scalarType();
			setState(211); ((VariableDeclarationContext)_localctx).ID = match(ID);
			setState(212); match(ASSIGN);
			setState(213); ((VariableDeclarationContext)_localctx).expression = expression();
			setState(214); match(SEMICOLON);

			        ((VariableDeclarationContext)_localctx).node =  new VariableDeclarationNode((((VariableDeclarationContext)_localctx).scalarType!=null?_input.getText(((VariableDeclarationContext)_localctx).scalarType.start,((VariableDeclarationContext)_localctx).scalarType.stop):null), (((VariableDeclarationContext)_localctx).ID!=null?((VariableDeclarationContext)_localctx).ID.getText():null), ((VariableDeclarationContext)_localctx).expression.node);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitVariableReference(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); ((VariableReferenceContext)_localctx).ID = match(ID);
			 ((VariableReferenceContext)_localctx).node =  new VariableReferenceNode((((VariableReferenceContext)_localctx).ID!=null?((VariableReferenceContext)_localctx).ID.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ASTNode> list;
		public ElementContext el1;
		public ElementContext el2;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DataLangParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); ((ElementListContext)_localctx).el1 = element();
			((ElementListContext)_localctx).list =  new ArrayList<>(); _localctx.list.add(((ElementListContext)_localctx).el1.node);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222); match(COMMA);
				setState(223); ((ElementListContext)_localctx).el2 = element();
				_localctx.list.add(((ElementListContext)_localctx).el2.node);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ScalarTypeContext scalarType;
		public ElementListContext elems;
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public TerminalNode VECTOR() { return getToken(DataLangParser.VECTOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(DataLangParser.COLON, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public VectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterVectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitVectorDeclaration(this);
		}
	}

	public final VectorDeclarationContext vectorDeclaration() throws RecognitionException {
		VectorDeclarationContext _localctx = new VectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(VECTOR);
			setState(232); ((VectorDeclarationContext)_localctx).ID = match(ID);
			setState(233); match(COLON);
			setState(234); ((VectorDeclarationContext)_localctx).scalarType = scalarType();
			setState(235); match(ASSIGN);
			setState(236); match(OPEN_BRACKET);
			setState(237); ((VectorDeclarationContext)_localctx).elems = elementList();
			setState(238); match(CLOSE_BRACKET);
			setState(239); match(SEMICOLON);

			        ((VectorDeclarationContext)_localctx).node =  new VectorDeclarationNode((((VectorDeclarationContext)_localctx).ID!=null?((VectorDeclarationContext)_localctx).ID.getText():null), (((VectorDeclarationContext)_localctx).scalarType!=null?_input.getText(((VectorDeclarationContext)_localctx).scalarType.start,((VectorDeclarationContext)_localctx).scalarType.stop):null), ((VectorDeclarationContext)_localctx).elems.list);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixElementListContext extends ParserRuleContext {
		public List<List<Object>> list;
		public MatrixElementContext matrixElement;
		public List<MatrixElementContext> matrixElement() {
			return getRuleContexts(MatrixElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
		public MatrixElementContext matrixElement(int i) {
			return getRuleContext(MatrixElementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DataLangParser.COMMA, i);
		}
		public MatrixElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixElementList(this);
		}
	}

	public final MatrixElementListContext matrixElementList() throws RecognitionException {
		MatrixElementListContext _localctx = new MatrixElementListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_matrixElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); ((MatrixElementListContext)_localctx).matrixElement = matrixElement();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243); match(COMMA);
				setState(244); ((MatrixElementListContext)_localctx).matrixElement = matrixElement();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((MatrixElementListContext)_localctx).list =  new ArrayList<>();
			        _localctx.list.add(((MatrixElementListContext)_localctx).matrixElement.list);
			        for (List<Object> elem : ((MatrixElementListContext)_localctx).matrixElement.list) {
			            _localctx.list.add(elem);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ScalarTypeContext scalarType;
		public MatrixContentContext matrixContent;
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public MatrixContentContext matrixContent() {
			return getRuleContext(MatrixContentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DataLangParser.COLON, 0); }
		public TerminalNode MATRIX() { return getToken(DataLangParser.MATRIX, 0); }
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixDeclaration(this);
		}
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_matrixDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(MATRIX);
			setState(253); ((MatrixDeclarationContext)_localctx).ID = match(ID);
			setState(254); match(COLON);
			setState(255); ((MatrixDeclarationContext)_localctx).scalarType = scalarType();
			setState(256); match(ASSIGN);
			setState(257); ((MatrixDeclarationContext)_localctx).matrixContent = matrixContent();
			setState(258); match(SEMICOLON);

			        ((MatrixDeclarationContext)_localctx).node =  new MatrixDeclarationNode((((MatrixDeclarationContext)_localctx).ID!=null?((MatrixDeclarationContext)_localctx).ID.getText():null), (((MatrixDeclarationContext)_localctx).scalarType!=null?_input.getText(((MatrixDeclarationContext)_localctx).scalarType.start,((MatrixDeclarationContext)_localctx).scalarType.stop):null), ((MatrixDeclarationContext)_localctx).matrixContent.list);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContentContext extends ParserRuleContext {
		public List<List<Object>> list;
		public MatrixRowContext matrixRow;
		public MatrixRowContext matrixRow(int i) {
			return getRuleContext(MatrixRowContext.class,i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
		public List<MatrixRowContext> matrixRow() {
			return getRuleContexts(MatrixRowContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DataLangParser.COMMA, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public MatrixContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixContent(this);
		}
	}

	public final MatrixContentContext matrixContent() throws RecognitionException {
		MatrixContentContext _localctx = new MatrixContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matrixContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(OPEN_BRACKET);
			setState(262); ((MatrixContentContext)_localctx).matrixRow = matrixRow();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263); match(COMMA);
				setState(264); ((MatrixContentContext)_localctx).matrixRow = matrixRow();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270); match(CLOSE_BRACKET);

			        ((MatrixContentContext)_localctx).list =  ((MatrixContentContext)_localctx).matrixRow.list;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixRowContext extends ParserRuleContext {
		public List<Object> list;
		public ElementsContext elements;
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public MatrixRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixRow(this);
		}
	}

	public final MatrixRowContext matrixRow() throws RecognitionException {
		MatrixRowContext _localctx = new MatrixRowContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matrixRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(OPEN_BRACKET);
			setState(274); ((MatrixRowContext)_localctx).elements = elements();
			setState(275); match(CLOSE_BRACKET);

			        ((MatrixRowContext)_localctx).list =  ((MatrixRowContext)_localctx).elements.list;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public List<TerminalNode> STACK() { return getTokens(DataLangParser.STACK); }
		public TerminalNode STACK(int i) {
			return getToken(DataLangParser.STACK, i);
		}
		public TerminalNode NEW() { return getToken(DataLangParser.NEW, 0); }
		public StackDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterStackDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitStackDeclaration(this);
		}
	}

	public final StackDeclarationContext stackDeclaration() throws RecognitionException {
		StackDeclarationContext _localctx = new StackDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stackDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(STACK);
			setState(279); ((StackDeclarationContext)_localctx).ID = match(ID);
			setState(280); match(ASSIGN);
			setState(281); match(NEW);
			setState(282); match(STACK);
			setState(283); match(SEMICOLON);

			        ((StackDeclarationContext)_localctx).node =  new StackDeclarationNode((((StackDeclarationContext)_localctx).ID!=null?((StackDeclarationContext)_localctx).ID.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushOperationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode PUSH() { return getToken(DataLangParser.PUSH, 0); }
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(DataLangParser.DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public PushOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterPushOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitPushOperation(this);
		}
	}

	public final PushOperationContext pushOperation() throws RecognitionException {
		PushOperationContext _localctx = new PushOperationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pushOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); ((PushOperationContext)_localctx).ID = match(ID);
			setState(287); match(DOT);
			setState(288); match(PUSH);
			setState(289); match(OPEN_PAREN);
			setState(290); ((PushOperationContext)_localctx).expression = expression();
			setState(291); match(CLOSE_PAREN);
			setState(292); match(SEMICOLON);

			        ((PushOperationContext)_localctx).node =  new PushOperationNode((((PushOperationContext)_localctx).ID!=null?((PushOperationContext)_localctx).ID.getText():null), ((PushOperationContext)_localctx).expression.node);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopOperationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode POP() { return getToken(DataLangParser.POP, 0); }
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(DataLangParser.DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public PopOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterPopOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitPopOperation(this);
		}
	}

	public final PopOperationContext popOperation() throws RecognitionException {
		PopOperationContext _localctx = new PopOperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_popOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); ((PopOperationContext)_localctx).ID = match(ID);
			setState(296); match(DOT);
			setState(297); match(POP);
			setState(298); match(OPEN_PAREN);
			setState(299); match(CLOSE_PAREN);
			setState(300); match(SEMICOLON);

			        ((PopOperationContext)_localctx).node =  new PopOperationNode((((PopOperationContext)_localctx).ID!=null?((PopOperationContext)_localctx).ID.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); ((ExpressionStatementContext)_localctx).expression = expression();
			setState(306); match(SEMICOLON);

			        ((ExpressionStatementContext)_localctx).node =  ((ExpressionStatementContext)_localctx).expression.node;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalOrExpressionContext left;
		public RelationalOperatorContext op;
		public LogicalOrExpressionContext right;
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); ((ExpressionContext)_localctx).left = logicalOrExpression();
			setState(314);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) {
				{
				setState(310); ((ExpressionContext)_localctx).op = relationalOperator();
				setState(311); ((ExpressionContext)_localctx).right = logicalOrExpression();

				            ((ExpressionContext)_localctx).node =  new ComparisonNode(((ExpressionContext)_localctx).left.node, ((ExpressionContext)_localctx).right.node, (((ExpressionContext)_localctx).op!=null?_input.getText(((ExpressionContext)_localctx).op.start,((ExpressionContext)_localctx).op.stop):null));
				        
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(DataLangParser.LOGICAL_OR, i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(DataLangParser.LOGICAL_OR); }
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); logicalAndExpression();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(317); match(LOGICAL_OR);
				setState(318); logicalAndExpression();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public List<LogicalNotExpressionContext> logicalNotExpression() {
			return getRuleContexts(LogicalNotExpressionContext.class);
		}
		public LogicalNotExpressionContext logicalNotExpression(int i) {
			return getRuleContext(LogicalNotExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(DataLangParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(DataLangParser.LOGICAL_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); logicalNotExpression();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(325); match(LOGICAL_AND);
				setState(326); logicalNotExpression();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalNotExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode LOGICAL_NOT() { return getToken(DataLangParser.LOGICAL_NOT, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public LogicalNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterLogicalNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitLogicalNotExpression(this);
		}
	}

	public final LogicalNotExpressionContext logicalNotExpression() throws RecognitionException {
		LogicalNotExpressionContext _localctx = new LogicalNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalNotExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if (_la==LOGICAL_NOT) {
				{
				setState(332); match(LOGICAL_NOT);
				}
			}

			setState(335); additiveExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public MultExpressionContext multExpr;
		public Token op;
		public MultExpressionContext right;
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public TerminalNode ADDITIVE_OPERATOR(int i) {
			return getToken(DataLangParser.ADDITIVE_OPERATOR, i);
		}
		public List<TerminalNode> ADDITIVE_OPERATOR() { return getTokens(DataLangParser.ADDITIVE_OPERATOR); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); ((AdditiveExpressionContext)_localctx).multExpr = multExpression();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIVE_OPERATOR) {
				{
				{
				setState(338); ((AdditiveExpressionContext)_localctx).op = match(ADDITIVE_OPERATOR);
				setState(339); ((AdditiveExpressionContext)_localctx).right = multExpression();
				((AdditiveExpressionContext)_localctx).node =  new AdditionNode(((AdditiveExpressionContext)_localctx).multExpr.node, ((AdditiveExpressionContext)_localctx).right.node);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public AtomContext atomExpr;
		public Token op;
		public AtomContext right;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode MULTIPLICATIVE_OPERATOR(int i) {
			return getToken(DataLangParser.MULTIPLICATIVE_OPERATOR, i);
		}
		public List<TerminalNode> MULTIPLICATIVE_OPERATOR() { return getTokens(DataLangParser.MULTIPLICATIVE_OPERATOR); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); ((MultExpressionContext)_localctx).atomExpr = atom();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATIVE_OPERATOR) {
				{
				{
				setState(348); ((MultExpressionContext)_localctx).op = match(MULTIPLICATIVE_OPERATOR);
				setState(349); ((MultExpressionContext)_localctx).right = atom();
				((MultExpressionContext)_localctx).node =  new MultiplicationNode(((MultExpressionContext)_localctx).atomExpr.node, ((MultExpressionContext)_localctx).right.node);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public ASTNode node;
		public Token INT;
		public Token ID;
		public Token FLOAT_LITERAL;
		public Token STRING_LITERAL;
		public Token BOOLEAN_LITERAL;
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(DataLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DataLangParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DataLangParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atom);
		try {
			setState(371);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); ((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).node =  new IntNode(Integer.parseInt((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); ((AtomContext)_localctx).ID = match(ID);
				((AtomContext)_localctx).node =  new VariableReferenceNode((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(361); ((AtomContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((AtomContext)_localctx).node =  new FloatNode(Float.parseFloat((((AtomContext)_localctx).FLOAT_LITERAL!=null?((AtomContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(363); ((AtomContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((AtomContext)_localctx).node =  new StringNode((((AtomContext)_localctx).STRING_LITERAL!=null?((AtomContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((AtomContext)_localctx).STRING_LITERAL!=null?((AtomContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); match(OPEN_PAREN);
				setState(366); expression();
				setState(367); match(CLOSE_PAREN);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(369); ((AtomContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((AtomContext)_localctx).node =  new BooleanNode(Boolean.parseBoolean((((AtomContext)_localctx).BOOLEAN_LITERAL!=null?((AtomContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(DataLangParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(DataLangParser.FLOAT_TYPE, 0); }
		public TerminalNode INT64_TYPE() { return getToken(DataLangParser.INT64_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(DataLangParser.LONG_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(DataLangParser.DOUBLE_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(DataLangParser.BOOLEAN_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(DataLangParser.STRING_TYPE, 0); }
		public TerminalNode INT32_TYPE() { return getToken(DataLangParser.INT32_TYPE, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitScalarType(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scalarType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << BOOLEAN_TYPE) | (1L << STRING_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << INT32_TYPE) | (1L << INT64_TYPE) | (1L << LONG_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode MATRIX() { return getToken(DataLangParser.MATRIX, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOLEAN_TYPE:
			case STRING_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case INT32_TYPE:
			case INT64_TYPE:
			case LONG_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(375); scalarType();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); match(MATRIX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumRowsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public NumRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numRows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterNumRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitNumRows(this);
		}
	}

	public final NumRowsContext numRows() throws RecognitionException {
		NumRowsContext _localctx = new NumRowsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumColsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public NumColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numCols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterNumCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitNumCols(this);
		}
	}

	public final NumColsContext numCols() throws RecognitionException {
		NumColsContext _localctx = new NumColsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numCols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public VectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterVectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitVectorExpression(this);
		}
	}

	public final VectorExpressionContext vectorExpression() throws RecognitionException {
		VectorExpressionContext _localctx = new VectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(ID);
			setState(386); match(ASSIGN);
			setState(387); match(OPEN_BRACKET);
			setState(388); elements();
			setState(389); match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public MatrixElementsContext matrixElements() {
			return getRuleContext(MatrixElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public MatrixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixExpression(this);
		}
	}

	public final MatrixExpressionContext matrixExpression() throws RecognitionException {
		MatrixExpressionContext _localctx = new MatrixExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_matrixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(ID);
			setState(392); match(ASSIGN);
			setState(393); match(OPEN_BRACKET);
			setState(394); matrixElements();
			setState(395); match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsContext extends ParserRuleContext {
		public List<Object> list;
		public ElementContext el1;
		public ElementContext el2;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DataLangParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitElements(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); ((ElementsContext)_localctx).el1 = element();
			((ElementsContext)_localctx).list =  new ArrayList<>(); _localctx.list.add(((ElementsContext)_localctx).el1.node);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399); match(COMMA);
				setState(400); ((ElementsContext)_localctx).el2 = element();
				_localctx.list.add(((ElementsContext)_localctx).el2.node);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixElementsContext extends ParserRuleContext {
		public List<List<Object>> list;
		public MatrixElementContext matrixElement;
		public List<MatrixElementContext> matrixElement() {
			return getRuleContexts(MatrixElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
		public MatrixElementContext matrixElement(int i) {
			return getRuleContext(MatrixElementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DataLangParser.COMMA, i);
		}
		public MatrixElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixElements(this);
		}
	}

	public final MatrixElementsContext matrixElements() throws RecognitionException {
		MatrixElementsContext _localctx = new MatrixElementsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_matrixElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); ((MatrixElementsContext)_localctx).matrixElement = matrixElement();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409); match(COMMA);
				setState(410); ((MatrixElementsContext)_localctx).matrixElement = matrixElement();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((MatrixElementsContext)_localctx).list =  new ArrayList<>();
			        _localctx.list.add(((MatrixElementsContext)_localctx).matrixElement.list);
			        for (List<Object> elem : ((MatrixElementsContext)_localctx).matrixElement.list) {
			            _localctx.list.add(elem);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ASTNode node;
		public Token INT;
		public Token ID;
		public Token FLOAT_LITERAL;
		public Token STRING_LITERAL;
		public Token BOOLEAN_LITERAL;
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public MatrixElementListContext matrixElementList() {
			return getRuleContext(MatrixElementListContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(DataLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DataLangParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DataLangParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_element);
		try {
			setState(436);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); ((ElementContext)_localctx).INT = match(INT);
				((ElementContext)_localctx).node =  new IntNode(Integer.parseInt((((ElementContext)_localctx).INT!=null?((ElementContext)_localctx).INT.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(420); ((ElementContext)_localctx).ID = match(ID);
				((ElementContext)_localctx).node =  new VariableReferenceNode((((ElementContext)_localctx).ID!=null?((ElementContext)_localctx).ID.getText():null));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(422); ((ElementContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((ElementContext)_localctx).node =  new FloatNode(Float.parseFloat((((ElementContext)_localctx).FLOAT_LITERAL!=null?((ElementContext)_localctx).FLOAT_LITERAL.getText():null)));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(424); ((ElementContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((ElementContext)_localctx).node =  new StringNode((((ElementContext)_localctx).STRING_LITERAL!=null?((ElementContext)_localctx).STRING_LITERAL.getText():null).substring(1, (((ElementContext)_localctx).STRING_LITERAL!=null?((ElementContext)_localctx).STRING_LITERAL.getText():null).length() - 1));
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(426); match(OPEN_BRACKET);
				setState(427); matrixElementList();
				setState(428); match(CLOSE_BRACKET);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(430); match(OPEN_PAREN);
				setState(431); expression();
				setState(432); match(CLOSE_PAREN);
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(434); ((ElementContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				((ElementContext)_localctx).node =  new BooleanNode(Boolean.parseBoolean((((ElementContext)_localctx).BOOLEAN_LITERAL!=null?((ElementContext)_localctx).BOOLEAN_LITERAL.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixElementContext extends ParserRuleContext {
		public List<Object> list;
		public ElementsContext elements;
		public TerminalNode OPEN_BRACKET() { return getToken(DataLangParser.OPEN_BRACKET, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DataLangParser.CLOSE_BRACKET, 0); }
		public MatrixElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterMatrixElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitMatrixElement(this);
		}
	}

	public final MatrixElementContext matrixElement() throws RecognitionException {
		MatrixElementContext _localctx = new MatrixElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_matrixElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); match(OPEN_BRACKET);
			setState(439); ((MatrixElementContext)_localctx).elements = elements();
			setState(440); match(CLOSE_BRACKET);

			        ((MatrixElementContext)_localctx).list =  ((MatrixElementContext)_localctx).elements.list;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3|\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0097\n\7"+
		"\f\7\16\7\u009a\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b5"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00e5\n\17\f\17\16\17\u00e8\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00f8\n\21\f\21\16\21\u00fb"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\u010c\n\23\f\23\16\23\u010f\13\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u013d"+
		"\n\32\3\33\3\33\3\33\7\33\u0142\n\33\f\33\16\33\u0145\13\33\3\34\3\34"+
		"\3\34\7\34\u014a\n\34\f\34\16\34\u014d\13\34\3\35\5\35\u0150\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u0159\n\36\f\36\16\36\u015c\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0163\n\37\f\37\16\37\u0166\13\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0176\n \3!\3!\3\"\3\"\5\"\u017c"+
		"\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\7(\u0196\n(\f(\16(\u0199\13(\3)\3)\3)\7)\u019e\n)\f)\16"+
		")\u01a1\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u01b7\n*\3+\3+\3+\3+\3+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\4\3\2\3\b\3\2\21\30\u01ba"+
		"\2W\3\2\2\2\4{\3\2\2\2\6}\3\2\2\2\b\u0087\3\2\2\2\n\u0089\3\2\2\2\f\u0090"+
		"\3\2\2\2\16\u009b\3\2\2\2\20\u00b8\3\2\2\2\22\u00cb\3\2\2\2\24\u00ce\3"+
		"\2\2\2\26\u00d1\3\2\2\2\30\u00d4\3\2\2\2\32\u00db\3\2\2\2\34\u00de\3\2"+
		"\2\2\36\u00e9\3\2\2\2 \u00f4\3\2\2\2\"\u00fe\3\2\2\2$\u0107\3\2\2\2&\u0113"+
		"\3\2\2\2(\u0118\3\2\2\2*\u0120\3\2\2\2,\u0129\3\2\2\2.\u0131\3\2\2\2\60"+
		"\u0133\3\2\2\2\62\u0137\3\2\2\2\64\u013e\3\2\2\2\66\u0146\3\2\2\28\u014f"+
		"\3\2\2\2:\u0153\3\2\2\2<\u015d\3\2\2\2>\u0175\3\2\2\2@\u0177\3\2\2\2B"+
		"\u017b\3\2\2\2D\u017d\3\2\2\2F\u017f\3\2\2\2H\u0181\3\2\2\2J\u0183\3\2"+
		"\2\2L\u0189\3\2\2\2N\u018f\3\2\2\2P\u019a\3\2\2\2R\u01b6\3\2\2\2T\u01b8"+
		"\3\2\2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2["+
		"\\\7\2\2\3\\\3\3\2\2\2]^\5\30\r\2^_\b\3\1\2_|\3\2\2\2`a\5\36\20\2ab\b"+
		"\3\1\2b|\3\2\2\2cd\5\"\22\2de\b\3\1\2e|\3\2\2\2fg\5(\25\2gh\b\3\1\2h|"+
		"\3\2\2\2ij\5*\26\2jk\b\3\1\2k|\3\2\2\2lm\5,\27\2mn\b\3\1\2n|\3\2\2\2o"+
		"p\5\20\t\2pq\b\3\1\2q|\3\2\2\2rs\5\16\b\2st\b\3\1\2t|\3\2\2\2uv\5\n\6"+
		"\2vw\b\3\1\2w|\3\2\2\2xy\5\60\31\2yz\b\3\1\2z|\3\2\2\2{]\3\2\2\2{`\3\2"+
		"\2\2{c\3\2\2\2{f\3\2\2\2{i\3\2\2\2{l\3\2\2\2{o\3\2\2\2{r\3\2\2\2{u\3\2"+
		"\2\2{x\3\2\2\2|\5\3\2\2\2}\u0083\5\b\5\2~\177\7\34\2\2\177\u0080\5\62"+
		"\32\2\u0080\u0081\7\63\2\2\u0081\u0082\5\62\32\2\u0082\u0084\3\2\2\2\u0083"+
		"~\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\4\1\2"+
		"\u0086\7\3\2\2\2\u0087\u0088\5\62\32\2\u0088\t\3\2\2\2\u0089\u008a\7\t"+
		"\2\2\u008a\u008b\7)\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7*\2\2\u008d\u008e"+
		"\7\62\2\2\u008e\u008f\b\6\1\2\u008f\13\3\2\2\2\u0090\u0091\5\62\32\2\u0091"+
		"\u0098\b\7\1\2\u0092\u0093\7+\2\2\u0093\u0094\5\62\32\2\u0094\u0095\b"+
		"\7\1\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\r\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009b\u009c\7\31\2\2\u009c\u009d\7)\2\2\u009d\u009e\5\62\32\2\u009e\u009f"+
		"\7*\2\2\u009f\u00a0\7\'\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00ac\7(\2\2\u00a2"+
		"\u00a3\7\32\2\2\u00a3\u00a4\7)\2\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6\7"+
		"*\2\2\u00a6\u00a7\7\'\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9\7(\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\33\2\2\u00b0\u00b1\7\'\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3\7"+
		"(\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\b\b\1\2\u00b7\17\3\2\2\2\u00b8\u00b9\7\n\2"+
		"\2\u00b9\u00bc\7)\2\2\u00ba\u00bd\5\30\r\2\u00bb\u00bd\5\30\r\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\62"+
		"\2\2\u00bf\u00c0\5\62\32\2\u00c0\u00c3\7\62\2\2\u00c1\u00c4\5\62\32\2"+
		"\u00c2\u00c4\5\62\32\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\7*\2\2\u00c6\u00c7\7\'\2\2\u00c7\u00c8\5\4\3\2\u00c8"+
		"\u00c9\7(\2\2\u00c9\u00ca\b\t\1\2\u00ca\21\3\2\2\2\u00cb\u00cc\5\30\r"+
		"\2\u00cc\u00cd\b\n\1\2\u00cd\23\3\2\2\2\u00ce\u00cf\5\62\32\2\u00cf\u00d0"+
		"\b\13\1\2\u00d0\25\3\2\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\b\f\1\2\u00d3"+
		"\27\3\2\2\2\u00d4\u00d5\5@!\2\u00d5\u00d6\7\35\2\2\u00d6\u00d7\7,\2\2"+
		"\u00d7\u00d8\5\62\32\2\u00d8\u00d9\7\62\2\2\u00d9\u00da\b\r\1\2\u00da"+
		"\31\3\2\2\2\u00db\u00dc\7\35\2\2\u00dc\u00dd\b\16\1\2\u00dd\33\3\2\2\2"+
		"\u00de\u00df\5R*\2\u00df\u00e6\b\17\1\2\u00e0\u00e1\7+\2\2\u00e1\u00e2"+
		"\5R*\2\u00e2\u00e3\b\17\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\35\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\7\35\2\2\u00eb"+
		"\u00ec\7\63\2\2\u00ec\u00ed\5@!\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\7%\2"+
		"\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\7\62\2\2\u00f2"+
		"\u00f3\b\20\1\2\u00f3\37\3\2\2\2\u00f4\u00f9\5T+\2\u00f5\u00f6\7+\2\2"+
		"\u00f6\u00f8\5T+\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\b\21\1\2\u00fd!\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\7\35\2"+
		"\2\u0100\u0101\7\63\2\2\u0101\u0102\5@!\2\u0102\u0103\7,\2\2\u0103\u0104"+
		"\5$\23\2\u0104\u0105\7\62\2\2\u0105\u0106\b\22\1\2\u0106#\3\2\2\2\u0107"+
		"\u0108\7%\2\2\u0108\u010d\5&\24\2\u0109\u010a\7+\2\2\u010a\u010c\5&\24"+
		"\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7&\2\2\u0111"+
		"\u0112\b\23\1\2\u0112%\3\2\2\2\u0113\u0114\7%\2\2\u0114\u0115\5N(\2\u0115"+
		"\u0116\7&\2\2\u0116\u0117\b\24\1\2\u0117\'\3\2\2\2\u0118\u0119\7\r\2\2"+
		"\u0119\u011a\7\35\2\2\u011a\u011b\7,\2\2\u011b\u011c\7\16\2\2\u011c\u011d"+
		"\7\r\2\2\u011d\u011e\7\62\2\2\u011e\u011f\b\25\1\2\u011f)\3\2\2\2\u0120"+
		"\u0121\7\35\2\2\u0121\u0122\7\65\2\2\u0122\u0123\7\17\2\2\u0123\u0124"+
		"\7)\2\2\u0124\u0125\5\62\32\2\u0125\u0126\7*\2\2\u0126\u0127\7\62\2\2"+
		"\u0127\u0128\b\26\1\2\u0128+\3\2\2\2\u0129\u012a\7\35\2\2\u012a\u012b"+
		"\7\65\2\2\u012b\u012c\7\20\2\2\u012c\u012d\7)\2\2\u012d\u012e\7*\2\2\u012e"+
		"\u012f\7\62\2\2\u012f\u0130\b\27\1\2\u0130-\3\2\2\2\u0131\u0132\t\2\2"+
		"\2\u0132/\3\2\2\2\u0133\u0134\5\62\32\2\u0134\u0135\7\62\2\2\u0135\u0136"+
		"\b\31\1\2\u0136\61\3\2\2\2\u0137\u013c\5\64\33\2\u0138\u0139\5.\30\2\u0139"+
		"\u013a\5\64\33\2\u013a\u013b\b\32\1\2\u013b\u013d\3\2\2\2\u013c\u0138"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\63\3\2\2\2\u013e\u0143\5\66\34\2\u013f"+
		"\u0140\7.\2\2\u0140\u0142\5\66\34\2\u0141\u013f\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\65\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u014b\58\35\2\u0147\u0148\7-\2\2\u0148\u014a\58\35"+
		"\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\67\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\7/\2\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\5:"+
		"\36\2\u01529\3\2\2\2\u0153\u015a\5<\37\2\u0154\u0155\7\"\2\2\u0155\u0156"+
		"\5<\37\2\u0156\u0157\b\36\1\2\u0157\u0159\3\2\2\2\u0158\u0154\3\2\2\2"+
		"\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b;\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015d\u0164\5> \2\u015e\u015f\7#\2\2\u015f"+
		"\u0160\5> \2\u0160\u0161\b\37\1\2\u0161\u0163\3\2\2\2\u0162\u015e\3\2"+
		"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"=\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\36\2\2\u0168\u0176\b \1\2"+
		"\u0169\u016a\7\35\2\2\u016a\u0176\b \1\2\u016b\u016c\7\37\2\2\u016c\u0176"+
		"\b \1\2\u016d\u016e\7!\2\2\u016e\u0176\b \1\2\u016f\u0170\7)\2\2\u0170"+
		"\u0171\5\62\32\2\u0171\u0172\7*\2\2\u0172\u0176\3\2\2\2\u0173\u0174\7"+
		" \2\2\u0174\u0176\b \1\2\u0175\u0167\3\2\2\2\u0175\u0169\3\2\2\2\u0175"+
		"\u016b\3\2\2\2\u0175\u016d\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176?\3\2\2\2\u0177\u0178\t\3\2\2\u0178A\3\2\2\2\u0179\u017c\5@"+
		"!\2\u017a\u017c\7\f\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"C\3\2\2\2\u017d\u017e\7\36\2\2\u017eE\3\2\2\2\u017f\u0180\7\36\2\2\u0180"+
		"G\3\2\2\2\u0181\u0182\7\36\2\2\u0182I\3\2\2\2\u0183\u0184\7\35\2\2\u0184"+
		"\u0185\7,\2\2\u0185\u0186\7%\2\2\u0186\u0187\5N(\2\u0187\u0188\7&\2\2"+
		"\u0188K\3\2\2\2\u0189\u018a\7\35\2\2\u018a\u018b\7,\2\2\u018b\u018c\7"+
		"%\2\2\u018c\u018d\5P)\2\u018d\u018e\7&\2\2\u018eM\3\2\2\2\u018f\u0190"+
		"\5R*\2\u0190\u0197\b(\1\2\u0191\u0192\7+\2\2\u0192\u0193\5R*\2\u0193\u0194"+
		"\b(\1\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198O\3\2\2\2\u0199\u0197\3\2\2\2"+
		"\u019a\u019f\5T+\2\u019b\u019c\7+\2\2\u019c\u019e\5T+\2\u019d\u019b\3"+
		"\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b)\1\2\u01a3Q\3\2\2\2\u01a4"+
		"\u01a5\7\36\2\2\u01a5\u01b7\b*\1\2\u01a6\u01a7\7\35\2\2\u01a7\u01b7\b"+
		"*\1\2\u01a8\u01a9\7\37\2\2\u01a9\u01b7\b*\1\2\u01aa\u01ab\7!\2\2\u01ab"+
		"\u01b7\b*\1\2\u01ac\u01ad\7%\2\2\u01ad\u01ae\5 \21\2\u01ae\u01af\7&\2"+
		"\2\u01af\u01b7\3\2\2\2\u01b0\u01b1\7)\2\2\u01b1\u01b2\5\62\32\2\u01b2"+
		"\u01b3\7*\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b5\7 \2\2\u01b5\u01b7\b*\1"+
		"\2\u01b6\u01a4\3\2\2\2\u01b6\u01a6\3\2\2\2\u01b6\u01a8\3\2\2\2\u01b6\u01aa"+
		"\3\2\2\2\u01b6\u01ac\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"S\3\2\2\2\u01b8\u01b9\7%\2\2\u01b9\u01ba\5N(\2\u01ba\u01bb\7&\2\2\u01bb"+
		"\u01bc\b+\1\2\u01bcU\3\2\2\2\30Y{\u0083\u0098\u00ac\u00b4\u00bc\u00c3"+
		"\u00e6\u00f9\u010d\u013c\u0143\u014b\u014f\u015a\u0164\u0175\u017b\u0197"+
		"\u019f\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}