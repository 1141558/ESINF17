/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André Silva
 */
public class stringTest {
    
    public stringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of original method, of class string.
     */
    @Test
    public void testOriginal() {
        System.out.println("original");
        String string2 = "teste";
        String expResult = "teste";
        String result = string.original(string2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of reverse method, of class string.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        String string2 = "string";
        String expResult = "gnirts";
        String result = string.reverse(string2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
