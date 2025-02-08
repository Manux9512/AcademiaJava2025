package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        //Animal list
        List<Animal> animals = Arrays.asList(
            new Animal("Tiger", "Mammal", 90, "Mele"),
            new Animal("Elephant", "Mammal", 150, "Africa"),
            new Animal ("Penguin", "Bird", 20, "Antarctica"),
            new Animal("Tiger", "Mammal", 50, "Mons")
        );  

        //Animal searched
        String animalSearch = "Tiger";

        //Optional with stream to find the first element with the same name 
        Optional<Animal> animal = animals.stream()
                                .filter(e -> e.getAnimal().equals(animalSearch))
                                .findFirst();

        //Printing the solution
        animal.ifPresent(e -> System.out.println("Animal found! " + e));

    }
}
