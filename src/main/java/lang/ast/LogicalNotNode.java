package lang.ast;

import java.util.Map;

public class LogicalNotNode implements ASTNode {
    private final ASTNode expression;

    public LogicalNotNode(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        boolean value = (boolean) expression.execute(symbolTable);
        return !value;
    }
}