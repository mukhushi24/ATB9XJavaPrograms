package Nov.ex__15112024WrapperException;

public class Lab_174trycatch_simple_example
{
    public static void main(String[] args){
    System.out.println("Start");

    String s1=null;
    try {
        s1.trim();
    }
    catch(NullPointerException e){
            System.out.println("exception caught"+ e);
        }


        System.out.println("End");
}
}
