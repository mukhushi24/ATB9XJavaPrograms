package Nov.ex__18112024Exceptions_part2;

public class Lab_193 {
    public static void main (String[] args){
        String s1="khushi";
        try {
            String a1 = args[0];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            int a = 10 / 0;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try{
            s1 = null;
            s1.length();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
