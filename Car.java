
package simulering;

/**
 *
 * The class {@code Car} contains the attributes of the cars in the traffic system.
 * 
 * @author Linnea Dahl and Axel Bostrom
 */
public class Car {
    private final int bornTime;
    private final int dest; 
    
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





