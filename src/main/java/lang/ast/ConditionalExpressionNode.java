package lang.ast;
import java.util.Map;

public class ConditionalExpressionNode implements ASTNode {
    private ASTNode leftExpression;
    private ASTNode rightExpression;
    private String operator;

    public ConditionalExpressionNode(ASTNode leftExpression, ASTNode rightExpression, String operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = leftExpression.execute(symbolTable);
        Object rightValue = rightExpression.execute(symbolTable);

        // Avaliar a expressão condicional com base no operador
        if (operator.equals("==")) {
            return leftValue.equals(rightValue);
        } else if (operator.equals("!=")) {
            return !leftValue.equals(rightValue);
        } else if (operator.equals(">")) {
            // Lógica para avaliar a condição de maior que
            // Se leftValue for maior que rightValue, retorne true, senão false
        } else if (operator.equals("<")) {
            // Lógica para avaliar a condição de menor que
            // Se leftValue for menor que rightValue, retorne true, senão false
        } else if (operator.equals(">=")) {
            // Lógica para avaliar a condição de maior ou igual a
            // Se leftValue for maior ou igual a rightValue, retorne true, senão false
        } else if (operator.equals("<=")) {
            // Lógica para avaliar a condição de menor ou igual a
            // Se leftValue for menor ou igual a rightValue, retorne true, senão false
        }

        // Caso nenhum operador corresponda, retorne null ou lance uma exceção
        return null;
    }
}