package Nov.ex__20112024List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_199 {
    public static void main(String[] args){
        //Orderded collection
        //control over the insertion
        //List allows duplicates

        List fruit= new ArrayList();//Array format-continuous
        List fruit1=new LinkedList();//Doubly Linked List//insertion,deletion is easy,finding element is difficult
        //difference between ArrayList and LinkedList is the way they are stored in the memory
        List fruits=List.of("Orange","apple","pineapple");//static ,hardcode function
        fruits.add("watermelon");//java.lang.UnsupportedOperationException//it is just for hardcode creation
        //we need to use concrete classes
        //we have ArrayList,LinkedList,Vector
}
}