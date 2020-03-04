/* Java doesn't allow you to inherit from more than one 
 * class. So, what do you do when you want do you do
 * when you want to add additional functionality?
 * You create an interface. Interfaces are empty 
 * classes. They provide all of the methods you must
 * use, but none of the code.
 */

// This is how you define an interface. They normally
// have a name that is an adjective. Adjectives modify
// nouns. Most objects have noun names
public interface Smashable {
	
	// You can put fields in an interface, but understand 
	// that their values are final and can't be changed
	String specialMove = "Detroit Smash";
	
	// All methods in an interface must be implemented
	// They are public and abstract by default
	// An abstract method must be defined by any class 
	// that uses the interface
	int getPower();
	
	// You can't define a method as final and abstract
	// final means the method can't be changed and 
	// abstract means it must be changed
	void setPower(int power);
	
	double getSpeed();
	
	void setSpeed(double speed);
}