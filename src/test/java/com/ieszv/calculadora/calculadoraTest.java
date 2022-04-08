/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ieszv.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VICTOR
 */
public class calculadoraTest {
    
    public calculadoraTest() {
    }

    /**
     * Test of sumar method, of class calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double numero1 = 0.0;
        double numero2 = 0.0;
        double expResult = 0.0;
        double result = calculadora.sumar(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
