package Task.Task_11102024;
class car{}

public class vehicle extends car {
    public static void main (String[]args){
        car a=new vehicle();
        boolean result=a instanceof vehicle;
        System.out.println(result);
    }
}
//finding car is typeof vehicle or not
//a is not instantiated or saved in memory , it happens with the help of "new" operator
