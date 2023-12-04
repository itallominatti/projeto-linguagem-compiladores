package lang.ast;
import java.util.Map;

public class VariableDeclarationNode implements ASTNode {
    private String type;
    private String identifier;
    private ASTNode expressionNode;

    public VariableDeclarationNode(String type, String identifier, ASTNode expressionNode) {
        this.type = type;
        this.identifier = identifier;
        this.expressionNode = expressionNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object value = expressionNode.execute(symbolTable);
        symbolTable.put(identifier, value);
        return null;
    }
}