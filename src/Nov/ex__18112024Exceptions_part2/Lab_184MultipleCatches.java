package Nov.ex__18112024Exceptions_part2;

public class Lab_184MultipleCatches {
    public static void main(String[] args){
        try {
            String s = args[0];
            int v = Integer.parseInt(s);
            int a = 100 / v;
            System.out.println(a);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch( NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("end of the program");
        }

    }
}
