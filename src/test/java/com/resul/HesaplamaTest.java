package com.resul;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HesaplamaTest {

    Hesaplama h = new Hesaplama();

    @Test
    public void testTopla() {
        assertEquals(7, h.topla(3, 4));
    }

    @Test
    public void testCikar() {
        assertEquals(2, h.cikar(5, 3));
    }

    @Test
    public void testCarp() {
        assertEquals(15, h.carp(3, 5));
    }

    @Test
    public void testBol() {
        assertEquals(2, h.bol(6, 3));
    }

    @Test
    public void testBolSifir() {
        assertThrows(ArithmeticException.class, () -> h.bol(4, 0));
    }
}
