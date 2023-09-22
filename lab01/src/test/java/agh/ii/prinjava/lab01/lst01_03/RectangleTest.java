package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test void areaTest(){
        Rectangle A = new Rectangle(4,2);
        assertEquals(8, A.area());
    }

    @Test void perimeterTest(){
        Rectangle B = new Rectangle(6,4, false);
        assertEquals(20,B.perimeter());
    }
}
