
package simulering;

/**
 * 
 * The class {@code Light} controlls the traffic lights in the traffic simulation.
 * 
 * @author Linnea Dahl and Axel Boström
 * 
 */
public class Light {
       private final int period;
    private int time;  // Intern klocka: 0, 1, ... period-1, 0, 1 ...
    private final int green; // Signalen gr�n n�r time<green 
    
    public Light(int period, int green) {
        this.period = period - 1;
        time = 0;
        this.green = green - 1;
    }

 public void step() { 
        if(time<period) time++;
        else time = 0;
        // Stegar fram klocka ett steg
    }

    public boolean isGreen()   {
        return time<=green;
        // Returnerar true om time<green, annars false
    }

    public String toString() 
    {
        if (isGreen() == true) return "G";
        else return "R";
    }
}
