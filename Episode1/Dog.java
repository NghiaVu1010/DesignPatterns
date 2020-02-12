public class Dog extends Animal{
    
    public void digHole(){
        System.out.println("Dug a hole");
    }

    // The constructor initializes all objects
    public Dog(){
        // Executes the parents constructor
		// Every class has a constructor whether you make it or not
        super();

        // Sets bark for all Dog objects by default
        setSound("Bark");
    }
}