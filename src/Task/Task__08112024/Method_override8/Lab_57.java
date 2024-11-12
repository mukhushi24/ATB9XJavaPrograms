package Task.Task__08112024.Method_override8;

public class Lab_57{
    public static void main(String[] args) {
        Fresher fresher = new Fresher();
        TesterWithOneYearExperience tester1Year = new TesterWithOneYearExperience();
        TesterWithTwoYearExperience tester2Year = new TesterWithTwoYearExperience();

        fresher.displayDetails();
        tester1Year.displayDetails();
        tester2Year.displayDetails();
    }
}

class ATBStudents {
    void displayDetails() {
        System.out.println("Displaying details of  ATB student.");
    }
}

class Fresher extends ATBStudents {
    @Override
    void displayDetails() {
        System.out.println("Displaying details of a Fresher student.");
    }
}

class TesterWithOneYearExperience extends ATBStudents {
    @Override
    void displayDetails() {
        System.out.println("Displaying details of a Tester with One Year Experience.");
    }
}

class TesterWithTwoYearExperience extends ATBStudents {
    @Override
    void displayDetails() {
        System.out.println("Displaying details of a Tester with Two Years Experience.");
    }
}



