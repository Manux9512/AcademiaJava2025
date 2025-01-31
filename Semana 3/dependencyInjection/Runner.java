package dependencyInjection;

public class Runner {
    private String name;
    Distance myDistance;

    public Runner(String name) {
        this.name = name;
    }

    void raceRegistration(){
        System.out.println("Welcome: " + name);
        myDistance.registration();
    }
    
}
