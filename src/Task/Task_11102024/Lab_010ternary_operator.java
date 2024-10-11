package Task.Task_11102024;

public class Lab_010ternary_operator {
    public static void main(String[]args){
        int a=20,b=10,c=30,result;
        result=((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println("max of three numbers="+result);

    }

}
