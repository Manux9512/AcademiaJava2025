package dependencyInjection;

public class TestDependencyInjection {
    public static void main(String[] args) {
        Runner runner = new Runner("Manuel");
        Injector.distanceInjection(runner);
        runner.raceRegistration();
    }
}
