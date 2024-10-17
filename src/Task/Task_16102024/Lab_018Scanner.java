package Task.Task_16102024;

import java.util.Scanner;

public class Lab_018Scanner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("print the input:");
        String name=sc.next();
        int age= sc.nextInt();
        int salary=sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        sc.close();



    }
}
