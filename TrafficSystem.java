
package simulering;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * The class {@code TrafficSystem} gets the parameters for the traffic simulation, controls the steps and prints the statistics.
 * 
 * @author Linnea Dahl and Axel Boström
 * 
 */

public class TrafficSystem {
    
    public static class OverflowException extends RuntimeException {


		public OverflowException() {
        super();
        }
        public OverflowException(String msg) {
        super(msg);
        }

    }
  

    private Lane  r0, r1, r2;
    private Light s1, s2;


    private int numberOfPassedCars, shortestWaitTime, longestWaitTime, totalWaitTime, time, arrivalIntensity; 
    private float averageWaitTime, carFrequency;


    
    public TrafficSystem() {
    	setParameters();
    }
    
    /**
     * {@code inputLoop} loops the input until the int is neither a letter nor an integer. 
     *
     * @return the new parameter
     */
    
    public int inputLoop(int i, String s, Scanner sc) {
    	String posValue = "\nPlease enter a positive integer.\n";
   		while(i < 0){

   			System.out.println(s);   
   			try{
   			i = sc.nextInt();
   			
   			} catch (InputMismatchException e){
 			   System.out.println(posValue);
 			   sc.next();
 	   		}
		}
   		return i;
    }

    /**
     *  {@code setParameters} sets the parameters for the traffic simulation.
     */
   	public void setParameters() {
   		Scanner sc = new Scanner(System.in);
   		int n = -1, m = -1, t = -1, p = -1, g1 = -1, g2 = -1;
   		String aI = "Percentual chance of cars arriving to the system (positive integer):  ";
   		String lane1 = "How long is the first lane (positive integer): ";
   		String lane2 = "How long are the double lanes (positive integer):  ";
   		String per = "How long is the period (positive integer):  ";
   		String green1 = "How long is the straight greentime (positive integer):  ";
   		String green2 = "How long is the turn greentime (positive integer):  ";
   		
   		
   		arrivalIntensity = inputLoop(n, aI, sc);  ;

   		r0 = new Lane(inputLoop(m, lane1, sc));
   		t = inputLoop(t, lane2, sc);
   		r1 = new Lane(t);
   		r2 = new Lane(t);
   		p = inputLoop(p, per, sc);	
   		g1 = inputLoop(g1, green1, sc);
   		g2 = inputLoop(g2, green2, sc);
   		
   		if(p<g1) {
   			System.out.println("Please enter values where period > straight greentime:\nEnter a length of period: ");
   			p = sc.nextInt();
   			System.out.println("Enter the length of the straight greentime: ");
   			g1 = sc.nextInt();
           		
   		}
   		if (p<g2) {
   			System.out.println("Please enter values where period > turn greentime.\nEnter a value for period: ");
   			p = sc.nextInt();
   			System.out.println("Enter the length of the turn greentime: ");
   			g2 = sc.nextInt();
   		} 
   		s1 = new Light(p, g1);
   		s2 = new Light(p, g2);
   		sc.close(); 	
   		
   		
   	}


    public int getLifeTime (Car c) {
        return (this.time - c.getTime());
    }
    
    public void setShortestTime(Lane l) {
        if (shortestWaitTime == 0 || shortestWaitTime > getLifeTime(l.firstCar())) {
            shortestWaitTime = getLifeTime(l.firstCar());
        }
    }
    
    public void setLongestTime(Lane l) { 
        if (longestWaitTime == 0 || longestWaitTime < getLifeTime(l.firstCar())) {
            longestWaitTime = getLifeTime(l.firstCar());
            
        }
    }

    public void setWaitTimes (Lane ln) {
        setShortestTime(ln);
        setLongestTime(ln);
    }
    
    public void setAverageTime() {
        averageWaitTime = (float)totalWaitTime/(float)numberOfPassedCars; 
    } 
    
    public void setFrequency() {
        carFrequency = (float)numberOfPassedCars/(float)time;
    }
    /**
     * {@code printStatistics} prints the statistics from the traffic simulation. 
     */
    public void printStatistics() {
        setAverageTime();
        setFrequency();
        System.out.println(numberOfPassedCars + " cars have passed through the system in " + time + " seconds.");
        System.out.println("The shortest wait time was " + shortestWaitTime + " seconds long.");
        System.out.println("The longest wait time was " + longestWaitTime + " seconds long.");
        System.out.println("The average wait time was " + averageWaitTime + " seconds long.");
        System.out.println("Estimated frequency of cars leaving the system was " + carFrequency + " cars/second.");
	
    }
    
    /**
     * {@code step} steps the simulation forward.
     * @throws simulering.TrafficSystem.OverflowException - if there are too many cars 
     */
    
    public void step() throws OverflowException {
        s1.step();
        s2.step();
        if (s1.isGreen()) {                         
            if (r1.firstCar() != null){
                setWaitTimes(r1);
                this.numberOfPassedCars += 1;
                totalWaitTime += getLifeTime(r1.firstCar());
            }
        }
        if (s2.isGreen()) {
            r1.getFirst();
            if (r2.firstCar() != null){
                setWaitTimes(r2);
                this.numberOfPassedCars += 1;
                totalWaitTime += getLifeTime(r2.firstCar());
            }
            r2.getFirst();
        }
        r1.step();
        r2.step();
        if (r0.firstCar() != null) {
            if (r0.firstCar().getDest() == 0 && r1.lastFree()) {
                Car c = r0.getFirst();
                r1.putLast(c);
            }else if (r0.firstCar().getDest() == 1 && r2.lastFree()){
                Car c = r0.getFirst();
                r2.putLast(c);
            }
        }
        r0.step();
        if (Math.random() <= ((float)arrivalIntensity/100f) && r0.lastFree() == true) {
            Car new_car = new Car(time, ((Math.random()>=0.5)?1:0));
            r0.putLast(new_car);
        }else if (r0.lastFree() == false) {
            throw new OverflowException();
        }

        time++;

    }
    
    /**
     * {@code print} prints the graph resembling the cars, the lanes and the lights. 
     */

    public void print() {
        System.out.println("\n");
        System.out.println(s1.toString());
        System.out.print(r1.toString());
        System.out.println(r0.toString());
        System.out.println(r2.toString());
        System.out.println(s2.toString()); 

    }
    

}
