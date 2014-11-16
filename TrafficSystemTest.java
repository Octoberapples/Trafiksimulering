/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulering;

import java.util.Scanner;
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
public class TrafficSystemTest {
    
    public TrafficSystemTest() {
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
     * Test of inputLoop method, of class TrafficSystem.
     */
    @Test
    public void testInputLoop() {
        System.out.println("inputLoop");
        int i = 0;
        String s = "";
        Scanner sc = null;
        TrafficSystem instance = new TrafficSystem();
        int expResult = 0;
        int result = instance.inputLoop(i, s, sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParameters method, of class TrafficSystem.
     */
    @Test
    public void testSetParameters() {
        System.out.println("setParameters");
        TrafficSystem instance = new TrafficSystem();
        instance.setParameters();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLifeTime method, of class TrafficSystem.
     */
    @Test
    public void testGetLifeTime() {
        System.out.println("getLifeTime");
        Car c = null;
        TrafficSystem instance = new TrafficSystem();
        int expResult = 0;
        int result = instance.getLifeTime(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShortestTime method, of class TrafficSystem.
     */
    @Test
    public void testSetShortestTime() {
        System.out.println("setShortestTime");
        Lane l = null;
        TrafficSystem instance = new TrafficSystem();
        instance.setShortestTime(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLongestTime method, of class TrafficSystem.
     */
    @Test
    public void testSetLongestTime() {
        System.out.println("setLongestTime");
        Lane l = null;
        TrafficSystem instance = new TrafficSystem();
        instance.setLongestTime(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWaitTimes method, of class TrafficSystem.
     */
    @Test
    public void testSetWaitTimes() {
        System.out.println("setWaitTimes");
        Lane ln = null;
        TrafficSystem instance = new TrafficSystem();
        instance.setWaitTimes(ln);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAverageTime method, of class TrafficSystem.
     */
    @Test
    public void testSetAverageTime() {
        System.out.println("setAverageTime");
        TrafficSystem instance = new TrafficSystem();
        instance.setAverageTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrequency method, of class TrafficSystem.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        TrafficSystem instance = new TrafficSystem();
        instance.setFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printStatistics method, of class TrafficSystem.
     */
    @Test
    public void testPrintStatistics() {
        System.out.println("printStatistics");
        TrafficSystem instance = new TrafficSystem();
        instance.printStatistics();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of step method, of class TrafficSystem.
     */
    @Test
    public void testStep() {
        System.out.println("step");
        TrafficSystem instance = new TrafficSystem();
        instance.step();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class TrafficSystem.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        TrafficSystem instance = new TrafficSystem();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
