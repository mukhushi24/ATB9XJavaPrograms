package Task.Task__08112024.MultilevelInheritance;

public class Lab_54 {
    public static void main(String[] args){
        sister8 s1=new sister8();
        s1.paid_amount_for_course();
        System.out.println(s1.amount);
        boolean result=s1.last_date();
        System.out.println("last date status when khushi  enrolled is for course "+result);
        s1.LastDate();
    }

}
class ATB_Student8 {
    String[] arr={"khushi","kishore","omkar","rashmi"};
    void LastDate() {
        System.out.println("31-09-24");

    }


}
class Student_08 extends ATB_Student8 {
    String name="khushi";
    String register_number="ATB10";
    void attendence() {
        System.out.println("regular student");
    }
    boolean last_date() {
        System.out.println("310924");
        return true ;
    }

}
class sister8 extends Student_08 {
    int amount=10000;
    void paid_amount_for_course(){

        System.out.println("Studen_0's sister paid course amount");


    }

}

