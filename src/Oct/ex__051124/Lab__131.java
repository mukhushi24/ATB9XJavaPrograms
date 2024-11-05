package Oct.ex__051124;

public class Lab__131 {
    public static void main(String[] args) {
        Students s1= new Students();
        //upper part in main method
        //class loaded
        //new Students(); leads to object creation
        //s1 points to null , default value of non primitive DataTye is null
        //byte,bits=8,64
        // here we can access both attributes and behavior
        s1.age=22;
        System.out.println(s1.age);

        String hours= s1.work();
        System.out.println(hours);

        s1.walk();
        s1.sleep(8);

        s1.eat(4);







    }
}
