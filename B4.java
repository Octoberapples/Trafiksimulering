public class Egendom {

    //fields
    public int area;
    public int location;

    //constructor
    public Egendom(int area, int location) {
	area = _area;
	location = _ location;
    }
    
    //methods
    public int skatt() {

	|
	|
	v
  
    }

}


public class Hus extends Egendom {

    //field
    public int furniture;

    //constructor
    public Hus(int furniture) {
	furniture =_furniture;
    }

    //method
    

}


//private members of the superclass cannot be accessed directly from the subclass
//constructors are not inherited, but you can can call it by using the keyword super
//http://en.wikipedia.org/wiki/Polymorphism_%28computer_science%29