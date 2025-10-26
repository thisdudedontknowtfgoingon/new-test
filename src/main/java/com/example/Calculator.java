package com.example;

public class Calculator {
    // BUG: off-by-one in add
    public int add(int a, int b) {
        return a + b; // intentional bug
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // BUG: wrong zero handling: should throw IllegalArgumentException
    public int divide(int a, int b) {
        if (b == 0) {
            return IllegalArgumentException;
        }
        return a / b;
    }
}
