/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:35:45 GMT 2025
 */

package sqlancer.evosuite.datafusion.gen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.datafusion.DataFusionSchema;
import sqlancer.datafusion.gen.DataFusionBaseExpr;

public class DataFusionBaseExpr_ESTest {

    @Test
    public void test0() throws Throwable {
        LinkedList<DataFusionSchema.DataFusionDataType> linkedList0 = new LinkedList<DataFusionSchema.DataFusionDataType>();
        DataFusionBaseExpr.DataFusionBaseExprCategory dataFusionBaseExpr_DataFusionBaseExprCategory0 = DataFusionBaseExpr.DataFusionBaseExprCategory.UNARY_PREFIX;
        LinkedList<DataFusionBaseExpr.ArgumentType> linkedList1 = new LinkedList<DataFusionBaseExpr.ArgumentType>();
        DataFusionBaseExpr dataFusionBaseExpr0 = new DataFusionBaseExpr("-0.0", 3090,
                dataFusionBaseExpr_DataFusionBaseExprCategory0, linkedList0, linkedList1);
        assertEquals(3090, dataFusionBaseExpr0.nArgs);
        assertFalse(dataFusionBaseExpr0.isVariadic);
    }

    @Test
    public void test1() throws Throwable {
        DataFusionBaseExpr.DataFusionBaseExprCategory dataFusionBaseExpr_DataFusionBaseExprCategory0 = DataFusionBaseExpr.DataFusionBaseExprCategory.FUNC;
        DataFusionSchema.DataFusionDataType dataFusionSchema_DataFusionDataType0 = DataFusionSchema.DataFusionDataType.DOUBLE;
        List<DataFusionSchema.DataFusionDataType> list0 = List.of(dataFusionSchema_DataFusionDataType0,
                dataFusionSchema_DataFusionDataType0, dataFusionSchema_DataFusionDataType0,
                dataFusionSchema_DataFusionDataType0);
        LinkedList<DataFusionBaseExpr.ArgumentType> linkedList0 = new LinkedList<DataFusionBaseExpr.ArgumentType>();
        DataFusionBaseExpr dataFusionBaseExpr0 = new DataFusionBaseExpr("(?eRf[Gd)QhL7RC", (-2792),
                dataFusionBaseExpr_DataFusionBaseExprCategory0, list0, linkedList0, false);
        String string0 = dataFusionBaseExpr0.toString();
        assertEquals((-2792), dataFusionBaseExpr0.nArgs);
        assertNotNull(string0);
        assertFalse(dataFusionBaseExpr0.isVariadic);
    }

    @Test
    public void test2() throws Throwable {
        DataFusionBaseExpr dataFusionBaseExpr0 = DataFusionBaseExpr.createCommonNumericAggrFuncSingleArg("");
        String string0 = dataFusionBaseExpr0.toString();
        assertEquals(1, dataFusionBaseExpr0.nArgs);
        assertFalse(dataFusionBaseExpr0.isVariadic);
        assertNotNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        DataFusionBaseExpr.DataFusionBaseExprCategory dataFusionBaseExpr_DataFusionBaseExprCategory0 = DataFusionBaseExpr.DataFusionBaseExprCategory.BINARY;
        DataFusionSchema.DataFusionDataType dataFusionSchema_DataFusionDataType0 = DataFusionSchema.DataFusionDataType.BOOLEAN;
        List<DataFusionSchema.DataFusionDataType> list0 = List.of(dataFusionSchema_DataFusionDataType0,
                dataFusionSchema_DataFusionDataType0, dataFusionSchema_DataFusionDataType0,
                dataFusionSchema_DataFusionDataType0, dataFusionSchema_DataFusionDataType0,
                dataFusionSchema_DataFusionDataType0, dataFusionSchema_DataFusionDataType0,
                dataFusionSchema_DataFusionDataType0, dataFusionSchema_DataFusionDataType0);
        DataFusionBaseExpr.ArgumentType.Fixed dataFusionBaseExpr_ArgumentType_Fixed0 = new DataFusionBaseExpr.ArgumentType.Fixed(
                list0);
        DataFusionBaseExpr.ArgumentType.SameAsReturnType dataFusionBaseExpr_ArgumentType_SameAsReturnType0 = new DataFusionBaseExpr.ArgumentType.SameAsReturnType();
        List<DataFusionBaseExpr.ArgumentType> list1 = List.of(
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_SameAsReturnType0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0,
                (DataFusionBaseExpr.ArgumentType) dataFusionBaseExpr_ArgumentType_Fixed0);
        DataFusionBaseExpr dataFusionBaseExpr0 = new DataFusionBaseExpr("", (-923),
                dataFusionBaseExpr_DataFusionBaseExprCategory0, list0, list1, true);
        String string0 = dataFusionBaseExpr0.getTextRepresentation();
        assertEquals((-923), dataFusionBaseExpr0.nArgs);
        assertNotNull(string0);
        assertTrue(dataFusionBaseExpr0.isVariadic);
    }

//    @Test
//    public void test4() throws Throwable {
//        DataFusionBaseExpr.ArgumentType.SameAsFirstArgType dataFusionBaseExpr_ArgumentType_SameAsFirstArgType0 = new DataFusionBaseExpr.ArgumentType.SameAsFirstArgType();
//    }

