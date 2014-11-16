
package simulering;

import simulering.TrafficSystem.OverflowException;

/**
 * The Class {@code Simulation} controls the overall traffic simulation; the steps and the printing of the roads and the cars. 
 * 
 * @author Linnea Dahl and Axel Bostrom
 */
public class Simulering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws InterruptedException {
                TrafficSystem newTS = new TrafficSystem();
        for(int i = 0; i < 50; i++){
            try{
            newTS.step();   
            newTS.print();
            } catch (OverflowException e) {
            	System.out.println("Unable to add more cars to the system.\n");
                break;
            } finally {
            Thread.sleep(500); 
            }
        }
        newTS.printStatistics();
    }
    
}
