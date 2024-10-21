package Task.Task_18102024;

import java.util.Scanner;

public class Lab_022calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num1 :");
        int num1=sc.nextInt();
        System.out.println("enter num2 :");
        int num2=sc.nextInt();
        System.out.println("enter the operator :");
        char op=sc.next().charAt(0);
        switch (op){
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
                break;
            case '%' :
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("enter only +,-,*,/,% to perform operation");
                break;





        }

    }
}
