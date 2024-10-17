package Task.Task_15102024;

public class Lab_015max {
    public static void main(String[] args){
        //Largest of 3 numbers
        int a=100;
        int b=120;
        int c=160;
        int result=(a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("The largest number among a,b,c is:"+ result);
    }
}
