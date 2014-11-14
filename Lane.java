
package simulering;

/**
 *
 * The class {@code Lane} contains and manages the lane. 
 * 
 * @author Linnea Dahl and Axel Bostrom 
 */
public class Lane {
  
    private final Car[] theLane;



    public Lane(int n) {
        theLane = new Car[n];

    }
/**
 * {@code step()} steps each car in a lane one step forward, i.e. increments the value of each element with 1.
 */

    public void step() {
        for(int i = 0; i <= (theLane.length-2); i++) {
            if (theLane[i] == null){
               theLane[i] = theLane[i+1];
               theLane[i+1] = null;
            }
        }
    }

    /**
     * {@code getFirst()} removes and returns the first car in a lane.
     * @return first_car
     */
    public Car getFirst() {
        Car first_car = theLane[0];
        theLane[0] = null;
        return first_car;
    }
    
    public Car firstCar() {
        return theLane[0];
    }


    public boolean lastFree() {
        int len = (theLane.length-1); 
        return theLane[len] == null;
    }
	
    
    /**
     *
     * @param c - a car from the class Car 
     */

    public void putLast(Car c){
        int len = ((theLane.length)-1);
        if (lastFree()) {
            theLane[len] = c;
        }   
    }
    

    
    public String toString() {
        String lane = "";
        for (Car carPosition : theLane) {
            if (carPosition == null) {
                lane += "-";
            } else {
                lane += "o";
            }
        }
        return lane;
    }

}
