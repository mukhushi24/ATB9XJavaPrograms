package Task.Task__08112024ATB;

public class StudentATB {
    public static void main(String[] args) {
        // Creating StudentATB objects
        StudentATB s1 = new StudentATB(1, "khushi", 90.5);
        StudentATB s2 = new StudentATB(2, "yukta", 85.0);
        StudentATB s3 = new StudentATB(3, "mayank", 92.0);

        // Creating an array of StudentATB objects
        StudentATB[] students = {s1, s2, s3};


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    private int id;
    private String name;
    private double grade;

    public StudentATB(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentATB{" + "id=" + id + ", name='" + name + '\'' + ", grade=" + grade + '}';
    }


}


