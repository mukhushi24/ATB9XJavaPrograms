package Nov.ex__21112024;

import java.util.ArrayList;
import java.util.List;

public class Lab_210AL_class_student {
    public static void main(String[] args) {
        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Anil","2");
        Student s3 = new Student("Nikuj","3");

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();


        System.out.println(myStudents);
    }
}