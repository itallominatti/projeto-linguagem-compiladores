package lang.ast;
import java.util.Map;

public class InitializationNode implements ASTNode {
    private ASTNode variableDeclarationNode;

    public InitializationNode(ASTNode variableDeclarationNode) {
        this.variableDeclarationNode = variableDeclarationNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return variableDeclarationNode.execute(symbolTable);
    }
}
