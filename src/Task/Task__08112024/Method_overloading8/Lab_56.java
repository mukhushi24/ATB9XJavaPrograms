package Task.Task__08112024.Method_overloading8;

public class Lab_56 {
        public static void main(String[] args) {
            ATBStudents student = new ATBStudents();
            student.displayDetails();
            student.displayDetails("khushi");
            student.displayDetails("khushi", 10);
        }
}

    class ATBStudents {
        // Method to display details without any parameters
        void displayDetails() {
            System.out.println("Displaying ATB student details.");
        }

        // Overloaded method to display details with name
        void displayDetails(String name) {
            System.out.println("Displaying ATB student details for: " + name);
        }

        // Overloaded method to display details with name and register number
        void displayDetails(String name, int registerNumber) {
            System.out.println("Displaying ATB student details for: " + name + ", Register Number: " + registerNumber);
        }
    }


