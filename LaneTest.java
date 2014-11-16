/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulering;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linneadahl
 */
public class LaneTest {
    
    public LaneTest() {
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
     * Test of step method, of class Lane.
     */
    @Test
    public void testStep() {
        System.out.println("step");
        Lane instance = null;
        instance.step();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class Lane.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Lane instance = null;
        Car expResult = null;
        Car result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of firstCar method, of class Lane.
     */
    @Test
    public void testFirstCar() {
        System.out.println("firstCar");
        Lane instance = null;
        Car expResult = null;
        Car result = instance.firstCar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastFree method, of class Lane.
     */
    @Test
    public void testLastFree() {
        System.out.println("lastFree");
        Lane instance = null;
        boolean expResult = false;
        boolean result = instance.lastFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putLast method, of class Lane.
     */
    @Test
    public void testPutLast() {
        System.out.println("putLast");
        Car c = null;
        Lane instance = null;
        instance.putLast(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lane instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
