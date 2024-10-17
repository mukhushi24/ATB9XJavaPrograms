package Task.Task_16102024;

public class Lab_019arguments {
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);

        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int result=(a>=b?a:b);
        System.out.println(result);
    }
}
