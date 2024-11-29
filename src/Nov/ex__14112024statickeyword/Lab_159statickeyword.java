package Nov.ex__14112024statickeyword;

public class Lab_159statickeyword  {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        //System.out.println(s1);
        Student s2 = new Student(33);
        //System.out.println(s2);


        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);




    }

}

class Student {
     int age; // Non static variable // Instance Variable//if this is static ....do trial errror to see the result but removing double slash symbol
    static String school_name = "ABC"; // Static Variable

    public Student(int age) {
        this.age = age;
    }

    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when Object is created");
        System.out.println("Read a MySQL db()");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded Once, When Class is Loaded.");
        System.out.println("Read the excel file");
    }
//the toString method from the Object class returns a string that is not very informative.
// It typically looks something like ClassName@hashcode, which isn't helpful for understanding the object's contents.
// Overriding toString allows you to produce a meaningful,
// human-readable string that describes the state of the object.
  // public String toString() {
    //  return "Student{" + "age=" + age + ", school_name='" + school_name + '\'' + '}';

   // };
}










