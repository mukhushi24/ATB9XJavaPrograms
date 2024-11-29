package Nov.ex__18112024Exceptions_part2;

public class Lab_183 {
    public static void main(String[] args){
        try {
            String s = args[0];
            int v = Integer.parseInt(s);
            int a = 100 / v;
        } catch(ArrayIndexOutOfBoundsException| NumberFormatException|ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("end of the program");
        }

    }
}
