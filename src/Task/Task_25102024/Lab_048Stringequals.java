package Task.Task_25102024;

public class Lab_048Stringequals {
    public static void main(String[] args) {
        String s1 = "opexy";//String constant pool,here if same value is there, no new object is created
        String s2 = "opexy";//String constant pool
        String s3=new String("opexy");//object created in heap,new object is created everytime
        String s4=new String("opexy");//object created in heap
        String s5=new String("Opexy");//object created in heap
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3.equals(s5));
        System.out.println(s1.equals(s4));

    }
}
