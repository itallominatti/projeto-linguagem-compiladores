package lang.ast;
import java.util.Map;

public class VariableReferenceNode implements ASTNode {
    private String variableName;

    public VariableReferenceNode(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Aqui você pode implementar a lógica para buscar o valor da variável na tabela de símbolos
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName);
        } else {
            // Tratamento para variável não encontrada, se necessário
            throw new RuntimeException("Variável '" + variableName + "' não foi declarada.");
        }
    }
}