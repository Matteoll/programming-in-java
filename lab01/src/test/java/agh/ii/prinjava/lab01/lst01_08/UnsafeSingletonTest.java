package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnsafeSingletonTest {
    @Test void getInstanceTest(){
        UnsafeSingleton S1 = UnsafeSingleton.getInstance();
        UnsafeSingleton S2 = UnsafeSingleton.getInstance();
        assertEquals(S1, S2);
    }

}