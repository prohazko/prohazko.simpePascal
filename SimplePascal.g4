grammar SimplePascal;

@parser::header {
  package edu.simplepascal.antlr;
}

@lexer::header {
  package edu.simplepascal.antlr;
}

/* ************************************
 * 1.          PARSER RULES
 * ************************************/

program
 :  PROG ID
    varDeclSection?
    block DOT
 ;

varDeclSection
 : VAR varDecl (COM varDecl)* SCOL
 ;

varDecl
 : ID COL type=(T_INT | T_REAL |T_BOOL | T_STR )
 ;

block: BEGIN statement* END;

statement
 : assignment
 | ifStatement
 | caseStatement
 | whileStatement
 | repeatStatement
 | forStatement
 | readStatement
 | writeStatement
 | funcCallStatement
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

ifStatement
 : IF conditionBlockIf  (ELSE IF conditionBlockIf)* (ELSE blockOrStatement)?
 ;

caseStatement
 : CASE expr OF (conditionBlockCase)*  END SCOL
 ;

conditionBlockIf
 : expr THEN blockOrStatement
 ;

conditionBlockCase
 : term COL blockOrStatement
 ;

blockOrStatement
 : block
 | statement
 ;

whileStatement
 : WHILE expr DO blockOrStatement
 ;

repeatStatement
 : REPEAT  statement* UNTIL expr  SCOL
 ;

forStatement
 : FOR ID ASSIGN initial=expr TO terminal=expr DO blockOrStatement
 ;

writeStatement
 : WRITE expr SCOL
 ;

readStatement
 : READ ID SCOL
 ;

funcCallStatement
 : funcCall SCOL
 ;

expr
 :
         MINUS  expr   #unaryMinusExpr
 |       NOT    expr   #notExpr
 | expr  MOD    expr   #modExpr
 | expr  MULT   expr   #multExpr
 | expr  DIV    expr   #divExpr
 | expr  PLUS   expr   #plusExpr
 | expr  MINUS  expr   #minusExpr
 | expr  LTEQ   expr   #lteqExpr
 | expr  GTEQ   expr   #gteqExpr
 | expr  LT     expr   #ltExpr
 | expr  GT     expr   #gtExpr
 | expr  NEQ    expr   #neqExpr
 | expr  EQ     expr   #eqExpr
 | expr  AND    expr   #andExpr
 | expr  OR     expr   #orExpr
 | expr  SHL    expr   #shlExpr
 | expr  SHR    expr   #shrExpr
 | funcCall            #funcCallExpr
 | term                #termExpr
 ;



term
 : OPAR expr CPAR   #parExpr
 | (INT | FLOAT)    #numberTerm
 | (TRUE | FALSE)   #booleanTerm
 | ID               #idTerm
 | STRING           #stringTerm
 | NIL              #nilTerm
 ;

argList
 : expr (COM expr)*
 ;

funcCall
 : incFunCall
 | mathFunCall
 | trigFunCall
 | strFunCall
 ;

incFunCall  : fun=( FN_INC  | FN_DEC )                     OPAR ID      CPAR ;
mathFunCall : fun=( FN_SQRT | FN_POW  | FN_EXP | FN_LN   ) OPAR argList CPAR ;
trigFunCall : fun=( FN_SIN  | FN_COS  | FN_TAN | FN_ATAN ) OPAR expr    CPAR ;
strFunCall  : fun=( FN_LEN  | FN_CNCT | FN_DEL | FN_CPY  ) OPAR argList CPAR ;


/* ************************************
 * 2.           LEXER RULES
 * ************************************/


DOT    : '.';
COM    : ',';
COL    : ':';
SCOL   : ';';
ASSIGN : ':=';
OPAR   : '(';
CPAR   : ')';

PLUS   : '+';
MINUS  : '-';
MULT   : '*';
DIV    : '/';
MOD    : '%';

EQ     : '=';
NEQ    : '<>';
GT     : '>';
LT     : '<';
GTEQ   : '>=';
LTEQ   : '<=';

OR     : 'or';
XOR    : 'xor';
AND    : 'and';
NOT    : 'not';
SHL    : 'shl';
SHR    : 'shr';

PROG   : 'program';
BEGIN  : 'begin';
END    : 'end';
VAR    : 'var';

TRUE   : 'true';
FALSE  : 'false';
NIL    : 'nil';
IF     : 'if';
OF     : 'of';
TO     : 'to';
DO     : 'do';
THEN   : 'then';
ELSE   : 'else';
FOR    : 'for';
WHILE  : 'while';
CASE   : 'case';
REPEAT : 'repeat';
UNTIL  : 'until';
READ   : 'read';
WRITE  : 'write';

T_INT  : 'integer';
T_REAL : 'real';
T_BOOL : 'boolean';
T_STR  : 'string';

FN_INC : 'inc';
FN_DEC : 'dec';

FN_SIN : 'sin';
FN_COS : 'cos';
FN_TAN : 'tan';
FN_ATAN: 'atan';

FN_SQRT: 'sqrt';
FN_POW : 'power';
FN_EXP : 'exp';
FN_LN  : 'ln';

FN_LEN : 'length';
FN_CNCT: 'concat';
FN_DEL : 'delete';
FN_CPY : 'copy';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '\'' .*? '\''
 ;

COMMENT
 : ( '//' ~[\r\n]* '\r'? '\n'
    | '{' .*? '}'
    ) -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;