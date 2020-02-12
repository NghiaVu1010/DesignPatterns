public class Animal{

    // Create known variables
    private String name;
    private double height;
    private int weight;
    private String sound;

    // Setters and Getters (Accessors and Mutators)
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }
    public double getHeight(){
        return height;
    }

    // Create logic to handle passed parameters
    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        } else {
            System.out.println("You dumb");
        }
    }
    public int getWeight(){
        return weight;
    }

    public void setSound(String newSound){
        sound = newSound;
    }
    public String getSound(){
        return sound;
    }

    // Creates the objects and allows interaction
    public static void main(String[] args){
        Animal dog = new Animal();

        dog.setName("lukeTheSkywalker");

        System.out.println(dog.getName());
    }
}