public class Main{
	public static void main(String[] args){
		
		Wrestler allMight = new Wrestler(100, 100.0);
		
		// Using methods from the interface Smashable
		System.out.println("Power: " + allMight.getPower());
		System.out.println("Speed: " + allMight.getSpeed());
		
		// Using methods from abstract method Endurable
		allMight.setEndurance(50);
        System.out.println("Endurance: " + allMight.getEndurance());
        System.out.println("Special Move: " + Smashable.specialMove);
	}
}