    @Test
    public void test5() throws Throwable {
        DataFusionBaseExpr dataFusionBaseExpr0 = DataFusionBaseExpr.createCommonNumericFuncSingleArg((String) null);
        assertFalse(dataFusionBaseExpr0.isVariadic);
        assertEquals(1, dataFusionBaseExpr0.nArgs);
    }

    @Test
    public void test6() throws Throwable {
        DataFusionBaseExpr dataFusionBaseExpr0 = DataFusionBaseExpr.createCommonNumericFuncTwoArgs("{6/'jDVI%)");
        String string0 = dataFusionBaseExpr0.getTextRepresentation();
        assertNotNull(string0);
        assertEquals(2, dataFusionBaseExpr0.nArgs);
        assertFalse(dataFusionBaseExpr0.isVariadic);
    }

    @Test
    public void test7() throws Throwable {
        DataFusionBaseExpr dataFusionBaseExpr0 = DataFusionBaseExpr.createCommonNumericAggrFuncSingleArg((String) null);
        dataFusionBaseExpr0.getTextRepresentation();
        assertEquals(1, dataFusionBaseExpr0.nArgs);
        assertFalse(dataFusionBaseExpr0.isVariadic);
    }

    @Test
    public void test8() throws Throwable {
        DataFusionBaseExpr.DataFusionBaseExprCategory dataFusionBaseExpr_DataFusionBaseExprCategory0 = DataFusionBaseExpr.DataFusionBaseExprCategory.AGGREGATE;
        LinkedList<DataFusionSchema.DataFusionDataType> linkedList0 = new LinkedList<DataFusionSchema.DataFusionDataType>();
        DataFusionBaseExpr dataFusionBaseExpr0 = new DataFusionBaseExpr((String) null, 0,
                dataFusionBaseExpr_DataFusionBaseExprCategory0, linkedList0,
                (List<DataFusionBaseExpr.ArgumentType>) null, false);
        dataFusionBaseExpr0.toString();
        assertFalse(dataFusionBaseExpr0.isVariadic);
        assertEquals(0, dataFusionBaseExpr0.nArgs);
    }

    @Test
    public void test9() throws Throwable {
        DataFusionBaseExpr dataFusionBaseExpr0 = DataFusionBaseExpr.createCommonNumericAggrFuncSingleArg("");
        DataFusionBaseExpr.ArgumentType.Fixed dataFusionBaseExpr_ArgumentType_Fixed0 = new DataFusionBaseExpr.ArgumentType.Fixed(
                dataFusionBaseExpr0.possibleReturnTypes);
        List<DataFusionSchema.DataFusionDataType> list0 = dataFusionBaseExpr_ArgumentType_Fixed0.getType();
        assertNotNull(list0);
        assertEquals(2, list0.size());
        assertFalse(dataFusionBaseExpr0.isVariadic);
        assertEquals(1, dataFusionBaseExpr0.nArgs);
    }
}
