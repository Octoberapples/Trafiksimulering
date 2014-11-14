
package simulering;

/**
 *
 * The class {@code Car} controlls the different cars in the traffic simulation.
 * 
 * @author Linnea Dahl and Axel Boström
 */
public class Car {
      private final int bornTime;
    private final int dest; // 0 f�r rakt fram, 1 f�r v�nstersv�ng

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

