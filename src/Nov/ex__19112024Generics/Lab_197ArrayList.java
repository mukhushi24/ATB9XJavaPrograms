package Nov.ex__19112024Generics;

import java.util.ArrayList;

public class Lab_197ArrayList {
    public static void main(String[] args) {

//        Collection list = new ArrayList(); // Dynamic Dispatch -
//        List list1 = new ArrayList(); // Dynamic Dispatch -
        ArrayList studentList = new ArrayList();
        studentList.add("ASHWIN");
        studentList.add("RAO");
        studentList.add("TAGORE"); // Duplicate is allowed.
        studentList.add("YUKTA");
        studentList.add("SARITA");
        studentList.add(true); // Different data type is allowed.
        studentList.add(25);
        studentList.add(null);


        System.out.println(studentList);


    }
}
        //For example template is given use it to prepare resume don't concentrate on how template was/is created....
        // .....for example students details are give it's left to you how u want arrange,sort, delete the duplicates...etc
        //Collection framework was introduced because there was problem with arrays
        //Collection -how u want store the values
        //Why interfaces as parent?//If you want delete "delete" is the function
        // name in all cases"remove","add"....cases(arraylist)(hashset)(hashmap)

