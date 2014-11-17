/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulering;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linneadahl
 */
public class LightTest {
    
    public LightTest() {
    }
    

    /**
     * Test of step method, of class Light.
     */
    @Test
    public void testStep() {
        System.out.println("step");
        Light instance = null;
        instance.step();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGreen method, of class Light.
     */
    @Test
    public void testIsGreen() {
        System.out.println("isGreen");
        Light instance = null;
        boolean expResult = false;
        boolean result = instance.isGreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
