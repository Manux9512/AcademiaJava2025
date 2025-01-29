package exceptionsCheckedUnchecked;

import java.io.FileNotFoundException;

public class TestCheckedUnchecked {
    public static void main(String[] args) {
        // Checked exceptions
        try {
            CheckedExceptions.checkedExceptions();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Unchecked exceptions
        UncheckedExceptions.uncheckException();
    }
}
