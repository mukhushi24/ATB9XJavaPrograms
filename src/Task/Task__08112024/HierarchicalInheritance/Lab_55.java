package Task.Task__08112024.HierarchicalInheritance;

public class Lab_55 {
    public static void main(String[] args) {
        Fresher fresher = new Fresher();
        TesterWithOneYearExperience tester1Year = new TesterWithOneYearExperience();
        TesterWithTwoYearExperience tester2Year = new TesterWithTwoYearExperience();

        System.out.println("Fresher Details:");
        fresher.displayDetails();

        System.out.println("\nTester with One Year Experience Details:");
        tester1Year.displayDetails();

        System.out.println("\nTester with Two Year Experience Details:");
        tester2Year.displayDetails();
    }
}

class ATBStudents {
    String[] arr = {"khushi", "kishore", "omkar", "rashmi", "rohit"};

    void commonMethod() {
        System.out.println("This is a common method for all ATB students.");
    }

    void displayDetails() {
        System.out.println("Displaying details of ATB student.");
    }
}

class Fresher extends ATBStudents {
    String name = "khushi";
    String registerNumber = "ATB10";

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Status: Fresher");
    }
}

class TesterWithOneYearExperience extends ATBStudents {
    String name = "kishore";
    String registerNumber = "ATB20";

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Status: Tester with One Year Experience");
    }
}

class TesterWithTwoYearExperience extends ATBStudents {
    String name = "omkar";
    String registerNumber = "ATB30";

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Status: Tester with Two Years Experience");
    }
}

