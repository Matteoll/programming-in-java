package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListBasedImplTest {
    private LinkedListBasedImpl stack;
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
        stack = new LinkedListBasedImpl();
    }

    @Test
    public void testEmptyStack() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.numOfElems());
        assertThrows(IllegalStateException.class, () -> stack.pop());
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }

    @Test
    public void testPushPop() {
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.numOfElems());
    }

    @Test
    public void testPeek() {
        stack.push(42);
        assertEquals(42, stack.peek());

        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    public void testNumOfElems() {
        assertEquals(0, stack.numOfElems());

        stack.push(1);
        assertEquals(1, stack.numOfElems());

        stack.push(2);
        assertEquals(2, stack.numOfElems());

        stack.pop();
        assertEquals(1, stack.numOfElems());

        stack.pop();
        assertEquals(0, stack.numOfElems());
    }
}

