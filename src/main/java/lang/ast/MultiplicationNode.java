package lang.ast;
import java.util.Map;
public class MultiplicationNode implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public MultiplicationNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    public Object execute(Map<String, Object> symbolTable) {
        // Implementação da execução da multiplicação
        return null;
    }
}
