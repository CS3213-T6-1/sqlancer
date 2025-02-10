package sqlancer.common.ast.newast;

import sqlancer.Randomly;
import sqlancer.common.schema.AbstractTable;
import sqlancer.common.schema.AbstractTableColumn;

public interface Join<E extends Expression<C>, T extends AbstractTable<C, ?, ?>, C extends AbstractTableColumn<?, ?>>
        extends Expression<C> {

    void setOnClause(E onClause);

    enum Type {
        INNER, LEFT, RIGHT, FULL, CROSS;

        public static Type getRandom() {
            return Randomly.fromOptions(values());
        }

    }

    Type getType();

}
