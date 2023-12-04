package lang.ast;
import java.util.List;
import java.util.Map;

public class VectorDeclarationNode implements ASTNode {
    private String identifier;
    private String type;
    private int vecSize;
    private List<ASTNode> elements;

    public VectorDeclarationNode(String identifier, String type, int vecSize, List<ASTNode> elements) {
        this.identifier = identifier;
        this.type = type;
        this.vecSize = vecSize;
        this.elements = elements;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        return null;
    }
}