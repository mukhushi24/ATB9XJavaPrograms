package Nov.ex__18112024Exceptions_part2;

public class Lab_176 {
    public static void main(String[] args) {
        //need of finally=used to close the database  connections,its like a exit block like sc.close();
        int a=0;
        int b=0;
        int c=0;
        try {
            c = 10 / a;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        catch(Throwable e){
            System.out.println(e.getMessage());


        }
        System.out.println("end of the program");
    }
}
