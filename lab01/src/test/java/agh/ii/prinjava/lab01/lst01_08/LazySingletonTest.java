package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {
    @Test void getInstanceTest(){
        LazySingleton S1 = LazySingleton.getInstance();
        LazySingleton S2 = LazySingleton.getInstance();
        assertTrue(S1 == S2);
    }

}