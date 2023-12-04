package lang.ast;
import java.util.Map;
import java.util.Stack;

public class PushOperationNode implements ASTNode {
    private String stackIdentifier;
    private ASTNode expressionNode;

    public PushOperationNode(String stackIdentifier, ASTNode expressionNode) {
        this.stackIdentifier = stackIdentifier;
        this.expressionNode = expressionNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Recuperar a pilha da tabela de símbolos
        Stack<Object> stack = (Stack<Object>) symbolTable.get(stackIdentifier);
        // Obter o valor da expressão
        Object value = expressionNode.execute(symbolTable);
        // Realizar a operação de push na pilha
        stack.push(value);
        return null;
    }
}
