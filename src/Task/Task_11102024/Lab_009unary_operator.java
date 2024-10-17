package Task.Task_11102024;

public class Lab_009unary_operator {
    public static void main (String[]args){
        int a=10;
        System.out.println(++a + a++ + a++);

        int b=10;
        System.out.println("Post increment:"+(a++));
        System.out.println("Post increment:"+(a));
        System.out.println("Pre increment:"+(++a));
        System.out.println("Post decrement:"+(b--));
        System.out.println("Post decrement:"+(b));

        System.out.println("Pre decrement:"+(--b));
    }
}
