package Nov.ex__18112024Exceptions_part2;

public class Lab_177GOODPRACTICE {
    //GOOD PRACTICE
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=0;
        try {
            c = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("end of the program");





    }
}
