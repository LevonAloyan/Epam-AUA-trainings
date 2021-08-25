package com.company.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * The class contains custom implementation of the Stack.
 *
 * @param <T>
 */
public class StackImpl<T> implements Stack<T> {
  /** Default initial capacity of the stack is zero. */
  private static final int DEFAULT_INITIAL_CAPACITY = 0;

  /** The buffer for keeping stack elements. */
  private T[] stackData;
  /** The size is the number of elements that stack contains. */
  private int size;

  public StackImpl() {
    this.stackData = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    size = DEFAULT_INITIAL_CAPACITY;
  }

  /**
   * Implementation of LIFO logic for deleting the value. Method deletes and returns the last
   * element of the stack.
   *
   * @return key
   */
  @Override
  public T pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    T key = stackData[size - 1];
    --size;
    stackData = Arrays.copyOfRange(stackData, 0, size - 1);
    return key;
  }

  /**
   * Implementation of LIFO logic for element insertion. The method inserts the new element from the
   * end and increases stack size.
   *
   * @param element
   */
  @Override
  public void push(T element) {
    this.stackData  = Arrays.copyOf(stackData, size + 1);
    ++size;
    stackData[size - 1] = element;
  }

  /**
   * Getter method for the size of the stack.
   *
   * @return size
   */
  public int getSize() {
    return size;
  }
}
