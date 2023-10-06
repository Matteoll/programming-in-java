package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Implementation of a stack of integers using a linked list data structure
 */
public class LinkedListBasedImpl implements StackOfInts {
    private Node first = null;
    private int numOfElems = 0;

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
        int elem = first.elem;
        first = first.next;
        numOfElems--;
        return elem;
    }

    /**
     * Pushes an integer onto the top of the stack.
     *
     * @param x The integer to be pushed onto the stack
     */
    @Override
    public void push(int x) {
        Node newNode = new Node(x, first);
        first = newNode;
        numOfElems++;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return The number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return numOfElems;
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
        return first.elem;
    }

    /**
     * Nested class representing a node in the linked list.
     */
    private static class Node {
        int elem;
        Node next;

        public Node(int elem, Node next) {
            this.elem = elem;
            this.next = next;
        }
    }
}
