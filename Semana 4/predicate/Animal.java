package predicate;

public class Animal {
    String animal;
    String animalClass;
    int weight;
    String name;

    public Animal(String animal, String animalClass, int weight, String name) {
        this.animal = animal;
        this.animalClass = animalClass;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [animal=" + animal + ", animalClass=" + animalClass + ", weight=" + weight + ", name=" + name
                + "]";
    }

    public String getAnimal() {
        return animal;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    
}