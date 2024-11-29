package Nov.ex__18112024Exceptions_part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_188Checked_Unchecked {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked!");
        }

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked Exception");
        }
    }




}
