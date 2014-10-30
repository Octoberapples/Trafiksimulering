public class Egendom {

    //fields
    public int area;
    public int location;

    //constructor
    public Egendom(int _area, int _location) {
	area = _area;
	location = _location;
    }
    
    //methods
    
    public int mkProperty(int area, int location) {
        Egendom a_property = new Egendom(area, location);
    }

    public int skatt() {
        return (a_property.area + a_property.location); 
    }
}


public class Hus extends Egendom {

    //field
    public int furniture;

    //constructor
    public Hus(int _furniture) {
        furniture =_furniture;
        
    }

   
    //method

    
    public int skatt(int n) {
        Hus a_house = new Hus(n);
        return (super.skatt() - furniture);
    }  
        
    public static void main () {
        System.out.println("Husets skatt är: " + )
    }

}


//private members of the superclass cannot be accessed directly from the subclass
//constructors are not inherited, but you can can call it by using the keyword super
//http://en.wikipedia.org/wiki/Polymorphism_%28computer_science%29