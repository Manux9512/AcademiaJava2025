package exceptionsCheckedUnchecked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void checkedExceptions() throws
    FileNotFoundException{
        File file = new File("NewFile.txt");
        FileInputStream stream = new FileInputStream(file);

    }
}
