// Generated from SimplePascal.g4 by ANTLR 4.1

  package edu.simplepascal.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplePascalParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COM=2, COL=3, SCOL=4, ASSIGN=5, OPAR=6, CPAR=7, PLUS=8, MINUS=9, 
		MULT=10, DIV=11, MOD=12, EQ=13, NEQ=14, GT=15, LT=16, GTEQ=17, LTEQ=18, 
		OR=19, XOR=20, AND=21, NOT=22, SHL=23, SHR=24, PROG=25, BEGIN=26, END=27, 
		VAR=28, TRUE=29, FALSE=30, NIL=31, IF=32, OF=33, TO=34, DO=35, THEN=36, 
		ELSE=37, FOR=38, WHILE=39, CASE=40, REPEAT=41, UNTIL=42, READ=43, WRITE=44, 
		T_INT=45, T_REAL=46, T_BOOL=47, T_STR=48, FN_INC=49, FN_DEC=50, FN_SIN=51, 
		FN_COS=52, FN_TAN=53, FN_ATAN=54, FN_SQRT=55, FN_POW=56, FN_EXP=57, FN_LN=58, 
		FN_LEN=59, FN_CNCT=60, FN_DEL=61, FN_CPY=62, ID=63, INT=64, FLOAT=65, 
		STRING=66, COMMENT=67, SPACE=68, OTHER=69;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "','", "':'", "';'", "':='", "'('", "')'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'='", "'<>'", "'>'", "'<'", "'>='", "'<='", 
		"'or'", "'xor'", "'and'", "'not'", "'shl'", "'shr'", "'program'", "'begin'", 
		"'end'", "'var'", "'true'", "'false'", "'nil'", "'if'", "'of'", "'to'", 
		"'do'", "'then'", "'else'", "'for'", "'while'", "'case'", "'repeat'", 
		"'until'", "'read'", "'write'", "'integer'", "'real'", "'boolean'", "'string'", 
		"'inc'", "'dec'", "'sin'", "'cos'", "'tan'", "'atan'", "'sqrt'", "'power'", 
		"'exp'", "'ln'", "'length'", "'concat'", "'delete'", "'copy'", "ID", "INT", 
		"FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
	};
	public static final int
		RULE_program = 0, RULE_varDeclSection = 1, RULE_varDecl = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_assignment = 5, RULE_ifStatement = 6, RULE_caseStatement = 7, 
		RULE_conditionBlockIf = 8, RULE_conditionBlockCase = 9, RULE_blockOrStatement = 10, 
		RULE_whileStatement = 11, RULE_repeatStatement = 12, RULE_forStatement = 13, 
		RULE_writeStatement = 14, RULE_readStatement = 15, RULE_funcCallStatement = 16, 
		RULE_expr = 17, RULE_term = 18, RULE_argList = 19, RULE_funcCall = 20, 
		RULE_incFunCall = 21, RULE_mathFunCall = 22, RULE_trigFunCall = 23, RULE_strFunCall = 24;
	public static final String[] ruleNames = {
		"program", "varDeclSection", "varDecl", "block", "statement", "assignment", 
		"ifStatement", "caseStatement", "conditionBlockIf", "conditionBlockCase", 
		"blockOrStatement", "whileStatement", "repeatStatement", "forStatement", 
		"writeStatement", "readStatement", "funcCallStatement", "expr", "term", 
		"argList", "funcCall", "incFunCall", "mathFunCall", "trigFunCall", "strFunCall"
	};

	@Override
	public String getGrammarFileName() { return "SimplePascal.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimplePascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROG() { return getToken(SimplePascalParser.PROG, 0); }
		public TerminalNode DOT() { return getToken(SimplePascalParser.DOT, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public VarDeclSectionContext varDeclSection() {
			return getRuleContext(VarDeclSectionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(PROG);
			setState(51); match(ID);
			setState(53);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(52); varDeclSection();
				}
			}

			setState(55); block();
			setState(56); match(DOT);
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

	public static class VarDeclSectionContext extends ParserRuleContext {
		public TerminalNode COM(int i) {
			return getToken(SimplePascalParser.COM, i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode VAR() { return getToken(SimplePascalParser.VAR, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public List<TerminalNode> COM() { return getTokens(SimplePascalParser.COM); }
		public VarDeclSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterVarDeclSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitVarDeclSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitVarDeclSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclSectionContext varDeclSection() throws RecognitionException {
		VarDeclSectionContext _localctx = new VarDeclSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(VAR);
			setState(59); varDecl();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(60); match(COM);
				setState(61); varDecl();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(SCOL);
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

	public static class VarDeclContext extends ParserRuleContext {
		public Token type;
		public TerminalNode T_STR() { return getToken(SimplePascalParser.T_STR, 0); }
		public TerminalNode T_INT() { return getToken(SimplePascalParser.T_INT, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode T_REAL() { return getToken(SimplePascalParser.T_REAL, 0); }
		public TerminalNode COL() { return getToken(SimplePascalParser.COL, 0); }
		public TerminalNode T_BOOL() { return getToken(SimplePascalParser.T_BOOL, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(ID);
			setState(70); match(COL);
			setState(71);
			((VarDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_REAL) | (1L << T_BOOL) | (1L << T_STR))) != 0)) ) {
				((VarDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(SimplePascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SimplePascalParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(BEGIN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (IF - 32)) | (1L << (FOR - 32)) | (1L << (WHILE - 32)) | (1L << (CASE - 32)) | (1L << (REPEAT - 32)) | (1L << (READ - 32)) | (1L << (WRITE - 32)) | (1L << (FN_INC - 32)) | (1L << (FN_DEC - 32)) | (1L << (FN_SIN - 32)) | (1L << (FN_COS - 32)) | (1L << (FN_TAN - 32)) | (1L << (FN_ATAN - 32)) | (1L << (FN_SQRT - 32)) | (1L << (FN_POW - 32)) | (1L << (FN_EXP - 32)) | (1L << (FN_LN - 32)) | (1L << (FN_LEN - 32)) | (1L << (FN_CNCT - 32)) | (1L << (FN_DEL - 32)) | (1L << (FN_CPY - 32)) | (1L << (ID - 32)) | (1L << (OTHER - 32)))) != 0)) {
				{
				{
				setState(74); statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80); match(END);
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
		public Token OTHER;
		public TerminalNode OTHER() { return getToken(SimplePascalParser.OTHER, 0); }
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public FuncCallStatementContext funcCallStatement() {
			return getRuleContext(FuncCallStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); caseStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); forStatement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(88); readStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(89); writeStatement();
				}
				break;
			case FN_INC:
			case FN_DEC:
			case FN_SIN:
			case FN_COS:
			case FN_TAN:
			case FN_ATAN:
			case FN_SQRT:
			case FN_POW:
			case FN_EXP:
			case FN_LN:
			case FN_LEN:
			case FN_CNCT:
			case FN_DEL:
			case FN_CPY:
				enterOuterAlt(_localctx, 9);
				{
				setState(90); funcCallStatement();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 10);
				{
				setState(91); ((StatementContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatementContext)_localctx).OTHER!=null?((StatementContext)_localctx).OTHER.getText():null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimplePascalParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(ID);
			setState(96); match(ASSIGN);
			setState(97); expr(0);
			setState(98); match(SCOL);
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
		public TerminalNode ELSE(int i) {
			return getToken(SimplePascalParser.ELSE, i);
		}
		public List<TerminalNode> IF() { return getTokens(SimplePascalParser.IF); }
		public List<TerminalNode> ELSE() { return getTokens(SimplePascalParser.ELSE); }
		public TerminalNode IF(int i) {
			return getToken(SimplePascalParser.IF, i);
		}
		public List<ConditionBlockIfContext> conditionBlockIf() {
			return getRuleContexts(ConditionBlockIfContext.class);
		}
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public ConditionBlockIfContext conditionBlockIf(int i) {
			return getRuleContext(ConditionBlockIfContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(IF);
			setState(101); conditionBlockIf();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(102); match(ELSE);
					setState(103); match(IF);
					setState(104); conditionBlockIf();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(110); match(ELSE);
				setState(111); blockOrStatement();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ConditionBlockCaseContext> conditionBlockCase() {
			return getRuleContexts(ConditionBlockCaseContext.class);
		}
		public TerminalNode OF() { return getToken(SimplePascalParser.OF, 0); }
		public TerminalNode CASE() { return getToken(SimplePascalParser.CASE, 0); }
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public ConditionBlockCaseContext conditionBlockCase(int i) {
			return getRuleContext(ConditionBlockCaseContext.class,i);
		}
		public TerminalNode END() { return getToken(SimplePascalParser.END, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(CASE);
			setState(115); expr(0);
			setState(116); match(OF);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (OPAR - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (NIL - 6)) | (1L << (ID - 6)) | (1L << (INT - 6)) | (1L << (FLOAT - 6)) | (1L << (STRING - 6)))) != 0)) {
				{
				{
				setState(117); conditionBlockCase();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); match(END);
			setState(124); match(SCOL);
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

	public static class ConditionBlockIfContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(SimplePascalParser.THEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public ConditionBlockIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlockIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterConditionBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitConditionBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitConditionBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockIfContext conditionBlockIf() throws RecognitionException {
		ConditionBlockIfContext _localctx = new ConditionBlockIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionBlockIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); expr(0);
			setState(127); match(THEN);
			setState(128); blockOrStatement();
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

	public static class ConditionBlockCaseContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode COL() { return getToken(SimplePascalParser.COL, 0); }
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public ConditionBlockCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlockCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterConditionBlockCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitConditionBlockCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitConditionBlockCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockCaseContext conditionBlockCase() throws RecognitionException {
		ConditionBlockCaseContext _localctx = new ConditionBlockCaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionBlockCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); term();
			setState(131); match(COL);
			setState(132); blockOrStatement();
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

	public static class BlockOrStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockOrStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOrStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterBlockOrStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitBlockOrStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitBlockOrStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOrStatementContext blockOrStatement() throws RecognitionException {
		BlockOrStatementContext _localctx = new BlockOrStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockOrStatement);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); block();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
			case CASE:
			case REPEAT:
			case READ:
			case WRITE:
			case FN_INC:
			case FN_DEC:
			case FN_SIN:
			case FN_COS:
			case FN_TAN:
			case FN_ATAN:
			case FN_SQRT:
			case FN_POW:
			case FN_EXP:
			case FN_LN:
			case FN_LEN:
			case FN_CNCT:
			case FN_DEL:
			case FN_CPY:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimplePascalParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(SimplePascalParser.DO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(WHILE);
			setState(139); expr(0);
			setState(140); match(DO);
			setState(141); blockOrStatement();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode REPEAT() { return getToken(SimplePascalParser.REPEAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(SimplePascalParser.UNTIL, 0); }
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(REPEAT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (IF - 32)) | (1L << (FOR - 32)) | (1L << (WHILE - 32)) | (1L << (CASE - 32)) | (1L << (REPEAT - 32)) | (1L << (READ - 32)) | (1L << (WRITE - 32)) | (1L << (FN_INC - 32)) | (1L << (FN_DEC - 32)) | (1L << (FN_SIN - 32)) | (1L << (FN_COS - 32)) | (1L << (FN_TAN - 32)) | (1L << (FN_ATAN - 32)) | (1L << (FN_SQRT - 32)) | (1L << (FN_POW - 32)) | (1L << (FN_EXP - 32)) | (1L << (FN_LN - 32)) | (1L << (FN_LEN - 32)) | (1L << (FN_CNCT - 32)) | (1L << (FN_DEL - 32)) | (1L << (FN_CPY - 32)) | (1L << (ID - 32)) | (1L << (OTHER - 32)))) != 0)) {
				{
				{
				setState(144); statement();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(UNTIL);
			setState(151); expr(0);
			setState(152); match(SCOL);
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

	public static class ForStatementContext extends ParserRuleContext {
		public ExprContext initial;
		public ExprContext terminal;
		public TerminalNode DO() { return getToken(SimplePascalParser.DO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode FOR() { return getToken(SimplePascalParser.FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplePascalParser.ASSIGN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode TO() { return getToken(SimplePascalParser.TO, 0); }
		public BlockOrStatementContext blockOrStatement() {
			return getRuleContext(BlockOrStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(FOR);
			setState(155); match(ID);
			setState(156); match(ASSIGN);
			setState(157); ((ForStatementContext)_localctx).initial = expr(0);
			setState(158); match(TO);
			setState(159); ((ForStatementContext)_localctx).terminal = expr(0);
			setState(160); match(DO);
			setState(161); blockOrStatement();
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

	public static class WriteStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(SimplePascalParser.WRITE, 0); }
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(WRITE);
			setState(164); expr(0);
			setState(165); match(SCOL);
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

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode READ() { return getToken(SimplePascalParser.READ, 0); }
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(READ);
			setState(168); match(ID);
			setState(169); match(SCOL);
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

	public static class FuncCallStatementContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(SimplePascalParser.SCOL, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterFuncCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitFuncCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitFuncCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallStatementContext funcCallStatement() throws RecognitionException {
		FuncCallStatementContext _localctx = new FuncCallStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); funcCall();
			setState(172); match(SCOL);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class MultExprContext extends ExprContext {
		public TerminalNode MULT() { return getToken(SimplePascalParser.MULT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AND() { return getToken(SimplePascalParser.AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermExprContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitTermExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(SimplePascalParser.MOD, 0); }
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SimplePascalParser.PLUS, 0); }
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode LT() { return getToken(SimplePascalParser.LT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(SimplePascalParser.LTEQ, 0); }
		public LteqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterLteqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitLteqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitLteqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode OR() { return getToken(SimplePascalParser.OR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode MINUS() { return getToken(SimplePascalParser.MINUS, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimplePascalParser.MINUS, 0); }
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteqExprContext extends ExprContext {
		public TerminalNode GTEQ() { return getToken(SimplePascalParser.GTEQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GteqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterGteqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitGteqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitGteqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(SimplePascalParser.GT, 0); }
		public GtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqExprContext extends ExprContext {
		public TerminalNode NEQ() { return getToken(SimplePascalParser.NEQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NeqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitNeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SimplePascalParser.EQ, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShlExprContext extends ExprContext {
		public TerminalNode SHL() { return getToken(SimplePascalParser.SHL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ShlExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterShlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitShlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitShlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SHR() { return getToken(SimplePascalParser.SHR, 0); }
		public ShrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterShrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitShrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitShrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends ExprContext {
		public TerminalNode DIV() { return getToken(SimplePascalParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SimplePascalParser.NOT, 0); }
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175); match(MINUS);
				setState(176); expr(19);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177); match(NOT);
				setState(178); expr(18);
				}
				break;
			case FN_INC:
			case FN_DEC:
			case FN_SIN:
			case FN_COS:
			case FN_TAN:
			case FN_ATAN:
			case FN_SQRT:
			case FN_POW:
			case FN_EXP:
			case FN_LN:
			case FN_LEN:
			case FN_CNCT:
			case FN_DEL:
			case FN_CPY:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179); funcCall();
				}
				break;
			case OPAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(184); match(MOD);
						setState(185); expr(18);
						}
						break;

					case 2:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(187); match(MULT);
						setState(188); expr(17);
						}
						break;

					case 3:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(190); match(DIV);
						setState(191); expr(16);
						}
						break;

					case 4:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(193); match(PLUS);
						setState(194); expr(15);
						}
						break;

					case 5:
						{
						_localctx = new MinusExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(196); match(MINUS);
						setState(197); expr(14);
						}
						break;

					case 6:
						{
						_localctx = new LteqExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(199); match(LTEQ);
						setState(200); expr(13);
						}
						break;

					case 7:
						{
						_localctx = new GteqExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(202); match(GTEQ);
						setState(203); expr(12);
						}
						break;

					case 8:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(205); match(LT);
						setState(206); expr(11);
						}
						break;

					case 9:
						{
						_localctx = new GtExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(208); match(GT);
						setState(209); expr(10);
						}
						break;

					case 10:
						{
						_localctx = new NeqExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(211); match(NEQ);
						setState(212); expr(9);
						}
						break;

					case 11:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(214); match(EQ);
						setState(215); expr(8);
						}
						break;

					case 12:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(217); match(AND);
						setState(218); expr(7);
						}
						break;

					case 13:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(220); match(OR);
						setState(221); expr(6);
						}
						break;

					case 14:
						{
						_localctx = new ShlExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(223); match(SHL);
						setState(224); expr(5);
						}
						break;

					case 15:
						{
						_localctx = new ShrExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(226); match(SHR);
						setState(227); expr(4);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends TermContext {
		public TerminalNode CPAR() { return getToken(SimplePascalParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(SimplePascalParser.OPAR, 0); }
		public ParExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberTermContext extends TermContext {
		public TerminalNode FLOAT() { return getToken(SimplePascalParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(SimplePascalParser.INT, 0); }
		public NumberTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdTermContext extends TermContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public IdTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIdTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIdTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIdTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTermContext extends TermContext {
		public TerminalNode STRING() { return getToken(SimplePascalParser.STRING, 0); }
		public StringTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitStringTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilTermContext extends TermContext {
		public TerminalNode NIL() { return getToken(SimplePascalParser.NIL, 0); }
		public NilTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterNilTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitNilTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitNilTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTermContext extends TermContext {
		public TerminalNode TRUE() { return getToken(SimplePascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimplePascalParser.FALSE, 0); }
		public BooleanTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterBooleanTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitBooleanTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitBooleanTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			setState(242);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(OPAR);
				setState(234); expr(0);
				setState(235); match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
				_localctx = new IdTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239); match(ID);
				}
				break;
			case STRING:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(240); match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(241); match(NIL);
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

	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode COM(int i) {
			return getToken(SimplePascalParser.COM, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(SimplePascalParser.COM); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); expr(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(245); match(COM);
				setState(246); expr(0);
				}
				}
				setState(251);
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

	public static class FuncCallContext extends ParserRuleContext {
		public MathFunCallContext mathFunCall() {
			return getRuleContext(MathFunCallContext.class,0);
		}
		public TrigFunCallContext trigFunCall() {
			return getRuleContext(TrigFunCallContext.class,0);
		}
		public IncFunCallContext incFunCall() {
			return getRuleContext(IncFunCallContext.class,0);
		}
		public StrFunCallContext strFunCall() {
			return getRuleContext(StrFunCallContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcCall);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case FN_INC:
			case FN_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); incFunCall();
				}
				break;
			case FN_SQRT:
			case FN_POW:
			case FN_EXP:
			case FN_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); mathFunCall();
				}
				break;
			case FN_SIN:
			case FN_COS:
			case FN_TAN:
			case FN_ATAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); trigFunCall();
				}
				break;
			case FN_LEN:
			case FN_CNCT:
			case FN_DEL:
			case FN_CPY:
				enterOuterAlt(_localctx, 4);
				{
				setState(255); strFunCall();
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

	public static class IncFunCallContext extends ParserRuleContext {
		public Token fun;
		public TerminalNode FN_DEC() { return getToken(SimplePascalParser.FN_DEC, 0); }
		public TerminalNode FN_INC() { return getToken(SimplePascalParser.FN_INC, 0); }
		public TerminalNode CPAR() { return getToken(SimplePascalParser.CPAR, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(SimplePascalParser.OPAR, 0); }
		public IncFunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incFunCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIncFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIncFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIncFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncFunCallContext incFunCall() throws RecognitionException {
		IncFunCallContext _localctx = new IncFunCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_incFunCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((IncFunCallContext)_localctx).fun = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==FN_INC || _la==FN_DEC) ) {
				((IncFunCallContext)_localctx).fun = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(259); match(OPAR);
			setState(260); match(ID);
			setState(261); match(CPAR);
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

	public static class MathFunCallContext extends ParserRuleContext {
		public Token fun;
		public TerminalNode CPAR() { return getToken(SimplePascalParser.CPAR, 0); }
		public TerminalNode FN_EXP() { return getToken(SimplePascalParser.FN_EXP, 0); }
		public TerminalNode FN_SQRT() { return getToken(SimplePascalParser.FN_SQRT, 0); }
		public TerminalNode FN_POW() { return getToken(SimplePascalParser.FN_POW, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(SimplePascalParser.OPAR, 0); }
		public TerminalNode FN_LN() { return getToken(SimplePascalParser.FN_LN, 0); }
		public MathFunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterMathFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitMathFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitMathFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFunCallContext mathFunCall() throws RecognitionException {
		MathFunCallContext _localctx = new MathFunCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mathFunCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((MathFunCallContext)_localctx).fun = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN_SQRT) | (1L << FN_POW) | (1L << FN_EXP) | (1L << FN_LN))) != 0)) ) {
				((MathFunCallContext)_localctx).fun = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(264); match(OPAR);
			setState(265); argList();
			setState(266); match(CPAR);
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

	public static class TrigFunCallContext extends ParserRuleContext {
		public Token fun;
		public TerminalNode CPAR() { return getToken(SimplePascalParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FN_COS() { return getToken(SimplePascalParser.FN_COS, 0); }
		public TerminalNode FN_ATAN() { return getToken(SimplePascalParser.FN_ATAN, 0); }
		public TerminalNode FN_SIN() { return getToken(SimplePascalParser.FN_SIN, 0); }
		public TerminalNode OPAR() { return getToken(SimplePascalParser.OPAR, 0); }
		public TerminalNode FN_TAN() { return getToken(SimplePascalParser.FN_TAN, 0); }
		public TrigFunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigFunCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterTrigFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitTrigFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitTrigFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigFunCallContext trigFunCall() throws RecognitionException {
		TrigFunCallContext _localctx = new TrigFunCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trigFunCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((TrigFunCallContext)_localctx).fun = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN_SIN) | (1L << FN_COS) | (1L << FN_TAN) | (1L << FN_ATAN))) != 0)) ) {
				((TrigFunCallContext)_localctx).fun = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(269); match(OPAR);
			setState(270); expr(0);
			setState(271); match(CPAR);
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

	public static class StrFunCallContext extends ParserRuleContext {
		public Token fun;
		public TerminalNode CPAR() { return getToken(SimplePascalParser.CPAR, 0); }
		public TerminalNode FN_CNCT() { return getToken(SimplePascalParser.FN_CNCT, 0); }
		public TerminalNode FN_LEN() { return getToken(SimplePascalParser.FN_LEN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(SimplePascalParser.OPAR, 0); }
		public TerminalNode FN_CPY() { return getToken(SimplePascalParser.FN_CPY, 0); }
		public TerminalNode FN_DEL() { return getToken(SimplePascalParser.FN_DEL, 0); }
		public StrFunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strFunCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterStrFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitStrFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitStrFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrFunCallContext strFunCall() throws RecognitionException {
		StrFunCallContext _localctx = new StrFunCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_strFunCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((StrFunCallContext)_localctx).fun = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN_LEN) | (1L << FN_CNCT) | (1L << FN_DEL) | (1L << FN_CPY))) != 0)) ) {
				((StrFunCallContext)_localctx).fun = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(274); match(OPAR);
			setState(275); argList();
			setState(276); match(CPAR);
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
		case 17: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 17 >= _localctx._p;

		case 1: return 16 >= _localctx._p;

		case 2: return 15 >= _localctx._p;

		case 3: return 14 >= _localctx._p;

		case 4: return 13 >= _localctx._p;

		case 5: return 12 >= _localctx._p;

		case 6: return 11 >= _localctx._p;

		case 7: return 10 >= _localctx._p;

		case 8: return 9 >= _localctx._p;

		case 9: return 8 >= _localctx._p;

		case 10: return 7 >= _localctx._p;

		case 11: return 6 >= _localctx._p;

		case 12: return 5 >= _localctx._p;

		case 13: return 4 >= _localctx._p;

		case 14: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3G\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\5\28\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3A\n\3\f"+
		"\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\5\bs"+
		"\n\b\3\t\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b8"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00e7\n\23\f\23\16\23\u00ea\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f5\n\24\3\25\3\25\3\25\7\25"+
		"\u00fa\n\25\f\25\16\25\u00fd\13\25\3\26\3\26\3\26\3\26\5\26\u0103\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\2\t\3\2/\62\3\2BC\3\2\37 \3\2\63\64\3\29<\3\2"+
		"\658\3\2=@\u012b\2\64\3\2\2\2\4<\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\n_\3\2"+
		"\2\2\fa\3\2\2\2\16f\3\2\2\2\20t\3\2\2\2\22\u0080\3\2\2\2\24\u0084\3\2"+
		"\2\2\26\u008a\3\2\2\2\30\u008c\3\2\2\2\32\u0091\3\2\2\2\34\u009c\3\2\2"+
		"\2\36\u00a5\3\2\2\2 \u00a9\3\2\2\2\"\u00ad\3\2\2\2$\u00b7\3\2\2\2&\u00f4"+
		"\3\2\2\2(\u00f6\3\2\2\2*\u0102\3\2\2\2,\u0104\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u010e\3\2\2\2\62\u0113\3\2\2\2\64\65\7\33\2\2\65\67\7A\2\2\668\5\4\3"+
		"\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\b\5\2:;\7\3\2\2;\3\3\2\2\2"+
		"<=\7\36\2\2=B\5\6\4\2>?\7\4\2\2?A\5\6\4\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\6\2\2F\5\3\2\2\2GH\7A\2\2HI\7\5\2"+
		"\2IJ\t\2\2\2J\7\3\2\2\2KO\7\34\2\2LN\5\n\6\2ML\3\2\2\2NQ\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\35\2\2S\t\3\2\2\2T`\5\f\7\2U`\5"+
		"\16\b\2V`\5\20\t\2W`\5\30\r\2X`\5\32\16\2Y`\5\34\17\2Z`\5 \21\2[`\5\36"+
		"\20\2\\`\5\"\22\2]^\7G\2\2^`\b\6\1\2_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2_W\3"+
		"\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2`\13"+
		"\3\2\2\2ab\7A\2\2bc\7\7\2\2cd\5$\23\2de\7\6\2\2e\r\3\2\2\2fg\7\"\2\2g"+
		"m\5\22\n\2hi\7\'\2\2ij\7\"\2\2jl\5\22\n\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2nr\3\2\2\2om\3\2\2\2pq\7\'\2\2qs\5\26\f\2rp\3\2\2\2rs\3\2"+
		"\2\2s\17\3\2\2\2tu\7*\2\2uv\5$\23\2vz\7#\2\2wy\5\24\13\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\35\2\2~\177\7\6\2\2"+
		"\177\21\3\2\2\2\u0080\u0081\5$\23\2\u0081\u0082\7&\2\2\u0082\u0083\5\26"+
		"\f\2\u0083\23\3\2\2\2\u0084\u0085\5&\24\2\u0085\u0086\7\5\2\2\u0086\u0087"+
		"\5\26\f\2\u0087\25\3\2\2\2\u0088\u008b\5\b\5\2\u0089\u008b\5\n\6\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\27\3\2\2\2\u008c\u008d\7)\2\2"+
		"\u008d\u008e\5$\23\2\u008e\u008f\7%\2\2\u008f\u0090\5\26\f\2\u0090\31"+
		"\3\2\2\2\u0091\u0095\7+\2\2\u0092\u0094\5\n\6\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\5$\23\2\u009a"+
		"\u009b\7\6\2\2\u009b\33\3\2\2\2\u009c\u009d\7(\2\2\u009d\u009e\7A\2\2"+
		"\u009e\u009f\7\7\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7$\2\2\u00a1\u00a2"+
		"\5$\23\2\u00a2\u00a3\7%\2\2\u00a3\u00a4\5\26\f\2\u00a4\35\3\2\2\2\u00a5"+
		"\u00a6\7.\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\6\2\2\u00a8\37\3\2\2\2"+
		"\u00a9\u00aa\7-\2\2\u00aa\u00ab\7A\2\2\u00ab\u00ac\7\6\2\2\u00ac!\3\2"+
		"\2\2\u00ad\u00ae\5*\26\2\u00ae\u00af\7\6\2\2\u00af#\3\2\2\2\u00b0\u00b1"+
		"\b\23\1\2\u00b1\u00b2\7\13\2\2\u00b2\u00b8\5$\23\2\u00b3\u00b4\7\30\2"+
		"\2\u00b4\u00b8\5$\23\2\u00b5\u00b8\5*\26\2\u00b6\u00b8\5&\24\2\u00b7\u00b0"+
		"\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00e8\3\2\2\2\u00b9\u00ba\6\23\2\3\u00ba\u00bb\7\16\2\2\u00bb\u00e7\5"+
		"$\23\2\u00bc\u00bd\6\23\3\3\u00bd\u00be\7\f\2\2\u00be\u00e7\5$\23\2\u00bf"+
		"\u00c0\6\23\4\3\u00c0\u00c1\7\r\2\2\u00c1\u00e7\5$\23\2\u00c2\u00c3\6"+
		"\23\5\3\u00c3\u00c4\7\n\2\2\u00c4\u00e7\5$\23\2\u00c5\u00c6\6\23\6\3\u00c6"+
		"\u00c7\7\13\2\2\u00c7\u00e7\5$\23\2\u00c8\u00c9\6\23\7\3\u00c9\u00ca\7"+
		"\24\2\2\u00ca\u00e7\5$\23\2\u00cb\u00cc\6\23\b\3\u00cc\u00cd\7\23\2\2"+
		"\u00cd\u00e7\5$\23\2\u00ce\u00cf\6\23\t\3\u00cf\u00d0\7\22\2\2\u00d0\u00e7"+
		"\5$\23\2\u00d1\u00d2\6\23\n\3\u00d2\u00d3\7\21\2\2\u00d3\u00e7\5$\23\2"+
		"\u00d4\u00d5\6\23\13\3\u00d5\u00d6\7\20\2\2\u00d6\u00e7\5$\23\2\u00d7"+
		"\u00d8\6\23\f\3\u00d8\u00d9\7\17\2\2\u00d9\u00e7\5$\23\2\u00da\u00db\6"+
		"\23\r\3\u00db\u00dc\7\27\2\2\u00dc\u00e7\5$\23\2\u00dd\u00de\6\23\16\3"+
		"\u00de\u00df\7\25\2\2\u00df\u00e7\5$\23\2\u00e0\u00e1\6\23\17\3\u00e1"+
		"\u00e2\7\31\2\2\u00e2\u00e7\5$\23\2\u00e3\u00e4\6\23\20\3\u00e4\u00e5"+
		"\7\32\2\2\u00e5\u00e7\5$\23\2\u00e6\u00b9\3\2\2\2\u00e6\u00bc\3\2\2\2"+
		"\u00e6\u00bf\3\2\2\2\u00e6\u00c2\3\2\2\2\u00e6\u00c5\3\2\2\2\u00e6\u00c8"+
		"\3\2\2\2\u00e6\u00cb\3\2\2\2\u00e6\u00ce\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6"+
		"\u00d4\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dd\3\2"+
		"\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9%\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\7\t\2\2\u00ee\u00f5"+
		"\3\2\2\2\u00ef\u00f5\t\3\2\2\u00f0\u00f5\t\4\2\2\u00f1\u00f5\7A\2\2\u00f2"+
		"\u00f5\7D\2\2\u00f3\u00f5\7!\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ef\3\2\2"+
		"\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00fb\5$\23\2\u00f7\u00f8\7\4\2\2\u00f8"+
		"\u00fa\5$\23\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc)\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0103"+
		"\5,\27\2\u00ff\u0103\5.\30\2\u0100\u0103\5\60\31\2\u0101\u0103\5\62\32"+
		"\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103+\3\2\2\2\u0104\u0105\t\5\2\2\u0105\u0106\7\b\2\2\u0106"+
		"\u0107\7A\2\2\u0107\u0108\7\t\2\2\u0108-\3\2\2\2\u0109\u010a\t\6\2\2\u010a"+
		"\u010b\7\b\2\2\u010b\u010c\5(\25\2\u010c\u010d\7\t\2\2\u010d/\3\2\2\2"+
		"\u010e\u010f\t\7\2\2\u010f\u0110\7\b\2\2\u0110\u0111\5$\23\2\u0111\u0112"+
		"\7\t\2\2\u0112\61\3\2\2\2\u0113\u0114\t\b\2\2\u0114\u0115\7\b\2\2\u0115"+
		"\u0116\5(\25\2\u0116\u0117\7\t\2\2\u0117\63\3\2\2\2\21\67BO_mrz\u008a"+
		"\u0095\u00b7\u00e6\u00e8\u00f4\u00fb\u0102";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}