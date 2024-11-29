package Nov.ex__18112024Exceptions_part2;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
//import java.io.IOException;

public class Lab_189Throws_checked_file {
    public static void main(String[] args) throws FileNotFoundException, Exception{
     FileInputStream f=new FileInputStream("C://a.log");
     System.out.println(f);
    }
}
