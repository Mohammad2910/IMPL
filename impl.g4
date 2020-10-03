grammar impl;

/* A small imperative language */
/*---------------------------------------Parser Rules----------------------------------------------------*/
start   :  cs+=command* EOF ;

program : c=command                      # SingleCommand
	| '{' cs+=command* '}'           # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	         # Assignment
	| 'output' e=expr ';'            # Output
    | 'while' '('c=condition')' p=program  # WhileLoop
	| 'for' '(' x=ID '=' e1=expr '..' e2=expr ')' p=program # ForLoop
	;
	
expr	: e1=expr op=MULTIDIV e2=expr # MultOrDiv
	| e1=expr op=ADDSUB e2=expr # AddOrSub
	| op=ADDSUB e=expr	# Fortegn 
	| c=FLOAT     	      # Constant
	| x=ID		      # Variable
	| '(' e=expr ')'      # Parenthesis
	;

condition : e1=expr '!=' e2=expr # Unequal
	| e1=expr '==' e2=expr # Equal
	| e1=expr '<'  e2=expr # LessThan
	| e1=expr '>'  e2=expr # MoreThan
	| e1=expr '&&' e2=expr # And
	| c1=condition '&&' c2=condition # And
	| e1=expr '||' e2=expr # Or
	| c1=condition '||' c2=condition #Or
	  ;  

/* --------------------------------Lexer Rules-----------------------------------------*/
ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : '-'? NUM+ ('.' NUM+)? ;

MULTIDIV : ('*' | '/');
ADDSUB : ('+' | '-');
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
