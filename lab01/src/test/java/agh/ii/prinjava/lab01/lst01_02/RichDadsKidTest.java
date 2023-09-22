package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RichDadsKidTest {
    @Test void increaseWealthKidTest(){
        RichDad richDad = new RichDad("R", "Doe", BigDecimal.valueOf(1), List.of("School Mate"));
        RichDadsKid richDadsKid =
                new RichDadsKid("Mike", richDad.surname, richDad.getFortune(), richDad.getContacts());
        richDadsKid.increaseWealth();
        assertEquals(BigDecimal.valueOf(3),richDadsKid.getFortune());
    }
}