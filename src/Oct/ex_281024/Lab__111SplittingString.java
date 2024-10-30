package Oct.ex_281024;

public class Lab__111SplittingString {
    public static void main(String[] args) {
        String s1="radhe,krishna,khushi";
        String[]s2=s1.split(",");//here " , " is delimiter...even "-" can also be used as delimiter
        System.out.println(s2[0]);
        System.out.println(s2[1]);
        System.out.println(s2[2]);
    }
}
//OOPS
//Regex-it kis used to extract information from the String
//Khushi M U email id is mukhushi24@gmail.com and insta id is masur_khushi_24
//here i can extract only email id