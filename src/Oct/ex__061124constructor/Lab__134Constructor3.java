package Oct.ex__061124constructor;

import java.util.Scanner;

public class Lab__134Constructor3 {
    public static void main(String[] args) {
        //step 3 //i can use Scanner
        Scanner sc= new Scanner(System.in);
        //step 2
        Car3 c11 = new Car3();
        //insterd of mentioning c11.name="mini nano";
        //                      c11.year=2020;...we can directly include the specified value
        //                      in parameter above
        System.out.println(c11.name);
        System.out.println(c11.year);
        c11.display();


        Car3 c12 = new Car3();

        System.out.println(c12.name);
        System.out.println(c12.year);
        c12.display();

        //STEP 4
        System.out.println("enter the name") ;
        String name=sc.next();
        System.out.println("enter the year") ;
        int year=sc.nextInt();
        Car3 c13 = new Car3();

        System.out.println(c13.name);
        System.out.println(c13.year);
        //follow step one ,three,four for using scanner, i cant give a new variable
        // name_name or year_year because i have not mentioned any attribute as such
        c13.display();


    }
}
//step 1
class Car3{
    //attribute
    //methods
    //constructor
    String name;
    String model;
    int year;
    //default constructor


    Car3(){
        //when we run this pc will be printed ,because of same dataType in new object created
        System.out.println("pc");
        this.name="xyz";
        this.year=0;
        //this is a reference variable refers to current object
        //this becomes c11 when its c11
        //this becomes c12 when its c12
        //this becomes c13 when its c13
        //this atomatically becomes current object reference...we dont have to write
        //c11.mode,c12.mode,c13.model again and again


    }
    void display(){
        System.out.println("car details : "+this.name+this.year);


    }
}



