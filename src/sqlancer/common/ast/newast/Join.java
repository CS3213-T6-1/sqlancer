package sqlancer.common.ast.newast;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        public static Type getRandomExcept(Type... exclude) {
            List<Type> available = Arrays.stream(values()).filter(type -> !Arrays.asList(exclude).contains(type))
                    .collect(Collectors.toList());
            return Randomly.fromList(available);
        }

    }

    Type getType();

}
