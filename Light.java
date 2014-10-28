public class Light {
    private int period;
    private int time;  // Intern klocka: 0, 1, ... period-1, 0, 1 ...
    private int green; // Signalen grön när time<green. 


    public Light() {
        time = 0;
    }

    public Light(int _period, int _green) {
        period = _period;
        green = _green;
    	}

    public void step() { 
       // Stegar fram klocka ett steg
    }

    public boolean isGreen()   {
    	return false;
    	// Returnerar true om time<green, annars false
    }

    

    public String toString()  {
    	return "Light(period) = " + this.period + "\n" +
               "Light(time) = " + this.time + "\n" + 
               "Light(green) = " + this.green;
    	}
    
    public static void main (String [] args) {
        Light e = new Light(50, 40);
        System.out.println(e.toString());
    }
	
}