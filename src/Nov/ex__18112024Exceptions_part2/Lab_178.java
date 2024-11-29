package Nov.ex__18112024Exceptions_part2;

public class Lab_178 {
    public static void main(String[] args){
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c); // java.lang.ArithmeticException
    }

}
