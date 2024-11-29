package Nov.ex__20112024List;

import java.util.Vector;

public class Lab_202Vector {
    public static void main (String[] args) {
        //it is a legacy class//same as ArrayList
        //vector methods are syncronized-one by one,so it is slow///objects can not be accessed by multiple threads at a time
        //if we want thread safety we need to use vector method
        //if i reach to  index 10 it creates 20 ,it doubles...vector increments capacity(it depends on jdk)
        // 100%,ArrayList increments 50 percent
        Vector v = new Vector();
        v.add("kripa");
        v.add("krishi");
        v.add("kunal");
        System.out.println(v);
        v.remove("kripa");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);
    }

}
