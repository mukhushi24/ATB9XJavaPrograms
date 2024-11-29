package Nov.ex__18112024Exceptions_part2;

public class Lab_186 {
    public static void main(String[] args){
        try {
            String s1 ;
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }


        System.out.println("End of Program!");

    }
}
