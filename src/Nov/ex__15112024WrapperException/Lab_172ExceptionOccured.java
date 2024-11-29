package Nov.ex__15112024WrapperException;

public class Lab_172ExceptionOccured {
    public static void main(String[] args){
        //it is unchecked exception
        int a=10;
        int b=0;//ArithmeticException: / by zero
        int c=a/b;
        System.out.println(c);

        // Checked - JVM Knows
        // FileInputStream file = new FileInputStream("C://a.txt");
        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.

    }
}
