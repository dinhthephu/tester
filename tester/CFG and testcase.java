//1. <program> ::= <statement> | <statement> <program>
//2. <statement> ::= WHILE NOT EOF LOOP <loop_body> END LOOP
//3. <loop_body> ::= Read Record <conditional_statement> Print "End Record"
//4. <conditional_statement> ::= IF field1 equals 0 THEN <field1_zero> ELSE <field1_non_zero> ENDIF
//5. <field1_zero> ::= Add field1 to Total Increment Counter
//6. <field1_non_zero> ::= IF field2 equals 0 THEN <field2_zero> ELSE <field2_non_zero> ENDIF
//7. <field2_zero> ::= Print Total, Counter Reset Counter
//8. <field2_non_zero> ::= Subtract field2 from Total

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CFGandtestcase {

    @Test
    void testPath1() {
        Record record = new Record(0, anyValue);
        RecordProcessor processor = new RecordProcessor();
        processor.processRecord(record);
        assertEquals(expectedTotal, processor.getTotal());
        assertEquals(expectedCounter, processor.getCounter());
    }

    @Test
    void testPath2() {
        Record record = new Record(anyNonZeroValue, 0);
        RecordProcessor processor = new RecordProcessor();
        processor.processRecord(record);
        assertEquals(expectedTotal, processor.getTotal());
        assertEquals(0, processor.getCounter());
    }

    @Test
    void testPath3() {
        Record record = new Record(anyNonZeroValue, anyNonZeroValue);
        RecordProcessor processor = new RecordProcessor();
        processor.processRecord(record);
        assertEquals(expectedTotal, processor.getTotal());
        assertEquals(expectedCounter, processor.getCounter());
    }
}
