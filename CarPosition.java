package simulation;

// Håller i en bil och känner till sina "grannar". 
public class CarPosition {
    	
    private Car currentCar = null; // null om ingen bil finns på positionen
	
    private Lane owner;
	
    protected CarPosition forward;
    private CarPosition turn;

    public CarPosition(Lane _owner) 
    {
        owner = _owner;
    }
    
    

    
    public boolean isEnd(CarPosition target)
    {
        return owner.matchEnd(target);
    }

    
	
    public boolean moveForward()
    {
        return false;
        // Flytta bilen fram till forward
    }
	
    public boolean turn()
    {
        return false;
        // Flytta bilen till turn
    }

    public void setTurn(CarPosition turn) {
        this.turn = turn;
    }
    
    public CarPosition getTurn() {
        return turn;
    }
    
    /* public String toString() {
        return "CarPosition(currentCar) = " + + ",
                CarPosition(owner) = " + + ";

    }
    */
    

    public static void main (String [] args) {
        CarPosition ourSpace = new CarPosition(10);
        
    }
}
