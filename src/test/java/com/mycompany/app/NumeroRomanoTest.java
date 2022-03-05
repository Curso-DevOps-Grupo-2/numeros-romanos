package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalToRomanoTest {
    
    @Test
    public void testDecToRomano() {

        assertEquals("I", NumeroRomano.decToRomano(1));
        assertEquals("II", NumeroRomano.decToRomano(2));
        assertEquals("XIV", NumeroRomano.decToRomano(14));
        assertEquals("XIV", NumeroRomano.decToRomano(14));
        assertEquals("CCXLIX", NumeroRomano.decToRomano(249));
        assertEquals("CCLV", NumeroRomano.decToRomano(255));
        assertEquals("CXLV", NumeroRomano.decToRomano(145));
        assertEquals("M", NumeroRomano.decToRomano(1000));
        

    }
}
