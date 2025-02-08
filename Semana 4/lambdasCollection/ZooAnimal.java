package lambdasCollection;

public class ZooAnimal {
    String animal;
    String animalClass;
    int weight;
    String name;

    public ZooAnimal(String animal, String animalClass, int weight, String name) {
        this.animal = animal;
        this.animalClass = animalClass;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZooAnimal [animal=" + animal + ", animalClass=" + animalClass + ", weight=" + weight + ", name=" + name
                + "]";
    }

    
}
