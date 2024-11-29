package Nov.ex__18112024Exceptions_part2;

public class Lab_190 {
    public static void main(String[] args){
            try {
                int a = 10/10;
                System.exit(0);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Not Printed");
            }


    }
}
