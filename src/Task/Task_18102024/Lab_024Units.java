package Task.Task_18102024;

import java.util.Scanner;

public class Lab_024Units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Initialize the Scanner here

        System.out.println("Choose the conversion type:");
        System.out.println("1: Kilometers to Meters ");
        System.out.println("2: Fahrenheit to Celsius ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1: Kilometers to Meters");
                int kmChoice = sc.nextInt();
                System.out.println("Enter value in kilometers:");
                int km = sc.nextInt();
                switch (kmChoice) {
                    case 1:
                        System.out.println(km + " kilometers is " + (km * 1000) + " meters.");
                        break;
                    default:
                        System.out.println("Invalid choice for kilometers conversion.");
                }
                break;
            case 2:

                System.out.println("1: Fahrenheit to Celsius");
                int tempChoice = sc.nextInt();
                System.out.println("Enter temperature:");
                int temp = sc.nextInt();
                switch (tempChoice) {
                    case 1:
                        System.out.println(temp + " Fahrenheit is " + ((temp - 32) * 5 / 9) + " Celsius.");
                        break;
                    default:
                        System.out.println("Invalid choice for temperature conversion.");
                }
                break;
            default:
                System.out.println("Invalid overall choice.");
        }

        sc.close();
    }
}

