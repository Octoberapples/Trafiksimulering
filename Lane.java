

public class Lane {

    public static class OverflowException extends RuntimeException {
        // Undantag som kastas n�r det inte gick att l�gga 
        // in en ny bil p� v�gen
    }

    //field
    private Car[] theLane;


    //konstruktor
    public Lane(int n) {
        theLane = new Car[n];
        
	// Konstruerar ett Lane-objekt med plats f�r n fordon
    }

    //metoder
    public void step() {
        for(int i = 0; i < (theLane.length-1); i++) {
            if (theLane[i] == null){
               theLane[i] = theLane[i+1];
               theLane[i+1] = null;
            }
        }
    }
                                                                                                                                                                                                                                                                 
    // Stega fram alla fordon (utom det p� plats 0) ett steg 
    // (om det g�r). (Fordonet p� plats 0 tas bort utifr�n 
    // mm h a metoden nedan.)
    

    public Car getFirst() {
        Car first_car = theLane[0];
        theLane[0] = null;
        return first_car;
	// Returnera och tag bort bilen som st�r f�rst
    }

    public Car firstCar() {
        return theLane[0];
	// Returnera bilen som st�r f�rst utan att ta bort den
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
    
	// St�ll en bil p� sista platsen p� v�gen
	// (om det g�r).
    
    public String toString() {
        String lane = "";
        for (int i = 0; i < theLane.length; i++){
            if (theLane[i] == null) {
                lane += "---";
            }else{
                lane += "[X]";
            }
        }
        return lane;
    }

}



