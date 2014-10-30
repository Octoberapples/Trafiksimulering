
public class Light {
    private int period;
    private int time;  // Intern klocka: 0, 1, ... period-1, 0, 1 ...
    private int green; // Signalen grön när time<green 
    
    public Light(int _period, int _green) {
        period = _period;
        time = 0;
        green = _green;
    }


    public int getPeriod () {
        return period;
    }

    public int getGreen () {
        return green;
    }

    public int getTime () {
        return time;
    }

    public void step() { 
        if(time<period) time++;
        else time = 0;
        // Stegar fram klocka ett steg
    }

    public boolean isGreen()   {
	if (time<green) return true;
        else return false;

        // Returnerar true om time<green, annars false
    }

    public String toString() {
        return "Light(period) = "+ period + "\n" +
               "Light(time) = " + time + "\n" +
               "Light(green) = " + green;      
    }
    public static void main (String [] args) {
        Light a_light = new Light(1, 2);
        System.out.println(a_light.toString());
    } 	
}