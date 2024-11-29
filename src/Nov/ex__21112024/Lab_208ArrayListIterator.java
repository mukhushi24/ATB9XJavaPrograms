package Nov.ex__21112024;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_208ArrayListIterator  {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("arurag");
        mylist.add("smrithi");
        mylist.add("shilpa");

        System.out.println(" - To Print Arraylist - 1 ");

        for (String str : mylist) {
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" - To Print Arraylist - 3 ");

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }












    }
}