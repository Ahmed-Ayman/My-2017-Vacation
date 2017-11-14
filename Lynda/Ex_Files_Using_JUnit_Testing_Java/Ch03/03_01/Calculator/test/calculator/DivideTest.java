/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Producer
 */
public class DivideTest {
    
    public DivideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of quotient method, of class Divide.
     */
    @Test
    public void testQuotient() {
        System.out.println("quotient");
        int numerator = 0;
        int denominator = 0;
        Divide instance = new Divide();
        int expResult = 0;
        int result = instance.quotient(numerator, denominator);
        assertEquals(expResult, result);
        numerator = 10;
        denominator = 2;
        expResult = 5;
        result = instance.quotient(numerator, denominator);
        assertEquals(expResult,result);
    }
    
}
