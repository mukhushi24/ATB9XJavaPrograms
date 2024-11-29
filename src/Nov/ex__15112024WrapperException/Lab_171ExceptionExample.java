package Nov.ex__15112024WrapperException;

public class Lab_171ExceptionExample {
    public static void main(String[] args){
        String s1=args[0];//ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0//when nothing is given
        int i1=Integer.parseInt(s1);//// NumberFormatException: For input string: "khushi"
        int i2=1000/i1;//ArithmeticException: / by zero....When i1=0
        System.out.println(i2);
        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM



    }
}
