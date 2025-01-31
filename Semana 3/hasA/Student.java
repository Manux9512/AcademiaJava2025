package hasA;

public class Student {
    String name;
    Parents parents;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

    //Delegación, Parents tienen el método allowance.
    void payment(double amount){
        boolean result = parents.allowance(amount);
        System.out.println(result);
    }

    
}
