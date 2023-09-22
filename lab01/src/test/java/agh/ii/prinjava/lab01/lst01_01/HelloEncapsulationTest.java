package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {
    @Test void setPropValTest(){
        HelloEncapsulation EncapsVar = new HelloEncapsulation(4);
        EncapsVar.setPropVal(5);
        assertEquals(EncapsVar.getPropVal(),5);

    }


}