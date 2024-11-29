package Nov.ex__15112024WrapperException;

public class Lab_175Exception_resolved {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;//.ArithmeticException: / by zero
        try {
            b = 10/c;
        }
        catch (Exception e) {
           System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
