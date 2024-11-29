package Nov.ex__20112024List;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;



public class Lab_200ArrayList {
    public static void main(String[] args){
        //ArrayList->Underline Array-get element is easy,inserting,deleting is costly-it is a heavy operation
        //insertion
        //deletion
        //searching and updation-using index-it is a light operation
        //traverse -three types
       // List list=new List();
        List list=new ArrayList();
        //The issue is that List is an interface in Java, and interfaces cannot be instantiated directly.
        // You need to use a concrete implementation of the List interface.
        // Common implementations of the List interface are ArrayList, LinkedList, Vector, etc.
        list.add("khushi");
        list.add("niharika");
        list.add("renutha");
        list.add("yukta");
        System.out.println(list);
        list.remove("yukta");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        //traverse -three types

        for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));

        }
        //for all object in o in the list i want u print all the object
        for(Object o:list){//Object o because it is father if in future if someone use "string"or int everything is possible with object
            System.out.println(o);
        }
        //Iterator-anchor-go one by one forward (left to right)->get access to them
        //HasNext()->true-if we have a next element
        //Next-element
        Iterator iterator=list.iterator();//iterator works in a way where first element is anchor
        while(iterator.hasNext()){//until this condition is true it moves to next
            System.out.println(iterator.next());
        }


    }
}
