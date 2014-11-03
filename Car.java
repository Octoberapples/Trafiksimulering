

public class Car {

    private int bornTime;
    private int dest; // 0 för rakt fram, 1 för vänstersväng

    // konstruktor och get-metoder
    public Car(int bornTime, int dest) {
        this.bornTime = bornTime;
        this.dest = dest;
    }

    public int getTime () {
        return bornTime;
    }

    public int getDest () {
        return dest;
    }
    
}