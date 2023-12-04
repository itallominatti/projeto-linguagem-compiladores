package lang.ast;
import java.util.List;
import java.util.Map;

public class IfStatementNode implements ASTNode {
    private ASTNode condition;
    private List<StatementBlock> statementBlocks;

    public IfStatementNode(ASTNode condition, List<StatementBlock> statementBlocks) {
        this.condition = condition;
        this.statementBlocks = statementBlocks;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object result = condition.execute(symbolTable);
        boolean executed = false;

        for (StatementBlock block : statementBlocks) {
            if ((boolean) result) {
                block.getStatement().execute(symbolTable);
                executed = true;
                break;
            } else if (block.getCondition() != null) {
                result = block.getCondition().execute(symbolTable);
            }
        }

        if (!executed) {
            // If no condition was met, execute the else statement
            StatementBlock elseBlock = statementBlocks.get(statementBlocks.size() - 1);
            ASTNode elseStatement = elseBlock.getStatement();
            if (elseStatement != null) {
                elseStatement.execute(symbolTable);
            }
        }
        return null;
    }

    public static class StatementBlock {
        private ASTNode condition;
        private ASTNode statement;

        public StatementBlock(ASTNode condition, ASTNode statement) {
            this.condition = condition;
            this.statement = statement;
        }

        public ASTNode getCondition() {
            return condition;
        }

        public ASTNode getStatement() {
            return statement;
        }
    }
}
