package Oct.ex_301024array;

import java.util.Scanner;

public class Lab__130 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
