package sqlancer.common.schema;

import java.util.Optional;

public interface AbstractCompoundDataType<T extends Enum<T>> {

    T getDataType();

    Optional<Integer> getSize();

    default boolean hasElementType() {
        return getElementType() != null;
    }

    AbstractCompoundDataType<T> getElementType();
}
