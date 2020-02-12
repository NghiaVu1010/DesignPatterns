public class Cat extends Animal{
    
    // The constructor initializes all objects
    public Cat(){
        // Executes the parents constructor
		// Every class has a constructor whether you make it or not
        super();

        // Sets meow for all Cat objects by default
        setSound("Meow");
    }
}