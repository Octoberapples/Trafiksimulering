

public class Car {

    private int bornTime;
    private CarPosition destination; 

    private CarPosition currentPosition;
    
    public Car() {
        bornTime = 1;
    }
    
    public Car(int _bornTime) {
        bornTime = _bornTime;
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
        Car a = new Car();
        System.out.println(a.toString());
    }
    

}

