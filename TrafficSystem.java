import java.util.Scanner;
import java.util.Random;

public class TrafficSystem {
    // Definierar de vägar och signaler som ingår i det 
    // system som skall studeras.
    // Samlar statistik
    
    // Attribut som beskriver beståndsdelarna i systemet
    private Lane  r0;
    private Lane  r1;
    private Lane  r2;
    private Light s1;
    private Light s2;


    // Diverse attribut för simuleringsparametrar (ankomstintensiteter,
    // destinationer...)

    //private int runTime;

    private int arrivalIntensity;
    private int destination;
   
    // Diverse attribut för statistiksamling
    private int numberOfPassedCars; //antalet bilar som tagit sig igenom
    private int shortestWaitTime; //kortaste väntetid...
    private int longestWaitTime; //inte längsta väntetid iaf
    

    private int time = 0;


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
        System.out.println("How long is the greentime: ");
        int g = sc.nextInt();

        r0 = new Lane(n);
        r1 = new Lane(m);
        r2 = new Lane(m);
        s1 = new Light(p, g);
        s2 = new Light(p, g);

    }

public static int randInt(int min, int max) {


    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}


	// Läser in parametrar för simuleringen
	// Metoden kan läsa från terminalfönster, dialogrutor
	// eller från en parameterfil. Det sista alternativet
	// är att föredra vid uttestning av programmet eftersom
	// man inte då behöver mata in värdena vid varje körning.
        // Standardklassen Properties är användbar för detta.     

    public void step() {

        s1.step();
        s2.step();
        if (s1.isGreen()) {
                r1.getFirst();
            }
        if (s2.isGreen()) {
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
        }
        time++;
	// Stega systemet ett tidssteg m h a komponenternas step-metoder
	// Skapa bilar, lägg in och ta ur på de olika Lane-kompenenterna
    }

    public void printStatistics() {
	// Skriv statistiken samlad så här långt
    }

    public void print() {
        System.out.println("\n");
        System.out.println(s1.toString());
        System.out.print(r1.toString());
        System.out.println(r0.toString());
        System.out.println(r2.toString());
        System.out.println(s2.toString()); 

	// Skriv ut en grafisk representation av kösituationen
	// med hjälp av klassernas toString-metoder
    }


}