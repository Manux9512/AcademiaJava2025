package dependencyInjection;

public class _42Km implements Distance{
    private String distance;

    public _42Km(String distance) {
        this.distance = distance;
    }

    @Override
    public void registration(){
        System.out.println("Registration to: " + distance);
    }
}
