package lang.ast;
import java.util.Map;

public class IntNode implements ASTNode {
    private final int value;

    public IntNode(int value) {
        this.value = value;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return value;
    }
}