package trafiksimulering;

public class Lane {

    //field
    private final Car[] theLane;


    //konstruktor
    public Lane(int n) {
        theLane = new Car[n];
        
	// Konstruerar ett Lane-objekt med plats fï¿½r n fordon
    }

    //metoder
    public void step() {
        for(int i = 0; i <= (theLane.length-2); i++) {
            if (theLane[i] == null){
               theLane[i] = theLane[i+1];
               theLane[i+1] = null;
            }
        }
    }
    
    // Stega fram alla fordon (utom det pï¿½ plats 0) ett steg 
    // (om det gï¿½r). (Fordonet pï¿½ plats 0 tas bort utifrï¿½n 
    // mm h a metoden nedan.)
    
    /**
     * @return first_car
     */
    public Car getFirst() {
        Car first_car = theLane[0];
        theLane[0] = null;
        return first_car;
	// Returnera och tag bort bilen som står först 
    }
    
    public Car firstCar() {
        return theLane[0];
	// Returnera bilen som stï¿½r fï¿½rst utan att ta bort den
    }


    public boolean lastFree() {
        int len = (theLane.length-1); 
        return theLane[len] == null;
    }
	// Returnera true om sista platsen ledig, annars false
    

    public void putLast(Car c){
        int len = ((theLane.length)-1);
        if (lastFree()) {
            theLane[len] = c;
        }   
    }
    
	// Stï¿½ll en bil pï¿½ sista platsen pï¿½ vï¿½gen
	// (om det gï¿½r).
    
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
