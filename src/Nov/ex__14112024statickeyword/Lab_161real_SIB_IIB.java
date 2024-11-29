package Nov.ex__14112024statickeyword;

public class Lab_161real_SIB_IIB  {
    //static is something which is common across all among us
    //web driver is common across all testcases so web driver should be static in nature

    public static void main(String[] args) {
        ATB s1 = new ATB("YUKTA");
        ATB s2 = new ATB("MAYANK");
        ATB s3 = new ATB("BHOOMIKA");
        ATB s4 = new ATB("SPANDANA");

        ATB s5;//this is not object creation
        new ATB("KHUSHI");
//non static so its is accessed using reference variable
        s1.readDocuments();
        s2.readDocuments();

        // Static function and instance variabl can be accessed
        // just as classname.function and classname.instance variable
        ATB.doAssignment(); // Static Method
        System.out.println(ATB.courseName); // Static Variable

    }
}

class ATB{

    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }


    private String name;
    private String phone;
    static String courseName = "ATB9x";

    public String getName() {
        return name;
    }

    //constructor

    public ATB(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        //non static function"readDocument() can access static course name=this is common across all of us
        System.out.println(courseName);
    }
    //static is loaded during class loading

    static void doAssignment(){
        //System.out.println(phone);//and this phone number was not created during object creation
        //static functions cn not access instance variable
        System.out.println("Do Assignment");
    }
//static class can be there but it is not useful
    static class GenAI{
        // 0.0001% in Automation
    }



}//static block//static variable //static methods//instance variable=PRIVATE//when object is created so
// IIB//instance variable initialisation//instance function



//hardcoded or constant should be kept outside of the code
//enum is used to store constant values...if its enum we don't have to create object ..
// .we can directly accessed using perticular syntax format
//constructors are used to initialise the value