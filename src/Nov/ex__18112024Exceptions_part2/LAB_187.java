package Nov.ex__18112024Exceptions_part2;

public class LAB_187 {
    public static void main(String[] args){
        final double pi = 3.14;
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }

    }
}
