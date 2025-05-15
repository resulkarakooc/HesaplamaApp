package com.resul;

public class Hesaplama {

    public int topla(int a, int b) {
        return a + b;
    }

    public int cikar(int a, int b) {
        return a - b;
    }

    public int carp(int a, int b) {
        return a * b;
    }

    public int bol(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Bölen 0 olamaz.");
        }
        return a / b;
    }
}

