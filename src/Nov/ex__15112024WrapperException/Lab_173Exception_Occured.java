package Nov.ex__15112024WrapperException;

public class Lab_173Exception_Occured {
    public static void main(String[] args) {
        System.out.println("Start");

        String s1=null;
        s1.trim();
        System.out.println(s1);


        System.out.println("End");

        // Unchecked - java.lang.NullPointerException
        // jvm - compile -> jvm knows at the Runtime -> Terminated the program.
    }
}
