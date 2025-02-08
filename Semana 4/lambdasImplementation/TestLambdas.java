package lambdasImplementation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestLambdas {
    public static void main(String[] args) {

        //Palindrome program
        String text = new String("Anita lava la tina");

        //Text length
        Function<String,Integer> lengthFunction = s -> s.length();
        Integer textLength = lengthFunction.apply(text);
        System.out.println(textLength);

        //Text to lower case
        Function<String,String> stringFunction = s -> s.toLowerCase();
		String lowerString = stringFunction.apply(text);
		System.out.println(lowerString); 

        //Text without blank spaces
        Function<String,String> removeSpaceFuntion = s -> s.replace(" ", "");
        String removeSpaces = removeSpaceFuntion.apply(lowerString);
        System.out.println(removeSpaces);

        //Invert string
        Predicate<String> palindrome = s -> {
            String inverseString = new StringBuilder(s).reverse().toString();
            return s.equals(inverseString);
        };
        
        //Print the result
        Consumer<Boolean> result = s -> System.out.println("Text is palindrome?: " + s);
        result.accept(palindrome.test(removeSpaces));

    }
}
