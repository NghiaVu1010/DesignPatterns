public class Main{
    public static void main(String[] args){
       
        Dog luke = new Dog();

        luke.setName("lukeTheSkywalker");

        //System.out.println("Name is " + luke.getName());
        //System.out.println("Dog goes " + luke.getSound());

        luke.digHole();
        //luke.setWeight(-1);
        luke.setWeight(10);
        System.out.println(luke.getWeight());

        // Create a Dog and Cat object with the super class
		// but the Dog and Cat reference type
        Animal kitty = new Cat();
        Animal doggy = new Dog();

        System.out.println("Kitty says: " + kitty.getSound());

        // You can't reference methods, or fields that aren't in Animal
		// if you do, you'll have to cast to the required object
        ((Dog)doggy).digHole();
    }
}