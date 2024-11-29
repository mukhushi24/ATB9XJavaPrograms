package Nov.ex__18112024Exceptions_part2;

import java.util.Scanner;

public class Lab_182 {
    public static void main(String[] args){
        //Scanner object sc is initialized with null
        Scanner sc=null;
        //sc is assigned with new value entered by user in console
        sc=new Scanner(System.in);
        //integer valve is read and stored in v
        int v=sc.nextInt();
        int a;
        try {
            a = 10 / 0;
            System.out.println(a);
        }
        catch(Exception e){
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("end of the program");
        }
    }
}
