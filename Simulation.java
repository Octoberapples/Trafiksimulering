import java.lang.*;
public class Simulation{


    public static void main(String [] args) throws InterruptedException {
        TrafficSystem newTS = new TrafficSystem();
        for(int i = 0; i < 100; i++){
            newTS.step();
            newTS.print();
            Thread.sleep(1000);    


	// Skapar ett TrafficSystem
	// Utför stegningen, anropar utskriftsmetoder

        }
    }
}
