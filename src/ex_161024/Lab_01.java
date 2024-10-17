package ex_161024;

public class Lab_01 {
    public static void main(String[] args){
        int age= Integer.parseInt(args[0]);
        System.out.println(age>25 ?"allowed to goa":"not allowed");
        //30 which we have taken is in string datatype
        //to convert that string to integer i will be using Integer.parseInt
        //earlier is was"30" is now converted to integer
        //Arguments in console method i.e..Integer.parseInt(args[0]);
        //edited in edit configuration
        //taking the input from user from the program
        //we get number format exception if give khushi in place of 30 because it accepts only number

    }
}
