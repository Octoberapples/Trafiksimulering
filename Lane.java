

public class Lane {

    public static class OverflowException extends RuntimeException {
        // Undantag som kastas när det inte gick att lägga 
        // in en ny bil på vägen
    }

    //field
    private Car[] theLane;


    //konstruktor
    public Lane(int n) {
        theLane = new Car[n];
        
	// Konstruerar ett Lane-objekt med plats för n fordon
    }

    //metoder
    public void step() {
        for(int i = 1; i <= theLane.length; i++) {
            if(theLane[i-1] == null){
               theLane[i-1] = theLane[i];
               theLane[i] = null;
            }
        }
    }
                                                                                                                                                                                                                                                                 
    // Stega fram alla fordon (utom det på plats 0) ett steg 
    // (om det går). (Fordonet på plats 0 tas bort utifrån 
    // mm h a metoden nedan.)
    

    public Car getFirst() {
        Car first_car = theLane[0];
        theLane[0] = null;
        return first_car;
	// Returnera och tag bort bilen som står först
    }

    public Car firstCar() {
        return theLane[0];
	// Returnera bilen som står först utan att ta bort den
    }


    public boolean lastFree() {
        int len = (theLane.length-1); 
        if (theLane[len] == null) return true;
        else return false;
    }
	// Returnera true om sista platsen ledig, annars false
    

    public void putLast(Car c) throws OverflowException {
        int len = ((theLane.length)-1);
        if (lastFree()) {
            theLane[len] = c;
        }
    }
    
	// Ställ en bil på sista platsen på vägen
	// (om det går).
    
    public String toString() {
        return "Arrayen är " + theLane.length + " lång.";
    }
    
    public static void main (String [] args) {
        Lane a_lane = new Lane(5);
        Car a_car = new Car(1,2);
        a_lane.putLast(a_car);
        System.out.println(a_lane.toString());
            
    }
}

