package lang.ast;
import java.util.Map;

public class UpdateNode implements ASTNode {
    private ASTNode expressionNode;

    public UpdateNode(ASTNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return expressionNode.execute(symbolTable);
    }
}