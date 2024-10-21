package Task.Task_21102024;

public class Lab_029 {
    public static void main (String[] args){
        final boolean b1= true;
        for(int i=0;b1;i++) {
            System.out.println("Hello");
        }
    }
}
//In the for loop, b1 is used as the condition. Since b1 is always true, the loop condition b1 is always met.
//
//The loop starts with i = 0 and increments i by 1 each time, but the condition never changes, so the loop never exits.
//The boolean variable b1 is declared as final and set to true, meaning it cannot change.
//As a result, the System.out.println("Hello"); statement executes indefinitely, printing "Hello" over and over again without stopping.