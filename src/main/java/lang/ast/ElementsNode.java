package lang.ast;
import java.util.List;
import java.util.Map;

public class ElementsNode implements ASTNode {
    private List<ASTNode> list;

    public ElementsNode(List<ASTNode> list) {
        this.list = list;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Implementation for execution
        return null;
    }
}
