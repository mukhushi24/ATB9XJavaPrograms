package Nov.ex__22112024;
import java.util.Map;
import java.util.HashMap;

public class Lab_216Map_p2 {
    public static void main(String[] args){
       // Map<String,Integer> m3=new HashMap<String,Integer>();//old method
       // Map<String,Integer> m2=new HashMap<>();//after jdk 8,9 below one
        Map <String,Integer>m1=new HashMap();//datatype is fixed
        m1.put("id",1);
        m1.put("id",1);
        //key need to be one but values can be duplicate
        //duplicates are not allowed ,it gets printed in console only once
        m1.put("id",2);
        m1.put("id1",4);
        m1.put("id2",5);
        m1.put("id3",6);
        m1.put("id4",null);//you can have null values
        m1.put("id4",null);
        m1.put("id5",null);//you can have many null values
        m1.put(null,50);//null key is allowed
        m1.put(null,90);//2 null key is never allowed
        System.out.println(m1);//prints only latest value if key is same//if key ,value both pair are different everytime
        //it gives all different types in no proper order maintainance
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("4"));
        System.out.println(m1.containsValue(null));
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.get(100));//if key is not there it gives null in console
        System.out.println(m1.get(null));

       // Map m4=new HashMap();

    }
}
