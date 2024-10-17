package Task.Task_14102024TypeCasting;

public class Lab_014WideningImplicit {
    public static void main(String[] args){
        //Finance Application: Consider a finance application where transaction amounts need to be stored and
        // processed.
        //Widening: When reading transaction amounts from a database stored as int into double for precise calculation
        int transactionAmount = 100;
        double preciseAmount = transactionAmount;
        System.out.println(preciseAmount);
    }
}
