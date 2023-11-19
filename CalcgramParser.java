// Generated from calculator/src/main/antlr/org/example/Calcgram.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalcgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQQ=1, OPERATION=2, OPEN=3, CLOSE=4, ID=5, INT=6, EQUAL=7;
	public static final int
		RULE_s = 0, RULE_e = 1, RULE_a = 2, RULE_operation = 3, RULE_id = 4, RULE_int = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "e", "a", "operation", "id", "int"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, "'('", "')'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQQ", "OPERATION", "OPEN", "CLOSE", "ID", "INT", "EQUAL"
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
	public String getGrammarFileName() { return "Calcgram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode EQQ() { return getToken(CalcgramParser.EQQ, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcgramVisitor ) return ((CalcgramVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(12);
				a();
				setState(13);
				match(EQQ);
				}
				break;
			case 2:
				{
				setState(15);
				e();
				setState(16);
				match(EQQ);
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
	public static class EContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(CalcgramParser.OPEN, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(CalcgramParser.CLOSE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcgramVisitor ) return ((CalcgramVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(20);
				id();
				}
				break;
			case 2:
				{
				setState(21);
				int_();
				}
				break;
			case 3:
				{
				setState(22);
				match(OPEN);
				setState(23);
				e();
				setState(24);
				match(CLOSE);
				}
				break;
			case 4:
				{
				setState(26);
				id();
				setState(27);
				operation();
				setState(28);
				e();
				}
				break;
			case 5:
				{
				setState(30);
				int_();
				setState(31);
				operation();
				setState(32);
				e();
				}
				break;
			case 6:
				{
				setState(34);
				match(OPEN);
				setState(35);
				e();
				setState(36);
				match(CLOSE);
				setState(37);
				operation();
				setState(38);
				e();
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
	public static class AContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CalcgramParser.EQUAL, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcgramVisitor ) return ((CalcgramVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			id();
			setState(43);
			match(EQUAL);
			setState(44);
			e();
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OPERATION() { return getToken(CalcgramParser.OPERATION, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcgramVisitor ) return ((CalcgramVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(OPERATION);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalcgramParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcgramVisitor ) return ((CalcgramVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
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
	public static class IntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CalcgramParser.INT, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcgramListener ) ((CalcgramListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcgramVisitor ) return ((CalcgramVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00075\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u00004\u0000"+
		"\u0012\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001"+
		"\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000"+
		"\u0000\n2\u0001\u0000\u0000\u0000\f\r\u0003\u0004\u0002\u0000\r\u000e"+
		"\u0005\u0001\u0000\u0000\u000e\u0013\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0003\u0002\u0001\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011\u0013"+
		"\u0001\u0000\u0000\u0000\u0012\f\u0001\u0000\u0000\u0000\u0012\u000f\u0001"+
		"\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014)\u0003\b"+
		"\u0004\u0000\u0015)\u0003\n\u0005\u0000\u0016\u0017\u0005\u0003\u0000"+
		"\u0000\u0017\u0018\u0003\u0002\u0001\u0000\u0018\u0019\u0005\u0004\u0000"+
		"\u0000\u0019)\u0001\u0000\u0000\u0000\u001a\u001b\u0003\b\u0004\u0000"+
		"\u001b\u001c\u0003\u0006\u0003\u0000\u001c\u001d\u0003\u0002\u0001\u0000"+
		"\u001d)\u0001\u0000\u0000\u0000\u001e\u001f\u0003\n\u0005\u0000\u001f"+
		" \u0003\u0006\u0003\u0000 !\u0003\u0002\u0001\u0000!)\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0003\u0000\u0000#$\u0003\u0002\u0001\u0000$%\u0005\u0004"+
		"\u0000\u0000%&\u0003\u0006\u0003\u0000&\'\u0003\u0002\u0001\u0000\')\u0001"+
		"\u0000\u0000\u0000(\u0014\u0001\u0000\u0000\u0000(\u0015\u0001\u0000\u0000"+
		"\u0000(\u0016\u0001\u0000\u0000\u0000(\u001a\u0001\u0000\u0000\u0000("+
		"\u001e\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*+\u0003\b\u0004\u0000+,\u0005\u0007\u0000\u0000,-\u0003"+
		"\u0002\u0001\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u0002\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0005\u0005\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005\u0006\u0000\u00003\u000b\u0001\u0000\u0000"+
		"\u0000\u0002\u0012(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}