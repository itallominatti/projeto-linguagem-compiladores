package lang.ast;
import java.util.List;
import java.util.Map;

public class MatrixDeclarationNode implements ASTNode {
    private String identifier;
    private String type;
    private int rows;
    private int cols;
    private List<List<Object>> elements;

    public MatrixDeclarationNode(String identifier, String type, int rows, int cols, List<List<Object>> elements) {
        this.identifier = identifier;
        this.type = type;
        this.rows = rows;
        this.cols = cols;
        this.elements = elements;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        
        return null;
    }
}