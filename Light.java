
package simulering;

/**
 * 
 * The class {@code Light} contains and manages the traffic lights and their attributes in the traffic system.
 * 
 * @author Linnea Dahl and Axel Bostrom
 * 
 */
public class Light {
    private final int period;
    private int time; 
    private final int green;
    
    public Light(int period, int green) {
        this.period = period;
        time = 0;
        this.green = green;
    }

 public void step() { 
        if(time<period-1) time++;
        else time = 0;
        
    }
 public int getTime(){
     return this.time;
 }

    public boolean isGreen()   {
        return time<=green;
   
    }

    public String toString() 
    {
        if (isGreen() == true) return "G";
        else return "R";
    }
}
