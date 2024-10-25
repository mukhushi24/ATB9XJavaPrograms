package Task.Task_23102024;

import java.util.Scanner;

public class Lab_046fun {
    public static void main(String[] args) {
        //  Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)

        //  3 → user input
        //  4 - user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        sc.close();
        int sum = sum_of_two_numbers(a, b);
        System.out.println("sum is " + sum);
        int sub = sub_of_two_numbers(a, b);

        System.out.println("sub is " + sub);
        int mul = mul_of_two_numbers(a, b);
        System.out.println("mul is " + mul);
        int div = div_of_two_numbers(a, b);
        System.out.println("div is " + div);
        int mod = mod_of_two_numbers(a, b);
        System.out.println("modulus is " + mod);

    }

    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }

    static int sub_of_two_numbers(int a, int b) {
        return a - b;
    }

    static int mul_of_two_numbers(int a, int b) {
        return a * b;
    }

    static int div_of_two_numbers(int a, int b) {
        if (b == 0) {
            System.out.println("not allowed");
            return 0;
        }
        return a / b;

    }
    static int mod_of_two_numbers(int a, int b) {
        if (b == 0) {
            System.out.println("Modulus by zero is not allowed.");
            return 0;
        }
        return a % b;
    }



}
