// Generated from c:/Users/ItalloMonteiro/OneDrive - ML SOLUCOES DE VAREJO S.A/Área de Trabalho/faculdade/projeto-linguagem-compiladores/DataLang.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, ID=26, INT=27, WS=28;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_vectorDeclaration = 3, 
		RULE_matrixDeclaration = 4, RULE_stackDeclaration = 5, RULE_pushOperation = 6, 
		RULE_popOperation = 7, RULE_expressionStatement = 8, RULE_expression = 9, 
		RULE_scalarType = 10, RULE_type = 11, RULE_size = 12, RULE_numRows = 13, 
		RULE_numCols = 14, RULE_vectorExpression = 15, RULE_matrixExpression = 16, 
		RULE_elements = 17, RULE_matrixElements = 18, RULE_element = 19, RULE_matrixElement = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "vectorDeclaration", "matrixDeclaration", 
			"stackDeclaration", "pushOperation", "popOperation", "expressionStatement", 
			"expression", "scalarType", "type", "size", "numRows", "numCols", "vectorExpression", 
			"matrixExpression", "elements", "matrixElements", "element", "matrixElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'vector'", "':'", "'['", "']'", "'matrix'", "'stack'", 
			"'new'", "'.'", "'push'", "'('", "')'", "'pop'", "'+'", "'-'", "'int'", 
			"'boolean'", "'str'", "'float'", "'double'", "'int32'", "'int64'", "'long'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(42);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(47);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				vectorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				matrixDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				stackDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				pushOperation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				popOperation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				expressionStatement();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			scalarType();
			setState(59);
			match(ID);
			setState(60);
			match(T__0);
			setState(61);
			expression(0);
			setState(62);
			match(T__1);
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
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public VectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorDeclaration; }
	}

	public final VectorDeclarationContext vectorDeclaration() throws RecognitionException {
		VectorDeclarationContext _localctx = new VectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
			match(ID);
			setState(66);
			match(T__3);
			setState(67);
			type();
			setState(68);
			match(T__4);
			setState(69);
			size();
			setState(70);
			match(T__5);
			setState(71);
			match(T__0);
			setState(72);
			match(T__4);
			setState(73);
			elements();
			setState(74);
			match(T__5);
			setState(75);
			match(T__1);
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
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NumRowsContext numRows() {
			return getRuleContext(NumRowsContext.class,0);
		}
		public NumColsContext numCols() {
			return getRuleContext(NumColsContext.class,0);
		}
		public MatrixElementsContext matrixElements() {
			return getRuleContext(MatrixElementsContext.class,0);
		}
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrixDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(78);
			match(ID);
			setState(79);
			match(T__3);
			setState(80);
			type();
			setState(81);
			match(T__4);
			setState(82);
			numRows();
			setState(83);
			match(T__5);
			setState(84);
			match(T__4);
			setState(85);
			numCols();
			setState(86);
			match(T__5);
			setState(87);
			match(T__0);
			setState(88);
			match(T__4);
			setState(89);
			matrixElements();
			setState(90);
			match(T__5);
			setState(91);
			match(T__1);
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
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public StackDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackDeclaration; }
	}

	public final StackDeclarationContext stackDeclaration() throws RecognitionException {
		StackDeclarationContext _localctx = new StackDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stackDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__7);
			setState(94);
			match(ID);
			setState(95);
			match(T__0);
			setState(96);
			match(T__8);
			setState(97);
			match(T__7);
			setState(98);
			match(T__1);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PushOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushOperation; }
	}

	public final PushOperationContext pushOperation() throws RecognitionException {
		PushOperationContext _localctx = new PushOperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pushOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(T__9);
			setState(102);
			match(T__10);
			setState(103);
			match(T__11);
			setState(104);
			expression(0);
			setState(105);
			match(T__12);
			setState(106);
			match(T__1);
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
		public PopOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popOperation; }
	}

	public final PopOperationContext popOperation() throws RecognitionException {
		PopOperationContext _localctx = new PopOperationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_popOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(T__9);
			setState(110);
			match(T__13);
			setState(111);
			match(T__11);
			setState(112);
			match(T__12);
			setState(113);
			match(T__1);
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
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expression(0);
			setState(116);
			match(T__1);
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
		public TerminalNode ID() { return getToken(DataLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(DataLangParser.INT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VectorExpressionContext vectorExpression() {
			return getRuleContext(VectorExpressionContext.class,0);
		}
		public MatrixExpressionContext matrixExpression() {
			return getRuleContext(MatrixExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(119);
				match(ID);
				}
				break;
			case 3:
				{
				setState(120);
				match(INT);
				}
				break;
			case 4:
				{
				setState(121);
				match(T__11);
				setState(122);
				expression(0);
				setState(123);
				match(T__12);
				}
				break;
			case 5:
				{
				setState(125);
				vectorExpression();
				}
				break;
			case 6:
				{
				setState(126);
				matrixExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(130);
						match(T__14);
						setState(131);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						match(T__15);
						setState(134);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScalarTypeContext extends ParserRuleContext {
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_scalarType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33423360L) != 0)) ) {
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				scalarType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__6);
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
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
	}

	public final NumRowsContext numRows() throws RecognitionException {
		NumRowsContext _localctx = new NumRowsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
	}

	public final NumColsContext numCols() throws RecognitionException {
		NumColsContext _localctx = new NumColsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numCols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public VectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorExpression; }
	}

	public final VectorExpressionContext vectorExpression() throws RecognitionException {
		VectorExpressionContext _localctx = new VectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(T__0);
			setState(154);
			match(T__4);
			setState(155);
			elements();
			setState(156);
			match(T__5);
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
		public MatrixElementsContext matrixElements() {
			return getRuleContext(MatrixElementsContext.class,0);
		}
		public MatrixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixExpression; }
	}

	public final MatrixExpressionContext matrixExpression() throws RecognitionException {
		MatrixExpressionContext _localctx = new MatrixExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_matrixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(T__0);
			setState(160);
			match(T__4);
			setState(161);
			matrixElements();
			setState(162);
			match(T__5);
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
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			element();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(165);
				match(T__24);
				setState(166);
				element();
				}
				}
				setState(171);
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
		public MatrixElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixElements; }
	}

	public final MatrixElementsContext matrixElements() throws RecognitionException {
		MatrixElementsContext _localctx = new MatrixElementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matrixElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			matrixElement();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(173);
				match(T__24);
				setState(174);
				matrixElement();
				}
				}
				setState(179);
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
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public MatrixElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixElement; }
	}

	public final MatrixElementContext matrixElement() throws RecognitionException {
		MatrixElementContext _localctx = new MatrixElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matrixElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__4);
			setState(183);
			elements();
			setState(184);
			match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004"+
		"\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0080\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0091\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a8"+
		"\b\u0011\n\u0011\f\u0011\u00ab\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00b0\b\u0012\n\u0012\f\u0012\u00b3\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000"+
		"\u0001\u0012\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0001\u0001\u0000\u0011\u0018"+
		"\u00b6\u0000+\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004"+
		":\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bM\u0001\u0000"+
		"\u0000\u0000\n]\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000e"+
		"l\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012\u007f\u0001"+
		"\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u0090\u0001"+
		"\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u0094\u0001"+
		"\u0000\u0000\u0000\u001c\u0096\u0001\u0000\u0000\u0000\u001e\u0098\u0001"+
		"\u0000\u0000\u0000 \u009e\u0001\u0000\u0000\u0000\"\u00a4\u0001\u0000"+
		"\u0000\u0000$\u00ac\u0001\u0000\u0000\u0000&\u00b4\u0001\u0000\u0000\u0000"+
		"(\u00b6\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000\u0001"+
		"0\u0001\u0001\u0000\u0000\u000019\u0003\u0004\u0002\u000029\u0003\u0006"+
		"\u0003\u000039\u0003\b\u0004\u000049\u0003\n\u0005\u000059\u0003\f\u0006"+
		"\u000069\u0003\u000e\u0007\u000079\u0003\u0010\b\u000081\u0001\u0000\u0000"+
		"\u000082\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001\u0000"+
		"\u0000\u000085\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0003\u0014\n\u0000"+
		";<\u0005\u001a\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u0003\u0012\t\u0000"+
		">?\u0005\u0002\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005\u0003"+
		"\u0000\u0000AB\u0005\u001a\u0000\u0000BC\u0005\u0004\u0000\u0000CD\u0003"+
		"\u0016\u000b\u0000DE\u0005\u0005\u0000\u0000EF\u0003\u0018\f\u0000FG\u0005"+
		"\u0006\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u0003\"\u0011\u0000JK\u0005\u0006\u0000\u0000KL\u0005\u0002\u0000\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0005\u001a"+
		"\u0000\u0000OP\u0005\u0004\u0000\u0000PQ\u0003\u0016\u000b\u0000QR\u0005"+
		"\u0005\u0000\u0000RS\u0003\u001a\r\u0000ST\u0005\u0006\u0000\u0000TU\u0005"+
		"\u0005\u0000\u0000UV\u0003\u001c\u000e\u0000VW\u0005\u0006\u0000\u0000"+
		"WX\u0005\u0001\u0000\u0000XY\u0005\u0005\u0000\u0000YZ\u0003$\u0012\u0000"+
		"Z[\u0005\u0006\u0000\u0000[\\\u0005\u0002\u0000\u0000\\\t\u0001\u0000"+
		"\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\u001a\u0000\u0000_`\u0005\u0001"+
		"\u0000\u0000`a\u0005\t\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005\u0002"+
		"\u0000\u0000c\u000b\u0001\u0000\u0000\u0000de\u0005\u001a\u0000\u0000"+
		"ef\u0005\n\u0000\u0000fg\u0005\u000b\u0000\u0000gh\u0005\f\u0000\u0000"+
		"hi\u0003\u0012\t\u0000ij\u0005\r\u0000\u0000jk\u0005\u0002\u0000\u0000"+
		"k\r\u0001\u0000\u0000\u0000lm\u0005\u001a\u0000\u0000mn\u0005\n\u0000"+
		"\u0000no\u0005\u000e\u0000\u0000op\u0005\f\u0000\u0000pq\u0005\r\u0000"+
		"\u0000qr\u0005\u0002\u0000\u0000r\u000f\u0001\u0000\u0000\u0000st\u0003"+
		"\u0012\t\u0000tu\u0005\u0002\u0000\u0000u\u0011\u0001\u0000\u0000\u0000"+
		"v\u0080\u0006\t\uffff\uffff\u0000w\u0080\u0005\u001a\u0000\u0000x\u0080"+
		"\u0005\u001b\u0000\u0000yz\u0005\f\u0000\u0000z{\u0003\u0012\t\u0000{"+
		"|\u0005\r\u0000\u0000|\u0080\u0001\u0000\u0000\u0000}\u0080\u0003\u001e"+
		"\u000f\u0000~\u0080\u0003 \u0010\u0000\u007fv\u0001\u0000\u0000\u0000"+
		"\u007fw\u0001\u0000\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u007fy"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u0080\u0089\u0001\u0000\u0000\u0000\u0081\u0082\n\u0005\u0000"+
		"\u0000\u0082\u0083\u0005\u000f\u0000\u0000\u0083\u0088\u0003\u0012\t\u0006"+
		"\u0084\u0085\n\u0004\u0000\u0000\u0085\u0086\u0005\u0010\u0000\u0000\u0086"+
		"\u0088\u0003\u0012\t\u0005\u0087\u0081\u0001\u0000\u0000\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0013"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0007\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0003\u0014\n\u0000\u008f\u0091\u0005\u0007\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0017\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u001b\u0000\u0000\u0093\u0019\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u001b\u0000\u0000\u0095\u001b\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u001b\u0000\u0000\u0097\u001d\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u001a\u0000\u0000\u0099\u009a\u0005"+
		"\u0001\u0000\u0000\u009a\u009b\u0005\u0005\u0000\u0000\u009b\u009c\u0003"+
		"\"\u0011\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u001f\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f\u00a0\u0005\u0001"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a2\u0003$\u0012"+
		"\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000\u00a3!\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a9\u0003&\u0013\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6"+
		"\u00a8\u0003&\u0013\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa#\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b1\u0003(\u0014\u0000\u00ad\u00ae\u0005\u0019"+
		"\u0000\u0000\u00ae\u00b0\u0003(\u0014\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2%\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001b\u0000\u0000"+
		"\u00b5\'\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000\u00b7"+
		"\u00b8\u0003\"\u0011\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9)"+
		"\u0001\u0000\u0000\u0000\b-8\u007f\u0087\u0089\u0090\u00a9\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}