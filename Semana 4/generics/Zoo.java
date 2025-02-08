package generics;

public class Zoo <T> {
    private T t;

    public Zoo(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
}
