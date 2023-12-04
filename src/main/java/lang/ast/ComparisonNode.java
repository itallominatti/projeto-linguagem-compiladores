package lang.ast;
import java.util.Map;

public class ComparisonNode implements ASTNode {
    private ASTNode leftNode;
    private ASTNode rightNode;
    private String operator;

    public ComparisonNode(ASTNode leftNode, ASTNode rightNode, String operator) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = leftNode.execute(symbolTable);
        Object rightValue = rightNode.execute(symbolTable);

        // Lógica para avaliar a expressão de comparação
        if (operator.equals(">")) {
            return (int) leftValue > (int) rightValue;
        } else if (operator.equals("<")) {
            return (int) leftValue < (int) rightValue;
        } else if (operator.equals(">=")) {
            return (int) leftValue >= (int) rightValue;
        } else if (operator.equals("<=")) {
            return (int) leftValue <= (int) rightValue;
        } else if (operator.equals("==")) {
            return leftValue.equals(rightValue);
        } else if (operator.equals("!=")) {
            return !leftValue.equals(rightValue);
        } else {
            throw new RuntimeException("Operador relacional desconhecido: " + operator);
        }
    }
}