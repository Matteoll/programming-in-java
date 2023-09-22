package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EagerSingletonTest {
    @Test void getInstanceTest(){
        EagerSingleton S1 = EagerSingleton.getInstance();
        EagerSingleton S2 = EagerSingleton.getInstance();
        assertEquals(S1, S2);
    }

}