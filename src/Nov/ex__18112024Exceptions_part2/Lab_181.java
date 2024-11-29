package Nov.ex__18112024Exceptions_part2;

public class Lab_181 {
    public static void main(String[] args){
        int a=0;
        int c=0;
        try {
            c = 10 / a;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());


        }
        finally {
            System.out.println("finally will be executed");
        }
    }
}
