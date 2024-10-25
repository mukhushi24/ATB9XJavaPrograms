package Task.Task_23102024;
//import java.util.Scanner;

public class Lab_045functions {
    public static void main(String[] args) {
        //  Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)

        //  3 → user input
        //  4 - user input
        //Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter second number:");
        // int b = sc.nextInt();
        // sc.close();
        calcy(3, 4);
        //int return_type=calcy(3, 4);
        // System.out.println(return_type);
    }

    static int calcy(int a, int b) {
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod=a%b;

        System.out.println("sum is " + sum);
        System.out.println("sub is " + sub);
        System.out.println("mul is " + mul);
        System.out.println("div is " + div);
        System.out.println("mod is " + mod);

        return sum;


    }
}
//refer pramod 117
