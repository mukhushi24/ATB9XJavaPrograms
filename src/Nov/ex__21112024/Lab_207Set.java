package Nov.ex__21112024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_207Set {
    //Set is also a part of collection interface
    //does not allow duplicates, in while new object creation generics os applied for example <String>
    //enum set is used to store enum types,variables
    //enumaration is same as iterator used in lagacy class such as vector
    //HashSet-it is easy to search the element, does not maintain any order to store elements
    //Linked HashSet is the subclass of HashSet, stores the element in the order given by the user
    //TreeSet-store the element in the sorted order of one type(String,integer)
    //TreeSet doesnot allow null value
    //navigate set subclass of sorted set, can be accessed in forward or reverse order

        public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();


        hs.add("shruthi");
        hs.add("shruthi");
        hs.add("Shruthi");
        hs.add("kruthi");
        System.out.println(hs);




    }
}
