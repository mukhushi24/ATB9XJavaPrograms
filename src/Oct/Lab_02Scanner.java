package Oct;

import java.util.Scanner;

public class Lab_02Scanner {
    public static void main(String[]args){
        //we have to create instance of scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age/n");
        //age can be stored using scanner.nextInt()
        int age= sc.nextInt();
        System.out.println(age>25 ?"allowed to goa":"not allowed");
    }
}
