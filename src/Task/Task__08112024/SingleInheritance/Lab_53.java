package Task.Task__08112024.SingleInheritance;

public class Lab_53 {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(s1.arr[2]);
        s1.attendence();


    }
}


    class ATBStudentss {
        String[] arr = {"khushi", "kishore", "omkar", "rashmi","rohit"};

    }

    class student extends ATBStudentss {
        String name = "khushi";
        String register_number = "ATB10";

        void attendence() {
            System.out.println("regular student");
        }

    }


