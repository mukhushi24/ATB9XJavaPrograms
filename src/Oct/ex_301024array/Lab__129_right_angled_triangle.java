package Oct.ex_301024array;

import java.util.Scanner;

public class Lab__129_right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        //Scanner sc = new Scanner(System.in);: Creates a Scanner object sc to read input from the console.
        //
        //System.out.println("Enter the number n=5");: Prompts the user to enter a number.
        //
        //int n = sc.nextInt();: Reads an integer value from the user and stores it in the variable n.
        for(int i=0;i<n;i++){//once i=0 ,j fully performs with multiple position with all possible way with j=0,1,2,3,4,5
            //and comes out....the,i will be equal to 1and so on....
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");

        }
    }

}
//Outer Loop: for (int i = 0; i < n; i++)
//
//This loop runs from i = 0 to i < n, iterating over each row of the triangle.
//
//Each iteration represents one row of the triangle.
//
//Inner Loop: for (int j = 0; j <= i; j++)
//
//For each row i, this loop runs from j = 0 to j <= i.
//
//This ensures that the number of * printed in each row equals the row number plus one.
//
//For example, when i = 0, it prints one *; when i = 1, it prints two *, and so on.
//
//Print * and New Line:
//
//System.out.print("*");: Prints * without moving to the next line.
//
//System.out.println("");: Moves to the next line after the inner loop finishes, ensuring each row starts on a new line.
