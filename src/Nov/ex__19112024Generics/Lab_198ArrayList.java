package Nov.ex__19112024Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_198ArrayList {
    public static void main(String[] args) {


        List list = new ArrayList();
        list.add("1"); // 0
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1)); // Int check
        System.out.println(list.indexOf("3")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the first occ of element in list












    }
}
