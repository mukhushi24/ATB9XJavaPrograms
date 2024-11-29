package Nov.ex__18112024Exceptions_part2;

public class Lab_180 {
    public static void main(String[] args){
    int a=0;
    int c=0;
        try {
        c = 10 / a;
        String s = null;
        s.trim();
    }
        catch(ArithmeticException|NullPointerException e){
        System.out.println(e.getMessage());
    }
        System.out.println(c);
}
}
