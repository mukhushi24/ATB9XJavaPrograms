package Oct.ex_291024array;

import java.util.Scanner;

public class Lab__121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the numbers : ");
            numbers[i]=sc.nextInt();
            System.out.println("_______");


        }
        System.out.println(" numbers are : ");
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }


    }
}
