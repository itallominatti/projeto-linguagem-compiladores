// Generated from DataLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DataLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, FOR=2, VECTOR=3, MATRIX=4, STACK=5, NEW=6, PUSH=7, POP=8, INT_TYPE=9, 
		BOOLEAN_TYPE=10, STRING_TYPE=11, FLOAT_TYPE=12, DOUBLE_TYPE=13, INT32_TYPE=14, 
		INT64_TYPE=15, LONG_TYPE=16, IF=17, ELSE_IF=18, ELSE=19, TERNARY=20, ID=21, 
		INT=22, FLOAT_LITERAL=23, BOOLEAN_LITERAL=24, STRING_LITERAL=25, PLUS=26, 
		MINUS=27, MULTIPLY=28, DIVIDE=29, MODULO=30, OPEN_BRACKET=31, CLOSE_BRACKET=32, 
		OPEN_BRACE=33, CLOSE_BRACE=34, OPEN_PAREN=35, CLOSE_PAREN=36, COMMA=37, 
		ASSIGN=38, LOGICAL_AND=39, LOGICAL_OR=40, LOGICAL_NOT=41, EQUAL=42, NOT_EQUAL=43, 
		GREATER_EQUAL=44, LESS_EQUAL=45, GREATER=46, LESS=47, SEMICOLON=48, COLON=49, 
		WS=50, DOT=51;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ternaryExpression = 2, RULE_conditionalExpression = 3, 
		RULE_printStatement = 4, RULE_ifStatement = 5, RULE_forLoop = 6, RULE_initialization = 7, 
		RULE_condition = 8, RULE_update = 9, RULE_variableDeclaration = 10, RULE_vectorDeclaration = 11, 
		RULE_matrixDeclaration = 12, RULE_stackDeclaration = 13, RULE_pushOperation = 14, 
		RULE_popOperation = 15, RULE_expressionStatement = 16, RULE_expression = 17, 
		RULE_addExpression = 18, RULE_multExpression = 19, RULE_atom = 20, RULE_scalarType = 21, 
		RULE_type = 22, RULE_size = 23, RULE_numRows = 24, RULE_numCols = 25, 
		RULE_vectorExpression = 26, RULE_matrixExpression = 27, RULE_elements = 28, 
		RULE_matrixElements = 29, RULE_element = 30, RULE_matrixElement = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "ternaryExpression", "conditionalExpression", 
			"printStatement", "ifStatement", "forLoop", "initialization", "condition", 
			"update", "variableDeclaration", "vectorDeclaration", "matrixDeclaration", 
			"stackDeclaration", "pushOperation", "popOperation", "expressionStatement", 
			"expression", "addExpression", "multExpression", "atom", "scalarType", 
			"type", "size", "numRows", "numCols", "vectorExpression", "matrixExpression", 
			"elements", "matrixElements", "element", "matrixElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'for'", "'vector'", "'matrix'", "'stack'", "'new'", 
			"'push'", "'pop'", "'int'", "'boolean'", "'str'", "'float'", "'double'", 
			"'int32'", "'int64'", "'long'", "'if'", "'else if'", "'else'", "'?'", 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "','", "'='", "'&&'", "'||'", "'!'", 
			"'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "';'", "':'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "FOR", "VECTOR", "MATRIX", "STACK", "NEW", "PUSH", "POP", 
			"INT_TYPE", "BOOLEAN_TYPE", "STRING_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", 
			"INT32_TYPE", "INT64_TYPE", "LONG_TYPE", "IF", "ELSE_IF", "ELSE", "TERNARY", 
			"ID", "INT", "FLOAT_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "COMMA", "ASSIGN", 
			"LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "EQUAL", "NOT_EQUAL", "GREATER_EQUAL", 
			"LESS_EQUAL", "GREATER", "LESS", "SEMICOLON", "COLON", "WS", "DOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DataLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DataLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34425011774L) != 0) );
			setState(69);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VectorDeclarationContext vectorDeclaration() {
			return getRuleContext(VectorDeclarationContext.class,0);
		}
		public MatrixDeclarationContext matrixDeclaration() {
			return getRuleContext(MatrixDeclarationContext.class,0);
		}
		public StackDeclarationContext stackDeclaration() {
			return getRuleContext(StackDeclarationContext.class,0);
		}
		public PushOperationContext pushOperation() {
			return getRuleContext(PushOperationContext.class,0);
		}
		public PopOperationContext popOperation() {
			return getRuleContext(PopOperationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				vectorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				matrixDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				stackDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				pushOperation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				popOperation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				expressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				forLoop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				printStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode TERNARY() { return getToken(DataLangParser.TERNARY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(DataLangParser.COLON, 0); }
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
			setState(83);
			conditionalExpression();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERNARY) {
				{
				setState(84);
				match(TERNARY);
				setState(85);
				expression();
				setState(86);
				match(COLON);
				setState(87);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
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
			setState(91);
			addExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DataLangParser.PRINT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
			setState(93);
			match(PRINT);
			setState(94);
			match(OPEN_PAREN);
			setState(95);
			expression();
			setState(96);
			match(CLOSE_PAREN);
			setState(97);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DataLangParser.IF, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(DataLangParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(DataLangParser.OPEN_PAREN, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(DataLangParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(DataLangParser.CLOSE_PAREN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(DataLangParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(DataLangParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(DataLangParser.ELSE, 0); }
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
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IF);
			setState(100);
			match(OPEN_PAREN);
			setState(101);
			condition();
			setState(102);
			match(CLOSE_PAREN);
			setState(103);
			statement();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(ELSE_IF);
					setState(105);
					match(OPEN_PAREN);
					setState(106);
					condition();
					setState(107);
					match(CLOSE_PAREN);
					setState(108);
					statement();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(115);
				match(ELSE);
				setState(116);
				statement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DataLangParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DataLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DataLangParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FOR);
			setState(120);
			match(OPEN_PAREN);
			setState(121);
			initialization();
			setState(122);
			match(SEMICOLON);
			setState(123);
			condition();
			setState(124);
			match(SEMICOLON);
			setState(125);
			update();
			setState(126);
			match(CLOSE_PAREN);
			setState(127);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			variableDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
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
		enterRule(_localctx, 16, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
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
		enterRule(_localctx, 18, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			scalarType();
			setState(136);
			match(ID);
			setState(137);
			match(ASSIGN);
			setState(138);
			expression();
			setState(139);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VectorDeclarationContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(DataLangParser.VECTOR, 0); }
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DataLangParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(DataLangParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(DataLangParser.OPEN_BRACKET, i);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(DataLangParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(DataLangParser.CLOSE_BRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 22, RULE_vectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(VECTOR);
			setState(142);
			match(ID);
			setState(143);
			match(COLON);
			setState(144);
			type();
			setState(145);
			match(OPEN_BRACKET);
			setState(146);
			size();
			setState(147);
			match(CLOSE_BRACKET);
			setState(148);
			match(ASSIGN);
			setState(149);
			match(OPEN_BRACKET);
			setState(150);
			elements();
			setState(151);
			match(CLOSE_BRACKET);
			setState(152);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixDeclarationContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(DataLangParser.MATRIX, 0); }
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DataLangParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(DataLangParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(DataLangParser.OPEN_BRACKET, i);
		}
		public NumRowsContext numRows() {
			return getRuleContext(NumRowsContext.class,0);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(DataLangParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(DataLangParser.CLOSE_BRACKET, i);
		}
		public NumColsContext numCols() {
			return getRuleContext(NumColsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public MatrixElementsContext matrixElements() {
			return getRuleContext(MatrixElementsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 24, RULE_matrixDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(MATRIX);
			setState(155);
			match(ID);
			setState(156);
			match(COLON);
			setState(157);
			type();
			setState(158);
			match(OPEN_BRACKET);
			setState(159);
			numRows();
			setState(160);
			match(CLOSE_BRACKET);
			setState(161);
			match(OPEN_BRACKET);
			setState(162);
			numCols();
			setState(163);
			match(CLOSE_BRACKET);
			setState(164);
			match(ASSIGN);
			setState(165);
			match(OPEN_BRACKET);
			setState(166);
			matrixElements();
			setState(167);
			match(CLOSE_BRACKET);
			setState(168);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StackDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> STACK() { return getTokens(DataLangParser.STACK); }
		public TerminalNode STACK(int i) {
			return getToken(DataLangParser.STACK, i);
		}
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DataLangParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(DataLangParser.NEW, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 26, RULE_stackDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(STACK);
			setState(171);
			match(ID);
			setState(172);
			match(ASSIGN);
			setState(173);
			match(NEW);
			setState(174);
			match(STACK);
			setState(175);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushOperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(DataLangParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(DataLangParser.PUSH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 28, RULE_pushOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(DOT);
			setState(179);
			match(PUSH);
			setState(180);
			match(OPEN_PAREN);
			setState(181);
			expression();
			setState(182);
			match(CLOSE_PAREN);
			setState(183);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PopOperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode DOT() { return getToken(DataLangParser.DOT, 0); }
		public TerminalNode POP() { return getToken(DataLangParser.POP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 30, RULE_popOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(186);
			match(DOT);
			setState(187);
			match(POP);
			setState(188);
			match(OPEN_PAREN);
			setState(189);
			match(CLOSE_PAREN);
			setState(190);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DataLangParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 32, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression();
			setState(193);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			addExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ParserRuleContext {
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(DataLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(DataLangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DataLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DataLangParser.MINUS, i);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataLangListener ) ((DataLangListener)listener).exitAddExpression(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			multExpression();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(198);
					match(PLUS);
					setState(199);
					multExpression();
					}
					break;
				case MINUS:
					{
					setState(200);
					match(MINUS);
					setState(201);
					multExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultExpressionContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(DataLangParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(DataLangParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(DataLangParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(DataLangParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(DataLangParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(DataLangParser.MODULO, i);
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
		enterRule(_localctx, 38, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			atom();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) {
				{
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLY:
					{
					setState(208);
					match(MULTIPLY);
					setState(209);
					atom();
					}
					break;
				case DIVIDE:
					{
					setState(210);
					match(DIVIDE);
					setState(211);
					atom();
					}
					break;
				case MODULO:
					{
					setState(212);
					match(MODULO);
					setState(213);
					atom();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(218);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(DataLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DataLangParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(DataLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DataLangParser.CLOSE_PAREN, 0); }
		public VectorExpressionContext vectorExpression() {
			return getRuleContext(VectorExpressionContext.class,0);
		}
		public MatrixExpressionContext matrixExpression() {
			return getRuleContext(MatrixExpressionContext.class,0);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DataLangParser.BOOLEAN_LITERAL, 0); }
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
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(FLOAT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(OPEN_PAREN);
				setState(224);
				expression();
				setState(225);
				match(CLOSE_PAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				vectorExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				matrixExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				match(BOOLEAN_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(DataLangParser.INT_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(DataLangParser.BOOLEAN_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(DataLangParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(DataLangParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(DataLangParser.DOUBLE_TYPE, 0); }
		public TerminalNode INT32_TYPE() { return getToken(DataLangParser.INT32_TYPE, 0); }
		public TerminalNode INT64_TYPE() { return getToken(DataLangParser.INT64_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(DataLangParser.LONG_TYPE, 0); }
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
		enterRule(_localctx, 42, RULE_scalarType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(236);
			_errHandler.sync(this);
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
				setState(234);
				scalarType();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(MATRIX);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 46, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 48, RULE_numRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 50, RULE_numCols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 52, RULE_vectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ID);
			setState(245);
			match(ASSIGN);
			setState(246);
			match(OPEN_BRACKET);
			setState(247);
			elements();
			setState(248);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 54, RULE_matrixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ID);
			setState(251);
			match(ASSIGN);
			setState(252);
			match(OPEN_BRACKET);
			setState(253);
			matrixElements();
			setState(254);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
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
		enterRule(_localctx, 56, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			element();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				element();
				}
				}
				setState(263);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixElementsContext extends ParserRuleContext {
		public List<MatrixElementContext> matrixElement() {
			return getRuleContexts(MatrixElementContext.class);
		}
		public MatrixElementContext matrixElement(int i) {
			return getRuleContext(MatrixElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataLangParser.COMMA); }
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
		enterRule(_localctx, 58, RULE_matrixElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			matrixElement();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				matrixElement();
				}
				}
				setState(271);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
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
		enterRule(_localctx, 60, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixElementContext extends ParserRuleContext {
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
		enterRule(_localctx, 62, RULE_matrixElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(OPEN_BRACKET);
			setState(275);
			elements();
			setState(276);
			match(CLOSE_BRACKET);
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
		"\u0004\u00013\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0004\u0000B\b\u0000\u000b\u0000"+
		"\f\u0000C\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001R\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00cb\b\u0012\n\u0012\f\u0012"+
		"\u00ce\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00d7\b\u0013\n\u0013\f\u0013\u00da"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00e7\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00ed\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0104"+
		"\b\u001c\n\u001c\f\u001c\u0107\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u010c\b\u001d\n\u001d\f\u001d\u010f\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0000"+
		"\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0001\u0001\u0000\t\u0010\u0112"+
		"\u0000A\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004S"+
		"\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\b]\u0001\u0000"+
		"\u0000\u0000\nc\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e"+
		"\u0081\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012"+
		"\u0085\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016"+
		"\u008d\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a"+
		"\u00aa\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e"+
		"\u00b9\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00c3"+
		"\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000&\u00cf\u0001\u0000"+
		"\u0000\u0000(\u00e6\u0001\u0000\u0000\u0000*\u00e8\u0001\u0000\u0000\u0000"+
		",\u00ec\u0001\u0000\u0000\u0000.\u00ee\u0001\u0000\u0000\u00000\u00f0"+
		"\u0001\u0000\u0000\u00002\u00f2\u0001\u0000\u0000\u00004\u00f4\u0001\u0000"+
		"\u0000\u00006\u00fa\u0001\u0000\u0000\u00008\u0100\u0001\u0000\u0000\u0000"+
		":\u0108\u0001\u0000\u0000\u0000<\u0110\u0001\u0000\u0000\u0000>\u0112"+
		"\u0001\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005\u0000\u0000\u0001F\u0001"+
		"\u0001\u0000\u0000\u0000GR\u0003\u0014\n\u0000HR\u0003\u0016\u000b\u0000"+
		"IR\u0003\u0018\f\u0000JR\u0003\u001a\r\u0000KR\u0003\u001c\u000e\u0000"+
		"LR\u0003\u001e\u000f\u0000MR\u0003 \u0010\u0000NR\u0003\f\u0006\u0000"+
		"OR\u0003\n\u0005\u0000PR\u0003\b\u0004\u0000QG\u0001\u0000\u0000\u0000"+
		"QH\u0001\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000QJ\u0001\u0000\u0000"+
		"\u0000QK\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000QM\u0001\u0000"+
		"\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000R\u0003\u0001\u0000\u0000\u0000SY\u0003\u0006\u0003"+
		"\u0000TU\u0005\u0014\u0000\u0000UV\u0003\"\u0011\u0000VW\u00051\u0000"+
		"\u0000WX\u0003\"\u0011\u0000XZ\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[\\\u0003"+
		"$\u0012\u0000\\\u0007\u0001\u0000\u0000\u0000]^\u0005\u0001\u0000\u0000"+
		"^_\u0005#\u0000\u0000_`\u0003\"\u0011\u0000`a\u0005$\u0000\u0000ab\u0005"+
		"0\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005\u0011\u0000\u0000de\u0005"+
		"#\u0000\u0000ef\u0003\u0010\b\u0000fg\u0005$\u0000\u0000gp\u0003\u0002"+
		"\u0001\u0000hi\u0005\u0012\u0000\u0000ij\u0005#\u0000\u0000jk\u0003\u0010"+
		"\b\u0000kl\u0005$\u0000\u0000lm\u0003\u0002\u0001\u0000mo\u0001\u0000"+
		"\u0000\u0000nh\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qu\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000st\u0005\u0013\u0000\u0000tv\u0003\u0002\u0001"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u000b\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0002\u0000\u0000xy\u0005#\u0000\u0000yz\u0003"+
		"\u000e\u0007\u0000z{\u00050\u0000\u0000{|\u0003\u0010\b\u0000|}\u0005"+
		"0\u0000\u0000}~\u0003\u0012\t\u0000~\u007f\u0005$\u0000\u0000\u007f\u0080"+
		"\u0003\u0002\u0001\u0000\u0080\r\u0001\u0000\u0000\u0000\u0081\u0082\u0003"+
		"\u0014\n\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0003\""+
		"\u0011\u0000\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086\u0003\"\u0011"+
		"\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0003*\u0015\u0000"+
		"\u0088\u0089\u0005\u0015\u0000\u0000\u0089\u008a\u0005&\u0000\u0000\u008a"+
		"\u008b\u0003\"\u0011\u0000\u008b\u008c\u00050\u0000\u0000\u008c\u0015"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003\u0000\u0000\u008e\u008f"+
		"\u0005\u0015\u0000\u0000\u008f\u0090\u00051\u0000\u0000\u0090\u0091\u0003"+
		",\u0016\u0000\u0091\u0092\u0005\u001f\u0000\u0000\u0092\u0093\u0003.\u0017"+
		"\u0000\u0093\u0094\u0005 \u0000\u0000\u0094\u0095\u0005&\u0000\u0000\u0095"+
		"\u0096\u0005\u001f\u0000\u0000\u0096\u0097\u00038\u001c\u0000\u0097\u0098"+
		"\u0005 \u0000\u0000\u0098\u0099\u00050\u0000\u0000\u0099\u0017\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b\u009c\u0005\u0015"+
		"\u0000\u0000\u009c\u009d\u00051\u0000\u0000\u009d\u009e\u0003,\u0016\u0000"+
		"\u009e\u009f\u0005\u001f\u0000\u0000\u009f\u00a0\u00030\u0018\u0000\u00a0"+
		"\u00a1\u0005 \u0000\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a3"+
		"\u00032\u0019\u0000\u00a3\u00a4\u0005 \u0000\u0000\u00a4\u00a5\u0005&"+
		"\u0000\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000\u00a6\u00a7\u0003:\u001d"+
		"\u0000\u00a7\u00a8\u0005 \u0000\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9"+
		"\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0005\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ad\u0005&\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0006\u0000\u0000\u00ae\u00af\u0005\u0005\u0000\u0000\u00af\u00b0"+
		"\u00050\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0015\u0000\u0000\u00b2\u00b3\u00053\u0000\u0000\u00b3\u00b4\u0005\u0007"+
		"\u0000\u0000\u00b4\u00b5\u0005#\u0000\u0000\u00b5\u00b6\u0003\"\u0011"+
		"\u0000\u00b6\u00b7\u0005$\u0000\u0000\u00b7\u00b8\u00050\u0000\u0000\u00b8"+
		"\u001d\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000\u0000\u00ba"+
		"\u00bb\u00053\u0000\u0000\u00bb\u00bc\u0005\b\u0000\u0000\u00bc\u00bd"+
		"\u0005#\u0000\u0000\u00bd\u00be\u0005$\u0000\u0000\u00be\u00bf\u00050"+
		"\u0000\u0000\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003\"\u0011"+
		"\u0000\u00c1\u00c2\u00050\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0003$\u0012\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5\u00cc\u0003"+
		"&\u0013\u0000\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7\u00cb\u0003&\u0013"+
		"\u0000\u00c8\u00c9\u0005\u001b\u0000\u0000\u00c9\u00cb\u0003&\u0013\u0000"+
		"\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd%\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d8\u0003(\u0014\u0000\u00d0\u00d1"+
		"\u0005\u001c\u0000\u0000\u00d1\u00d7\u0003(\u0014\u0000\u00d2\u00d3\u0005"+
		"\u001d\u0000\u0000\u00d3\u00d7\u0003(\u0014\u0000\u00d4\u00d5\u0005\u001e"+
		"\u0000\u0000\u00d5\u00d7\u0003(\u0014\u0000\u00d6\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\'\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00e7\u0005\u0015\u0000\u0000"+
		"\u00dc\u00e7\u0005\u0016\u0000\u0000\u00dd\u00e7\u0005\u0017\u0000\u0000"+
		"\u00de\u00e7\u0005\u0019\u0000\u0000\u00df\u00e0\u0005#\u0000\u0000\u00e0"+
		"\u00e1\u0003\"\u0011\u0000\u00e1\u00e2\u0005$\u0000\u0000\u00e2\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e7\u00034\u001a\u0000\u00e4\u00e7\u0003"+
		"6\u001b\u0000\u00e5\u00e7\u0005\u0018\u0000\u0000\u00e6\u00db\u0001\u0000"+
		"\u0000\u0000\u00e6\u00dc\u0001\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e6\u00de\u0001\u0000\u0000\u0000\u00e6\u00df\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7)\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0007\u0000\u0000\u0000\u00e9+\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ed\u0003*\u0015\u0000\u00eb\u00ed\u0005\u0004\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"-\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0016\u0000\u0000\u00ef/\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u0016\u0000\u0000\u00f11\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0005\u0016\u0000\u0000\u00f33\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0015\u0000\u0000\u00f5\u00f6\u0005&\u0000\u0000"+
		"\u00f6\u00f7\u0005\u001f\u0000\u0000\u00f7\u00f8\u00038\u001c\u0000\u00f8"+
		"\u00f9\u0005 \u0000\u0000\u00f95\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0015\u0000\u0000\u00fb\u00fc\u0005&\u0000\u0000\u00fc\u00fd\u0005\u001f"+
		"\u0000\u0000\u00fd\u00fe\u0003:\u001d\u0000\u00fe\u00ff\u0005 \u0000\u0000"+
		"\u00ff7\u0001\u0000\u0000\u0000\u0100\u0105\u0003<\u001e\u0000\u0101\u0102"+
		"\u0005%\u0000\u0000\u0102\u0104\u0003<\u001e\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u01069\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010d\u0003>\u001f\u0000"+
		"\u0109\u010a\u0005%\u0000\u0000\u010a\u010c\u0003>\u001f\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e;\u0001"+
		"\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"\u0016\u0000\u0000\u0111=\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u001f"+
		"\u0000\u0000\u0113\u0114\u00038\u001c\u0000\u0114\u0115\u0005 \u0000\u0000"+
		"\u0115?\u0001\u0000\u0000\u0000\rCQYpu\u00ca\u00cc\u00d6\u00d8\u00e6\u00ec"+
		"\u0105\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}