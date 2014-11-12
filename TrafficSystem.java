package trafiksimulering;

import java.util.Scanner;

public class TrafficSystem {
    
    public static class OverflowException extends RuntimeException {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L; //wat
		public OverflowException() {
        super();
        }
        public OverflowException(String msg) {
        super(msg);
        }
        
        // Undantag som kastas n�r det inte gick att l�gga 
        // in en ny bil p� v�gen
    }
  
    // Definierar de v�gar och signaler som ing�r i det 
    // system som skall studeras.
    // Samlar statistik
    
    // Attribut som beskriver best�ndsdelarna i systemet
    private final Lane  r0;
    private final Lane  r1;
    private final Lane  r2;
    private final Light s1;
    private final Light s2;


    // Diverse attribut f�r simuleringsparametrar (ankomstintensiteter,
    // destinationer...)

    //private int runTime;

    private final int arrivalIntensity;
   
    // Diverse attribut f�r statistiksamling
    private int numberOfPassedCars; //antalet bilar som tagit sig igenom
    private int shortestWaitTime;   //kortaste v�ntetid...
    private int longestWaitTime;    //inte l�ngsta v�ntetid iaf
    private int totalWaitTime;
    private float averageWaitTime;
    private float carFrequency;

    private int time;

    

    public TrafficSystem() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("How long should the simulation last: ");
        //runTime = sc.nextInt();
        System.out.println("Decide the arrival intensity, choose a number between 1 and 100:  ");
        arrivalIntensity = sc.nextInt();
        System.out.println("How long is r0 going to be: ");
        int n = sc.nextInt();
        System.out.println("How long is r1 and r2 going to be: ");
        int m = sc.nextInt();
        System.out.println("How long is the period: ");
        int p = sc.nextInt();
        System.out.println("How long is the straight greentime: ");
        int g1 = sc.nextInt();
        System.out.println("How long is the turn greentime: ");
        int g2 = sc.nextInt();
        sc.close();
        r0 = new Lane(n);
        r1 = new Lane(m);
        r2 = new Lane(m);
        s1 = new Light(p, g1);
        s2 = new Light(p, g2);   

    }

	// L�ser in parametrar f�r simuleringen
	// Metoden kan l�sa fr�n terminalf�nster, dialogrutor
	// eller fr�n en parameterfil. Det sista alternativet
	// �r att f�redra vid uttestning av programmet eftersom
	// man inte d� beh�ver mata in v�rdena vid varje k�rning.
        // Standardklassen Properties �r anv�ndbar f�r detta.     

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
    
    public void printStatistics() {
        setAverageTime();
        setFrequency();
        System.out.println(numberOfPassedCars + " cars have passed through the system in " + time + " seconds.");
        System.out.println("The shortest wait time was " + shortestWaitTime + " seconds long.");
        System.out.println("The longest wait time was " + longestWaitTime + " seconds long.");
        System.out.println("The average wait time was " + averageWaitTime + " seconds long.");
        System.out.println("Estimated frequency of cars leaving the system was " + carFrequency + " cars/second.");
	// Skriv statistiken samlad s� h�r l�ngt
    }
    
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
            throw new OverflowException("No new cars could be added to the system.");
        }

        time++;
	// Stega systemet ett tidssteg m h a komponenternas step-metoder
	// Skapa bilar, l�gg in och ta ur p� de olika Lane-kompenenterna
    }
    

    public void print() {
        System.out.println("\n");
        System.out.println(s1.toString());
        System.out.print(r1.toString());
        System.out.println(r0.toString());
        System.out.println(r2.toString());
        System.out.println(s2.toString()); 

	// Skriv ut en grafisk representation av k�situationen
	// med hj�lp av klassernas toString-metoder
    }
    

}
