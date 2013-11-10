grammar SimplePascal;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}


program
	:	'program' IDENT
		(variable)*
		'begin'
		statement*
		'end.'
	;


variable
	:	'var' IDENT (':=' expression)? ';'
	;
	
statement
	:	assignmentStatement
	|	ifStatement
	|	whileStatement
	;
	
	
ifStatement
	:	'if' expression 'then' statement+
		('elsif' expression 'then' statement+)*
		('else' statement+)?
		'end' 'if' ';'
	;
	
assignmentStatement
	:	IDENT ':=' expression ';'
	;
		
whileStatement
	:	'while' expression 'loop'
		(statement)*
		'end' 'while' ';'
	;
	
returnStatement
	:	'return' expression ';'
	;
	
	
// expressions -- fun time!

term
	:	IDENT
	|	'(' expression ')'
	|	INTEGER
	|	STRING_LITERAL
	|	CHAR_LITERAL
	;
	
	
unary
	:	('+' | '-')* term
	;

mult
	:	unary (('*' | '/' | 'mod') unary)*
	;
	
add
	:	mult (('+' | '-') mult)*
	;

relation
	:	add (('=' | '/=' | '<' | '<=' | '>=' | '>') add)*
	;
	
expression
	:	relation (('and' | 'or') relation)*
	;
	

MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;

STRING_LITERAL
	:	'"'
		{ StringBuilder b = new StringBuilder(); }
		(	'"' '"'				{ b.appendCodePoint('"');}
		|	c=~('"'|'\r'|'\n')	{ b.appendCodePoint(c);}
		)*
		'"'
		{ setText(b.toString()); }
	;
	
CHAR_LITERAL
	:	'\'' . '\'' {setText(getText().substring(1,2));}
	;

fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};