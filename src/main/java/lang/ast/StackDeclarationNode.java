package lang.ast;
import java.util.Stack;
import java.util.Map;

public class StackDeclarationNode implements ASTNode {
    private String identifier;

    public StackDeclarationNode(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Lógica para criar e manipular uma pilha na execução
        Stack<Object> stack = new Stack<>();
        // Colocar a pilha na tabela de símbolos
        symbolTable.put(identifier, stack);
        return null;
    }
}