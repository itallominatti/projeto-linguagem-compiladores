package lang.ast;

import java.util.Map;

public class LogicalOrNode implements ASTNode {
    private final ASTNode left;
    private final ASTNode right;

    public LogicalOrNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        boolean leftValue = (boolean) left.execute(symbolTable);
        boolean rightValue = (boolean) right.execute(symbolTable);
        return leftValue || rightValue;
    }
}
