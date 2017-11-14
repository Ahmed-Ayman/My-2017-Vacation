/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuite;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Producer
 */
public class SuiteTest1 {
    @Test
    public void testPrintMessage()
    {
        int num=5;
        System.out.println("Suite Test1 is executing");
        Assert.assertEquals(5,num);
    }
    
}
