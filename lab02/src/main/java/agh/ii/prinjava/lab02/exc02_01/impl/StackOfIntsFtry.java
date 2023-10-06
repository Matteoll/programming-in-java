package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Stack of integers factory that provides different implementations.
 */
public final class StackOfIntsFtry {
    private StackOfIntsFtry() {
    }

    /**
     * Enum representing available stack implementations.
     */
    enum Impln {
        /**
         * Array Based Stack Implementation
         */
        ARRAY_B,

        /**
         * Custom Linked List Based Stack Implementation
         */
        L_LIST_B //
    }

    /**
     * Creates a new instance of a stack of integers based on the specified implementation.
     *
     * @param s The implementation type to create
     * @return A stack of integers with the specified implementation
     */
    static StackOfInts create(Impln s) {
        return switch (s) {
            case ARRAY_B -> new ArrayBasedImpl();
            case L_LIST_B -> new LinkedListBasedImpl();
        };
    }
}








