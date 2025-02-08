package generics;

public class Mammal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mammal [name: " + name + "]";
    }
    
}
