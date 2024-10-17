package Task.Task_14102024TypeCasting;

public class Lab_014NarrowingExplicit {
    public static void main(String[] args){
        //Finance Application: Consider a finance application where transaction amounts need to be stored and processed.
        //Widening: When reading transaction amounts from a database stored as int into double for precise calculations.
        //int transactionAmount = 100;
        //double preciseAmount = transactionAmount;  // Implicit widening typecasting
        //Narrowing: When the precise calculation results need to be stored back into an int field in the database.
        double calculatedAmount = 150.75;
        int storeAmount = (int) calculatedAmount;  // Explicit narrowing typecasting
        System.out.println(storeAmount);

    }
}
