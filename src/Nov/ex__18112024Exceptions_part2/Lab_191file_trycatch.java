package Nov.ex__18112024Exceptions_part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_191file_trycatch { public static void main(String[] args) {
    // Throws - Checked
    try {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    } catch (FileNotFoundException e) {

        e.printStackTrace();
        System.out.println(e.getMessage());



        System.out.println("File ni hai1");
    } finally {
        System.out.println("yes");
    }

}
}
