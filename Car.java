

public class Car {

    private int bornTime;
    private int dest; // 1 för rakt fram, 2 för vänstersväng

    // konstruktor och get-metoder
    public Car(int _bornTime, int _dest) {
        bornTime = _bornTime;
        dest = _dest;
    }

    public int getTime () {
        return bornTime;
    }

    public int getDest () {
        return dest;
    }
    
    public String toString() {
        return "Car(bornTime) = "+ bornTime + "\n" +
               "Car(dest) = " + dest;      
    }

    public static void main (String [] args) {
        Car a_car = new Car(1, 2);
        System.out.println(a_car.toString());
    } 
}