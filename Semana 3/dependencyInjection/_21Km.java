package dependencyInjection;

public class _21Km implements Distance{
    private String distance;

    public _21Km(String distance) {
        this.distance = distance;
    }

    @Override
    public void registration(){
        System.out.println("Registration to: " + distance);
    }
}
