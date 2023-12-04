package lang.ast;
import java.util.Map;

public class AdditionNode implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public AdditionNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    public Object execute(Map<String, Object> symbolTable) {
        // Lógica de execução da adição
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Integer && rightValue instanceof Integer) {
            return (Integer) leftValue + (Integer) rightValue;
        } else if (leftValue instanceof Double && rightValue instanceof Double) {
            return (Double) leftValue + (Double) rightValue;
        } else {
            // Lidar com outros tipos
            return null;
        }
    }
}
