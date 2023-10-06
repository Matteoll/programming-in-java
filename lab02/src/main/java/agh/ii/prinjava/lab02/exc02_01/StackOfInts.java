package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */
public interface StackOfInts {
    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return The element removed from the top of the stack
     */
    int pop();

    /**
     * Pushes an integer onto the top of the stack.
     *
     * @param x The integer to be pushed onto the stack
     */
    void push(int x);

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return The number of elements in the stack
     */
    int numOfElems();

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack
     */
    int peek();
}
