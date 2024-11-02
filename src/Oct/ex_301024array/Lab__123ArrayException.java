package Oct.ex_301024array;

public class Lab__123ArrayException {
    public static void main(String[] args) {
        //int[] a=new int[-2];
        //System.out.println(a); // NegativeArraySizeException
        //int[] a2=new int[5];
       // System.out.println(a2[10]);//ArrayIndexOutOfBoundsException
        //all the exceptions are class
        int[] a3=new int[0];//it creates an array with no elements.
        System.out.println(a3);//When you print an array object directly in Java, it doesn't display the elements of the array.
        // Instead, it prints a string that includes the class name followed by the "@" symbol
        // and the object's hashcode in hexadecimal form.
        //[I@7b23ec81
    }
}
