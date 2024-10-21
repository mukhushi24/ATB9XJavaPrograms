package Task.Task_17102024;

import java.util.Scanner;

public class Lab_021triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides:");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A == B && B == C) {
            System.out.println("Equilateral");
        }
        else if(A == B || A == C || B == C) {
            System.out.println("Isosceles");
        }
        else if(A<=0||B<=0||C<=0) {
            System.out.println("Invalid input:side length must be positive");


        }
        else{
            System.out.println("Scalene");

        }
        sc.close();


    }
}
