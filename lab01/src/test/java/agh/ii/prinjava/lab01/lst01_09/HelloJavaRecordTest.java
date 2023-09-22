package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaRecordTest {
    @Test
    void HelloJavaRecordTestIsEquals(){
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        HelloJavaRecord test1 = new HelloJavaRecord(2, "test2");
        assertTrue(test.equals(test1));
    }

    @Test
    void HelloJavaRecordTestIsHashSame() {
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        HelloJavaRecord test1 = new HelloJavaRecord(2, "test2");
        assertEquals(test.hashCode(), test1.hashCode());
    }
    @Test
    void HelloJavaRecordTestIstoStringIsSame() {
        HelloJavaRecord test = new HelloJavaRecord(2, "test2");
        HelloJavaRecord test1 = new HelloJavaRecord(2, "test2");
        assertEquals(test.toString(), test1.toString());
    }

}