

public class Car {

    private int bornTime;
    private int dest; // 1 f�r rakt fram, 2 f�r v�nstersv�ng

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
    
}