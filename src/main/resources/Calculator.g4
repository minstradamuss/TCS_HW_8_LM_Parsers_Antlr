// copied from https://github.com/arothuis/antlr4-calculator/blob/master/src/main/antlr4/parser/Calculator.g4

grammar Calculator;

INT     : [0-9]+ ;
REF     : [A-Z]+[0-9]+;
MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
WHITESPACE: [ \r\n\t]+ -> skip;

start:   expression;

expression
   : INT                                            # Integer
   | REF                                            # Reference
   | '(' inner=expression ')'                       # Parentheses
   | left=expression operator=MUL right=expression  # Multiplication
   | left=expression operator=DIV right=expression  # Division
   | left=expression operator=ADD right=expression  # Addition
   | left=expression operator=SUB right=expression  # Subtraction
   ;
