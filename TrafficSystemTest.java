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
public class TrafficSystemTest {
    
    public TrafficSystemTest() {
    }
  
    @Test
    public void testStep() {
        System.out.println("step");
        TrafficSystem instance = new TrafficSystem();
        instance.step();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
