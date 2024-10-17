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
                else{
                    System.out.println("Scalene");

                }
        sc.close();


    }
}
