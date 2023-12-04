package lang.ast;
import java.util.Map;

public class PrintStatementNode implements ASTNode {
    private ASTNode expressionNode;

    public PrintStatementNode(ASTNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object result = expressionNode.execute(symbolTable);
        System.out.println(result);
        return null; // A impressão já ocorreu, não há necessidade de retorno
    }
}
