package generics;

public class TestGenerics {
    public static void main(String[] args) {
        
        // Create a Zoo object with a Mammal with mammal and fish
        Zoo<Mammal> mammal1 = new Zoo<Mammal>(new Mammal("Pig"));
        Zoo<Fish> fish1 = new Zoo<Fish>(new Fish("Tuna"));
        
        // Get the name of the Mammal and Fish
        Mammal mammalName = mammal1.getT();
        Fish fishName = fish1.getT();

        // Print the name of the Mammal and Fish
        System.out.println(mammalName);
        System.out.println(fishName);

    }
    
    
}
