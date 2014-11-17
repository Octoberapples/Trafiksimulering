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
public class LaneTest {
    
    public LaneTest() {
    }
    

    /**
     * Test of step method, of class Lane.
     */
    
    @Test
    public void testStep() {
        Car instanceCar = new Car(0,0);
        Lane instance = new Lane(3);
        instance.putLast(instanceCar);  
        assertEquals(instance.firstCar(), null);
        instance.step();
        assertEquals(instance.firstCar(), null);
        instance.step();
        assertEquals(instance.firstCar(), instanceCar);
       
    }

 
}
/*
Integration och junit är olika saker. Integration är när man testar hur 
metoder fungerar ihop, medans junit testar individuella metoder för sig.


*/
