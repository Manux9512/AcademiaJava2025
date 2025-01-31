package dependencyInjection;

public class _10Km implements Distance{
    private String distance;

    public _10Km(String distance) {
        this.distance = distance;
    }

    @Override
    public void registration(){
        System.out.println("Registration to: " + distance);
    }
    
}
