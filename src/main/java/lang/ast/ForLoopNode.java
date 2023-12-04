package lang.ast;
import java.util.Map;

public class ForLoopNode implements ASTNode {
    private ASTNode initializationNode;
    private ASTNode conditionNode;
    private ASTNode updateNode;
    private ASTNode statementNode;

    public ForLoopNode(ASTNode initializationNode, ASTNode conditionNode, ASTNode updateNode, ASTNode statementNode) {
        this.initializationNode = initializationNode;
        this.conditionNode = conditionNode;
        this.updateNode = updateNode;
        this.statementNode = statementNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Lógica para um loop "for"
        // Implemente conforme necessário
        return null;
    }
}