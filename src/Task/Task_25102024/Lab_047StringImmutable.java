package Task.Task_25102024;

public class Lab_047StringImmutable {
    public static void main(String[] args) {
        String name="opexy";
         name.toUpperCase();
        //name=name.toUpperCase();
        System.out.println(name);
    }
}
//String name = "opexy"; creates a new String object with the value "opexy".
//
//name.toUpperCase(); generates a new String object with the value "OPEXY", but it does not change the original name object.
//
//To actually change name to the uppercase version, you need to assign the result back to name, as in name = name.toUpperCase();.
//
//The original name remains "opexy" because strings are immutable; their values cannot be modified once created.
// You can create a new String with the desired changes, but the original String stays the same.