grammar DataLang;

// Regras da gramática
program: statement+ EOF;

statement: variableDeclaration
         | vectorDeclaration
         | matrixDeclaration
         | stackDeclaration
         | pushOperation
         | popOperation
         | expressionStatement
         ;

variableDeclaration: scalarType ID '=' expression ';' ;

vectorDeclaration: 'vector' ID ':' type '[' size ']' '=' '[' elements ']' ';' ;

matrixDeclaration: 'matrix' ID ':' type '[' numRows ']' '[' numCols ']' '=' '[' matrixElements ']' ';' ;

stackDeclaration: 'stack' ID '=' 'new' 'stack' ';' ;

pushOperation: ID '.' 'push' '(' expression ')' ';' ;

popOperation: ID '.' 'pop' '(' ')' ';' ;

expressionStatement: expression ';' ;

expression:
          | ID
          | INT
          | expression '+' expression
          | expression '-' expression
          | '(' expression ')'
          | vectorExpression
          | matrixExpression
          ;



scalarType: 'int' | 'boolean' | 'str' | 'float' | 'double' | 'int32' | 'int64' | 'long';

type: scalarType | 'matrix';

size: INT;

numRows: INT;

numCols: INT;

vectorExpression: ID '=' '[' elements ']' ;

matrixExpression: ID '=' '[' matrixElements ']' ;

elements: element (',' element)*;

matrixElements: matrixElement (',' matrixElement)*;

element: INT;

matrixElement: '[' elements ']' ;

// Definindo tokens
ID: [a-zA-Z]+;
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
