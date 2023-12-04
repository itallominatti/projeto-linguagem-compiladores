package lang.ast;
import java.util.Map;

public class TernaryExpressionNode implements ASTNode {
    private ASTNode condition;
    private ASTNode trueExpression;
    private ASTNode falseExpression;

    public TernaryExpressionNode(ASTNode condition, ASTNode trueExpression, ASTNode falseExpression) {
        this.condition = condition;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Avaliar a condição e retornar a expressão verdadeira ou falsa
        boolean conditionResult = (boolean) condition.execute(symbolTable);
        if (conditionResult) {
            return trueExpression.execute(symbolTable);
        } else {
            return falseExpression.execute(symbolTable);
        }
    }
}