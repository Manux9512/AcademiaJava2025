package hasA;

public class Parents {
    String name;

    public Parents(String name) {
        this.name = name;
    }

    boolean allowance (double amount){
        System.out.println("Parents: "+ name + ", Payment: " + amount);
        return true;
    }
    
}
