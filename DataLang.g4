grammar DataLang;

// Tokens personalizados
PRINT: 'print';
FOR: 'for';
VECTOR: 'vector';
MATRIX: 'matrix';
STACK: 'stack';
NEW: 'new';
PUSH: 'push';
POP: 'pop';
INT_TYPE: 'int';
BOOLEAN_TYPE: 'boolean';
STRING_TYPE: 'str';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
INT32_TYPE: 'int32';
INT64_TYPE: 'int64';
LONG_TYPE: 'long';
IF: 'if';
ELSE_IF: 'else if';
ELSE: 'else';
TERNARY: '?';


// Outros tokens
ID: [a-zA-Z]+;
INT: [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
STRING_LITERAL: '"' ( ~["\\] | '\\\\' . )* '"';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
COMMA: ',';
ASSIGN: '=';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
LOGICAL_NOT: '!';
EQUAL: '==';
NOT_EQUAL: '!=';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
GREATER: '>';
LESS: '<';
SEMICOLON: ';';
COLON: ':';
WS: [ \t\r\n]+ -> skip;
DOT: '.';

// Regras da gramática
program: statement+ EOF;

statement: variableDeclaration
         | vectorDeclaration
         | matrixDeclaration
         | stackDeclaration
         | pushOperation
         | popOperation
         | expressionStatement
         | forLoop
         | ifStatement
         | printStatement
         ;

ternaryExpression: conditionalExpression ('?' expression ':' expression)?;
conditionalExpression: addExpression;
printStatement: PRINT '(' expression ')' SEMICOLON;
ifStatement: IF '(' condition ')' statement (ELSE_IF '(' condition ')' statement)* (ELSE statement)?;
forLoop: FOR '(' initialization ';' condition ';' update ')' statement ;
initialization: variableDeclaration ;
condition: expression ; 
update: expression ; 
variableDeclaration: scalarType ID ASSIGN expression SEMICOLON ;
vectorDeclaration: VECTOR ID COLON type OPEN_BRACKET size CLOSE_BRACKET ASSIGN OPEN_BRACKET elements CLOSE_BRACKET SEMICOLON ;
matrixDeclaration: MATRIX ID COLON type OPEN_BRACKET numRows CLOSE_BRACKET OPEN_BRACKET numCols CLOSE_BRACKET ASSIGN OPEN_BRACKET matrixElements CLOSE_BRACKET SEMICOLON ;
stackDeclaration: STACK ID ASSIGN NEW STACK SEMICOLON ;
pushOperation: ID DOT PUSH '(' expression ')' SEMICOLON ;
popOperation: ID DOT POP '(' ')' SEMICOLON ;
expressionStatement: expression SEMICOLON ;

expression: addExpression;
addExpression: multExpression (PLUS multExpression | MINUS multExpression)*;
multExpression: atom (MULTIPLY atom | DIVIDE atom | MODULO atom)*;

atom: ID
    | INT
    | FLOAT_LITERAL
    | STRING_LITERAL
    | OPEN_PAREN expression CLOSE_PAREN
    | vectorExpression
    | matrixExpression
    | BOOLEAN_LITERAL
    ;

scalarType: INT_TYPE | BOOLEAN_TYPE | STRING_TYPE | FLOAT_TYPE | DOUBLE_TYPE | INT32_TYPE | INT64_TYPE | LONG_TYPE;
type: scalarType | MATRIX;
size: INT;
numRows: INT;
numCols: INT;
vectorExpression: ID ASSIGN OPEN_BRACKET elements CLOSE_BRACKET ;
matrixExpression: ID ASSIGN OPEN_BRACKET matrixElements CLOSE_BRACKET ;
elements: element (COMMA element)*;
matrixElements: matrixElement (COMMA matrixElement)*;
element: INT;
matrixElement: OPEN_BRACKET elements CLOSE_BRACKET ;
