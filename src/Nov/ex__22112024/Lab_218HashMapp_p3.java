package Nov.ex__22112024;

import java.util.HashMap;
//Hash doesn't use indexation
import java.util.Map;

public class Lab_218HashMapp_p3 {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap();//datatype is fixed
        map.put("id",1);
        map.put("id",1);

        map.put("id",2);
        map.put("id1",4);
        map.put("id2",5);
        map.put("id3",6);
        map.put("id4",null);//you can have null values
        map.put("id4",null);
        map.put("id5",null);//you can have many null values
        map.put(null,50);//null key is allowed
        map.put(null,90);//2 null key is never allowed

        //iterate
        for(Map.Entry<String,Integer> item:map.entrySet()){//key, value combination is called entrySet()
            System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}
