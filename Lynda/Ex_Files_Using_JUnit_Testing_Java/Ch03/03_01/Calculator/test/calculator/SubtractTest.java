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
public class SubtractTest {
    
    public SubtractTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of minus method, of class Subtract.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        int a = 17;
        int b = 5;
        Subtract instance = new Subtract();
        int expResult = 12;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
     
    }
    
}
