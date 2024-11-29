package Nov.ex__22112024;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Lab_219HashMap_p4 {
    public static void main(String[] args){
        HashMap<String,String> student1=new HashMap();//we can hardcode using generics
        student1.put("name","Khushi");
        student1.put("phone_number","783865252");
        System.out.println(student1);
        HashMap student2=new HashMap();

        student2.put("name","Harshi");
        student2.put("phone_number","783865266");
        System.out.println(student2);

        List students=new ArrayList();
        students.add(student1);
        students.add(student1);
        System.out.println(students);


    }
}
