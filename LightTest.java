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
        Light instance1 = new Light(1,1);
        Light instance2 = new Light(2,1);
        instance1.step();
        instance2.step();
        assertEquals(0, instance1.getTime());
        assertEquals(1, instance2.getTime()); 
        
    }

    /**
     * Test of isGreen method, of class Light.
     */
    @Test
    public void testIsGreen() {
        Light instance = new Light(5,1);
        boolean expResult = true;
        boolean result = instance.isGreen();
        assertEquals(expResult, result);
        
    }
}
