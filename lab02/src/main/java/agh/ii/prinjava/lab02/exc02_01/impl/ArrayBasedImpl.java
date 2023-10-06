package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Implementation of a stack of integers using an array-based data structure.
 */
public class ArrayBasedImpl implements StackOfInts {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Constructs an empty stack with the default initial capacity.
     */
    public ArrayBasedImpl() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return The element removed from the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        int topElement = elements[size - 1];
        size--;
        return topElement;
    }

    /**
     * Pushes an integer onto the top of the stack.
     *
     * @param x The integer to be pushed onto the stack
     */
    @Override
    public void push(int x) {
        ensureCapacity();
        elements[size] = x;
        size++;
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return The number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return size;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        return elements[size - 1];
    }

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Ensures that the internal array has enough capacity. If the array is full,
     * its capacity is doubled.
     */
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            int[] newElements = new int[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
}
