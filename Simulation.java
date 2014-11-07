package trafiksimulering;

import trafiksimulering.TrafficSystem.OverflowException;

public class Simulation {

    public static void main(String [] args) throws InterruptedException {
        TrafficSystem newTS = new TrafficSystem();
        for(int i = 0; i < 50; i++){
            try{
            newTS.step();   
            } catch (OverflowException e) {
            	System.out.println("Unable to add more cars to the system.");
                break;
            } finally {
            newTS.print();
            Thread.sleep(500); 
            }
	// Skapar ett TrafficSystem
	// Utf�r stegningen, anropar utskriftsmetoder

        }
        newTS.printStatistics();
    }
}
