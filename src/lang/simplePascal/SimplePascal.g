grammar SimplePascal;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
  backtrack = true;
}


tokens {
  NEGATION;
  BLOCK;
}

@header {
  package lang.simplePascal;
}

@lexer::header {
  package lang.simplePascal;
}

program
  : 'program'! IDENT!
    (VAR^  variableDeclaration*)?
    BEGIN
      statement*
      returnStatement
    'end.'!
  ;
  
returnStatement
  : 'return'^ expression ';'!
  ;

variableDeclaration
  : IDENT (ASSIGN^ expression)? ';'!
  ;
  
  
statement
  : assignStatement
  | ifStatement
  | printStatement
  | whileStatement
  ;
  
assignStatement
  : IDENT ASSIGN^ expression ';'!
  ;
  
printStatement
  : PRINT^ expression ';'!
  ;
    
ifStatement
  : IF^ expression 'then'!
      block
    ('else'!
      block)?
    'end'! 'if'! ';'!
  ;
  
whileStatement
  : WHILE^ expression 'do'!
      block
    'end'! 'while'! ';'!
  ;
  
block
  : statement* -> ^(BLOCK statement*)
  ;
  
// expressions
  
term
  : IDENT
  | '(' expression ')'
  | INTEGER
  ;
  
unary
  : ('+'! | negation^)* term
  ;

mult
  : unary ((MULT^ | DIV^ | MOD^ | POW^) unary)*
  ;
  
expression
  : mult ((PLUS^ | MINUS^) mult)*
  ;
  
negation
  : '-' -> NEGATION
  ;

fragment DIGIT  : ('0'..'9');
fragment LETTER : ('a'..'z' | 'A'..'Z');

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : 'div';
MOD : 'mod';
POW : 'pow';

ASSIGN : ':=';
IF : 'if';
WHILE : 'while';
PRINT : 'print';
VAR   : 'var';
BEGIN : 'begin';

INTEGER : DIGIT+;
IDENT :  LETTER (LETTER | DIGIT)*;

WHITESPACE  : (' ' | '\t' | '\r' | '\n' | '\f')* { $channel = HIDDEN; };