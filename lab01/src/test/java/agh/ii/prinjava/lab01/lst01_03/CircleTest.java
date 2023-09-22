package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test void areaTest(){
        Circle A = new Circle(4);
        assertEquals(16*PI, A.area());
    }

    @Test void perimeterTest(){
        Circle B = new Circle(6, false);
        assertEquals(12*PI,B.perimeter());
    }
}