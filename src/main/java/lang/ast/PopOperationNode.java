package lang.ast;
import java.util.Map;
import java.util.Stack;

public class PopOperationNode implements ASTNode {
    private String stackIdentifier;

    public PopOperationNode(String stackIdentifier) {
        this.stackIdentifier = stackIdentifier;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Recuperar a pilha da tabela de símbolos
        Stack<Object> stack = (Stack<Object>) symbolTable.get(stackIdentifier);
        // Realizar a operação de pop na pilha
        Object poppedValue = stack.pop();
        // Retornar o valor removido (pode ser utilizado conforme necessário)
        return poppedValue;
    }
}

