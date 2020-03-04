/* You define that you want a class to use an interface
 * with the implements keyword. This class must create
 * a method for each method defined in Drivable
 * You can implement more than 1 interface like this
 * public class Vehicle implements Drivable, Crashable
 */
// You make a class part of an abstract class by using 
//the extends keyword
public class Wrestler extends Endurable implements Smashable {
	
	int power = 2;
	double theSpeed = 0;
	int wrestlerEndurance = 0;
	
	// All methods must be as visible as those in the 
	// interface. If they are public in the interface
	// they must be public in the subclass
	public int getPower(){
		return this.power;
	}
	
	public void setPower(int power){
		this.power = power;
	}
	
	public double getSpeed(){
		return this.theSpeed;
	}
	
	public void setSpeed(double speed){
		this.theSpeed = speed;
	}

	public int getEndurance(){
		return this.wrestlerEndurance;
	}

	public void setEndurance(int wrestlerEndurance){
		this.wrestlerEndurance = wrestlerEndurance;
	}
	
	public Wrestler(int power, double speed){
		this.power = power;
		this.theSpeed = speed;
	}
}