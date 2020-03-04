/* If you want to create a class in which every method
 * doesn't have to be implemented use abstract classes.
 */

// Create an abstract class with the abstract keyword
public abstract class Endurable{
	
	boolean wrestlerAwake = true;
	
	public void youFainted(){
		this.wrestlerAwake = false;
	}
	
	public abstract void setEndurance(int wrestlerEndurance);
	
	public abstract int getEndurance();
	
}