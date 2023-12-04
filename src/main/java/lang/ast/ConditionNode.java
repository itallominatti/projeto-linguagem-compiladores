package lang.ast;
import java.util.Map;

public class ConditionNode implements ASTNode {
    private ASTNode expressionNode;

    public ConditionNode(ASTNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return expressionNode.execute(symbolTable);
    }
}
