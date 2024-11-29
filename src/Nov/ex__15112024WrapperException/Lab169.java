package Nov.ex__15112024WrapperException;

public class Lab169 {
    public static void main(String[] args){
        // String->wrapper Integer->primitive int
        String s="10";
        Integer i=Integer.valueOf(s);
        int a=i;
        //String to primitive
        int a1=Integer.parseInt(s);//parsInt converts to primitive

        String str1 = i.toString(); // Converts Integer (wrapper) to String
        System.out.println("Integer (wrapper) to String: " + str1); // Output: "10"


        int number = 42;
        String str2 = String.valueOf(number); // Converts int to String
        System.out.println("int to String using valueOf: " + str2); // Output: "42"

        String str3 = Integer.toString(number); // Another way to convert int to String
        System.out.println("int to String using toString: " + str3); // Output: "42"




        //we use wrapper class in collection framework

    }
}
//valueOf(s);=String to wrapper
//parseInt(s);=String to primitive
//wrapper object to String =toString

//int number = 42;
//String str = String.valueOf(number); // Converts integer to string
//System.out.println(str); // Output: "42"

//int number = 42;
//String str = Integer.toString(number); // Converts integer to string
//System.out.println(str); // Output: "42"

