/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 13:36:19 GMT 2025
 */

package sqlancer.evosuite.materialize;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import sqlancer.common.schema.AbstractCompoundDataType;
import sqlancer.materialize.MaterializeCompoundDataType;
import sqlancer.materialize.MaterializeSchema;

public class MaterializeCompoundDataType_ESTest {

    @Test
    public void test0() throws Throwable {
        MaterializeCompoundDataType materializeCompoundDataType0 = MaterializeCompoundDataType
                .create((MaterializeSchema.MaterializeDataType) null);
        materializeCompoundDataType0.getDataType();
        assertFalse(materializeCompoundDataType0.hasElementType());
    }

    @Test
    public void test1() throws Throwable {
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.REAL;
        MaterializeCompoundDataType materializeCompoundDataType0 = MaterializeCompoundDataType
                .create(materializeSchema_MaterializeDataType0);
        materializeCompoundDataType0.getSize();
        assertFalse(materializeCompoundDataType0.hasElementType());
    }

    @Test
    public void test2() throws Throwable {
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.BOOLEAN;
        MaterializeCompoundDataType materializeCompoundDataType0 = MaterializeCompoundDataType
                .create(materializeSchema_MaterializeDataType0, (-146));
        materializeCompoundDataType0.getSize();
        assertFalse(materializeCompoundDataType0.hasElementType());
    }

    @Test
    public void test3() throws Throwable {
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.BOOLEAN;
        MaterializeCompoundDataType materializeCompoundDataType0 = MaterializeCompoundDataType
                .create(materializeSchema_MaterializeDataType0);
        // Undeclared exception!
        try {
            materializeCompoundDataType0.getElemType();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test4() throws Throwable {
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.BOOLEAN;
        MaterializeCompoundDataType materializeCompoundDataType0 = MaterializeCompoundDataType
                .create(materializeSchema_MaterializeDataType0);
        AbstractCompoundDataType<MaterializeSchema.MaterializeDataType> abstractCompoundDataType0 = materializeCompoundDataType0
                .getElementType();
        assertNull(abstractCompoundDataType0);
        assertFalse(materializeCompoundDataType0.hasElementType());
    }

    @Test
    public void test5() throws Throwable {
        MaterializeSchema.MaterializeDataType materializeSchema_MaterializeDataType0 = MaterializeSchema.MaterializeDataType.BOOLEAN;
        MaterializeCompoundDataType materializeCompoundDataType0 = MaterializeCompoundDataType
                .create(materializeSchema_MaterializeDataType0);
        materializeCompoundDataType0.getDataType();
        assertFalse(materializeCompoundDataType0.hasElementType());
    }
}
