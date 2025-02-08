package lambdasCollection;

import java.util.HashMap;
import java.util.Map;

public class TestLambdasCollection {

    public static void main(String[] args) {
        // Create a HashMap with ZooAnimal objects
        Map<Integer, ZooAnimal> mapZooAnimal = new HashMap<>();

        // Add ZooAnimal objects to the HashMap
        mapZooAnimal.put(1, new ZooAnimal("Tiger", "Mammal", 90, "Mele"));
        mapZooAnimal.put(2, new ZooAnimal("Elephant", "Mammal", 150, "Africa"));
        mapZooAnimal.put(3, new ZooAnimal("Penguin", "Bird", 20, "Antarctica"));
        mapZooAnimal.put(4, new ZooAnimal("Giraffe", "Mammal", 70, "Africa"));
        mapZooAnimal.put(5, new ZooAnimal("Crocodile", "Reptile", 40, "Australia"));
        
        // Print the HashMap just for key and animal
        mapZooAnimal.forEach((k,v)->System.out.println("Index: " + k + "| Animal: " + v.animal));
    }
}
