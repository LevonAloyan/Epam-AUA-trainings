package com.company.stack;

/**
 * An interface for Stack data structure.
 * @param <T>
 */
public interface Stack<T> {
    /**
     * Deletes and returns last element of the stack, which is the most recently added(LIFO logic).
     * @return
     */
    T pop();

    /**
     * Inserts new element to the end of the stack (LIFO logic).
     * @param element
     */
    void push(T element);
}
