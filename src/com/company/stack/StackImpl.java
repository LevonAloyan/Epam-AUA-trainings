package com.company.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackImpl<T> implements Stack{
    private T[] array;

    public StackImpl() {
        this.array = (T[]) new Object[0];
    }

    @Override
    public T pop() {
        if (array.length == 0){
            throw new EmptyStackException();
        }
        T x = this.array[this.array.length - 1];

        T[] newArray = (T[]) new Object[this.array.length - 1];

        for (int i = 0; i < this.array.length - 1;i++){
            newArray[i] = array[i];
        }

        this.array = newArray;

        return x;
    }

    @Override
    public void push(Object element) {
        T[] newArray = (T[]) new Object[this.array.length + 1];

        for (int i = 0; i < this.array.length;i++){
            newArray[i] = array[i];
        }

        newArray[this.array.length] = (T) element;
        this.array = newArray;
    }


    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
