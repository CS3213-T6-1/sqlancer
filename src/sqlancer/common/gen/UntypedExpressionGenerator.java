package sqlancer.common.gen;

import java.util.ArrayList;
import java.util.List;

import sqlancer.Randomly;
import sqlancer.common.ast.SelectBase;
import sqlancer.common.ast.newast.Expression;
import sqlancer.common.ast.newast.Select;

public abstract class UntypedExpressionGenerator<E extends Expression<?>, C> implements ExpressionGenerator<E> {

    protected List<C> columns;
    protected boolean allowAggregates;

    public E generateExpression() {
        return generateExpression(0);
    }

    public abstract E generateConstant();

    protected abstract E generateExpression(int depth);

    protected abstract E generateColumn();

    @SuppressWarnings("unchecked") // unsafe
    public <U extends UntypedExpressionGenerator<E, C>> U setColumns(List<C> columns) {
        this.columns = columns;
        return (U) this;
    }

    public E generateLeafNode() {
        if (Randomly.getBoolean() && !columns.isEmpty()) {
            return generateColumn();
        } else {
            return generateConstant();
        }
    }

    public List<E> generateExpressions(int nr) {
        List<E> expressions = new ArrayList<>();
        for (int i = 0; i < nr; i++) {
            expressions.add(generateExpression());
        }
        return expressions;
    }

    public List<E> generateExpressions(int nr, int depth) {
        List<E> expressions = new ArrayList<>();
        for (int i = 0; i < nr; i++) {
            expressions.add(generateExpression(depth));
        }
        return expressions;
    }

    // override this class to also generate ASC, DESC
    public List<E> generateOrderBys() {
        return generateExpressions(Randomly.smallNumber() + 1);
    }

    // override this class to generate aggregate functions
    public E generateHavingClause() {
        allowAggregates = true;
        E expr = generateExpression();
        allowAggregates = false;
        return expr;
    }

    @Override
    public E generatePredicate() {
        return generateExpression();
    }

    public <S extends SelectBase<E>> boolean mutateHaving(S select) {
        if (select.getGroupByExpressions().size() == 0) {
            select.setGroupByExpressions(select.getFetchColumns());
            select.setHavingClause(generateHavingClause());
            return false;
        } else {
            if (select.getHavingClause() == null) {
                select.setHavingClause(generateHavingClause());
                return false;
            } else {
                select.setHavingClause(null);
                return true;
            }
        }
    }
}
