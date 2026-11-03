package org.example;

public class Counter {
    private int count;


    public Counter() {
        count = 0;
    }


    public void increment() {
        count++;
    }


    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }
}
