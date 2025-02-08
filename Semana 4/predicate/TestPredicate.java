package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {

        // Create a list of Animal objects
        List<Animal> animals = List.of(
            new Animal("Tiger", "Mammal", 90, "Mele"),
            new Animal("Elephant", "Mammal", 150, "Canopy"),
            new Animal ("Penguin", "Bird", 20, "Louis"),
            new Animal("Tiger", "Mammal", 50, "Mons")
        );

        // Create a new list of Animal objects
        animals = new ArrayList<>(animals);

        // Create a Predicate to filter the list of Animal objects by weight
        Predicate<Animal> weightFilter = e -> e.weight < 80;
        animals.removeIf(weightFilter);
        animals.forEach(System.out::println);

    }
}
