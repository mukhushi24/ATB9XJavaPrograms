package Task.Task_14102024TypeCasting;

public class Lab_014NarrowingImplicit {
    public static void main(String[] args){
        int sensorReading = 42;
        // Assuming system automatically handles the narrowing
        byte storedReading = (byte) sensorReading;  // This is explicit in code, but can be implicit in system configuration

        System.out.println("Stored Sensor Reading: " + storedReading);
    }
}
