package simulation;
public class Car {
    
    private int bornTime;
    private CarPosition destination; 

    private CarPosition currentPosition;
    
    public Car() {
        bornTime = 0;
    }
    
    public Car(int bT, CarPosition dest) {
        bornTime = bT;
        destination = dest;
    }

    public void step()
    {   
        
    	// Uppdatera bilen ett tidssteg
    }


    // konstruktor och get- oct set-metoder
    //...

    public String toString() {
        return "Car(bornTime) = " + this.bornTime + "\n" +
               "Car(destination) = " + this.destination + "\n" +
               "Car(currentPosition) = " + this.currentPosition;
    }
    
    public static void main (String [] args){
        Car a_car = new Car();
        System.out.println(a_car.toString());
    }
    

}
