grammar DataLang;

@parser::header{ 
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import lang.ast.*;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

// Tokens
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

ID: [a-zA-Z0-9]+;
INT: [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
STRING_LITERAL: '"' ( ~["\\] | '\\\\' . )* '"';
ADDITIVE_OPERATOR: '+' | '-';
MULTIPLICATIVE_OPERATOR: '*' | '/';
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
RELATIONAL_OPERATOR: '>' | '<' | '>=' | '<=' | '==' | '!=';
EQUALITY_OPERATOR: '==' | '!=';
SEMICOLON: ';';
COLON: ':';
WS: [ \t\r\n]+ -> skip;
DOT: '.';

// Parser rules
program: statement+ EOF;

statement returns [ASTNode node]:
    variableDeclaration {$node = $variableDeclaration.node;}
    | vectorDeclaration {$node = $vectorDeclaration.node;}
    | matrixDeclaration {$node = $matrixDeclaration.node;}
    | stackDeclaration {$node = $stackDeclaration.node;}
    | pushOperation {$node = $pushOperation.node;}
    | popOperation {$node = $popOperation.node;}
    | forLoop {$node = $forLoop.node;}
    | ifStatement {$node = $ifStatement.node;}
    | printStatement {$node = $printStatement.node;}
    | expressionStatement {$node = $expressionStatement.node;}
    ;

ternaryExpression returns [ASTNode node]
    : c=conditionalExpression (TERNARY t=expression COLON f=expression)?
    {
        $node = ($t.node != null && $f.node != null) ?
            new TernaryExpressionNode($c.node, $t.node, $f.node) :
            $c.node;
    };

conditionalExpression returns [ASTNode node]: expression;

printStatement returns [ASTNode node]:
    PRINT OPEN_PAREN expressionList CLOSE_PAREN SEMICOLON
    {
        $node = new PrintStatementNode($expressionList.list);
    };
    
expressionList returns [List<ASTNode> list]:
    expr=expression {$list = new ArrayList<>(); $list.add($expr.node);}
    (COMMA expr=expression {$list.add($expr.node);})*;
    
ifStatement returns [ASTNode node]:
    IF OPEN_PAREN condExpr=expression CLOSE_PAREN OPEN_BRACE
        stmt=statement
    CLOSE_BRACE
    (ELSE_IF OPEN_PAREN elseIfCond=expression CLOSE_PAREN OPEN_BRACE
        elseIfStmt=statement
    CLOSE_BRACE)*
    (ELSE OPEN_BRACE
        elseStmt=statement
    CLOSE_BRACE)?
    {
        $node = new IfStatementNode(
            $condExpr.node, $stmt.node,
            $elseIfCond.node, $elseIfStmt.node,
            $elseStmt.node
        );
    };

forLoop returns [ASTNode node]:
    FOR OPEN_PAREN
        (init=variableDeclaration | initList+=variableDeclaration)
        SEMICOLON
        cond=expression
        SEMICOLON
        (upd=expression | updList+=expression)
    CLOSE_PAREN OPEN_BRACE
        stmt=statement
    CLOSE_BRACE
    {
        $node = new ForLoopNode(
            $initList.isEmpty() ? $init.node : $initList.get(0).node,
            $cond.node,
            $updList.isEmpty() ? $upd.node : $updList.get(0).node,
            $stmt.node
        );
    };
    
initialization returns [ASTNode node]:
    variableDeclaration { $node = $variableDeclaration.node; };

condition returns [ASTNode cond]: expression { $cond = $expression.node; };

update returns [ASTNode node]:
    expression { $node = $expression.node; };
 
variableDeclaration returns [ASTNode node]:
    scalarType ID ASSIGN expression SEMICOLON
    {
        $node = new VariableDeclarationNode($scalarType.text, $ID.text, $expression.node);
    };
    
variableReference returns [ASTNode node]:
    ID { $node = new VariableReferenceNode($ID.text); }
    ;
    
elementList returns [List<ASTNode> list]:
    el1=element {$list = new ArrayList<>(); $list.add($el1.node);}
    (COMMA el2=element {$list.add($el2.node);})*;

vectorDeclaration returns [ASTNode node]:
    VECTOR ID COLON scalarType ASSIGN OPEN_BRACKET elems=elementList CLOSE_BRACKET SEMICOLON
    {
        $node = new VectorDeclarationNode($ID.text, $scalarType.text, $elems.list);
    };
    
matrixElementList returns [List<List<Object>> list]:
    matrixElement (COMMA matrixElement)*
    {
        $list = new ArrayList<>();
        $list.add($matrixElement.list);
        for (List<Object> elem : $matrixElement.list) {
            $list.add(elem);
        }
    };
  
matrixDeclaration returns [ASTNode node]:
    MATRIX ID COLON scalarType ASSIGN matrixContent SEMICOLON
    {
        $node = new MatrixDeclarationNode($ID.text, $scalarType.text, $matrixContent.list);
    };

matrixContent returns [List<List<Object>> list]:
    OPEN_BRACKET matrixRow (COMMA matrixRow)* CLOSE_BRACKET
    {
        $list = $matrixRow.list;
    };

matrixRow returns [List<Object> list]:
    OPEN_BRACKET elements CLOSE_BRACKET
    {
        $list = $elements.list;
    };

stackDeclaration returns [ASTNode node]:
    STACK ID ASSIGN NEW STACK SEMICOLON
    {
        $node = new StackDeclarationNode($ID.text);
    };
    
pushOperation returns [ASTNode node]:
    ID DOT PUSH OPEN_PAREN expression CLOSE_PAREN SEMICOLON
    {
        $node = new PushOperationNode($ID.text, $expression.node);
    };
    
popOperation returns [ASTNode node]:
    ID DOT POP OPEN_PAREN CLOSE_PAREN SEMICOLON
    {
        $node = new PopOperationNode($ID.text);
    };

relationalOperator: '>' | '<' | '>=' | '<=' | '==' | '!=';

expressionStatement returns [ASTNode node]:
    expression SEMICOLON
    {
        $node = $expression.node;
    };

expression returns [ASTNode node]:
    left=logicalOrExpression
        (op=relationalOperator right=logicalOrExpression
        {
            $node = new ComparisonNode($left.node, $right.node, $op.text);
        })?
    ;

logicalOrExpression returns [ASTNode node]:
    logicalAndExpression (LOGICAL_OR logicalAndExpression)*
    ;

logicalAndExpression returns [ASTNode node]:
    logicalNotExpression (LOGICAL_AND logicalNotExpression)*
    ;

logicalNotExpression returns [ASTNode node]:
    LOGICAL_NOT? additiveExpression
    ;

additiveExpression returns [ASTNode node]:
    multExpr=multExpression (op=ADDITIVE_OPERATOR right=multExpression {$node = new AdditionNode($multExpr.node, $right.node);})*
    ;

multExpression returns [ASTNode node]:
    atomExpr=atom (op=MULTIPLICATIVE_OPERATOR right=atom {$node = new MultiplicationNode($atomExpr.node, $right.node);})*
    ;

atom returns [ASTNode node]:
    INT {$node = new IntNode(Integer.parseInt($INT.text));}
    | ID {$node = new VariableReferenceNode($ID.text);} 
    | FLOAT_LITERAL {$node = new FloatNode(Float.parseFloat($FLOAT_LITERAL.text));}
    | STRING_LITERAL {$node = new StringNode($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));}
    | OPEN_PAREN expression CLOSE_PAREN
    | BOOLEAN_LITERAL {$node = new BooleanNode(Boolean.parseBoolean($BOOLEAN_LITERAL.text));}
    ;

scalarType: INT_TYPE | BOOLEAN_TYPE | STRING_TYPE | FLOAT_TYPE | DOUBLE_TYPE | INT32_TYPE | INT64_TYPE | LONG_TYPE;
type: scalarType | MATRIX;
size: INT;
numRows: INT;
numCols: INT;

vectorExpression: ID ASSIGN OPEN_BRACKET elements CLOSE_BRACKET ;

matrixExpression: ID ASSIGN OPEN_BRACKET matrixElements CLOSE_BRACKET ;

elements returns [List<Object> list]:
    el1=element {$list = new ArrayList<>(); $list.add($el1.node);}
    (COMMA el2=element {$list.add($el2.node);})*;
    
matrixElements returns [List<List<Object>> list]:
    matrixElement (COMMA matrixElement)*
    {
        $list = new ArrayList<>();
        $list.add($matrixElement.list);
        for (List<Object> elem : $matrixElement.list) {
            $list.add(elem);
        }
    };

element returns [ASTNode node]:
    INT {$node = new IntNode(Integer.parseInt($INT.text));}
    | ID {$node = new VariableReferenceNode($ID.text);} 
    | FLOAT_LITERAL {$node = new FloatNode(Float.parseFloat($FLOAT_LITERAL.text));}
    | STRING_LITERAL {$node = new StringNode($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));}
    | OPEN_BRACKET matrixElementList CLOSE_BRACKET // Update for matrix element
    | OPEN_PAREN expression CLOSE_PAREN
    | BOOLEAN_LITERAL {$node = new BooleanNode(Boolean.parseBoolean($BOOLEAN_LITERAL.text));}
    ;

matrixElement returns [List<Object> list]:
    OPEN_BRACKET elements CLOSE_BRACKET
    {
        $list = $elements.list;
    }
    ;
    