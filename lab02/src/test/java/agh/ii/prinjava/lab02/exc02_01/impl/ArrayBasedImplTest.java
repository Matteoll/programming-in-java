package agh.ii.prinjava.lab02.exc02_01.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayBasedImplTest {
    private ArrayBasedImpl stack;

    @BeforeEach
    public void setUp() {
        stack = new ArrayBasedImpl();
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
        stack.push(30);
        assertEquals(30, stack.peek());

        stack.push(15);
        assertEquals(15, stack.peek());
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

    @Test
    public void testPushPopWithCapacity() {
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        assertEquals(99, stack.pop());
        assertEquals(98, stack.pop());
        assertEquals(98, stack.numOfElems());
    }
}
