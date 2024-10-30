package Task.Task_28102024StringFunctions;

public class Lab_50Stringfunctions {
    public static void main(String[] args) {
        //substring
        String s = "encyclopedia";
        String s1 = s.substring(4, 6);
        System.out.println(s1);
        //concatination
        String s2 = "encyclo";
        String s3 = s2.concat("pedia");
        System.out.println(s3);
        //concatination
        String s4 = "encyclo";
        String s5 = "pedia";
        String s6 = "pedia";
        String result = s4 + s5 + s6;
        System.out.println(result);
        //SplittingString
        String s7 = "radhe,krishna,khushi";
        String[] s8 = s7.split(",");//here " , " is delimiter...even "-" can also be used as delimiter
        System.out.println(s8[0]);
        System.out.println(s8[1]);
        System.out.println(s8[2]);
        //charAt()
        //CharAt() returns the char value at the specific index
        String s9 = "radhe";
        char s10 = s9.charAt(1);
        System.out.println(s10);
        String s11 = " radhe ";
        //trim function
        String s12 = s11.trim();
        System.out.println(s12);
        //indexOf
        String s13 = "yukta";
        int s14 = s13.indexOf("k");  //indexOf returns an int
        System.out.println(s14);
        //contains
        String s15 = "khushimasur";
        boolean s16 = s15.contains("kh");
        System.out.println(s16);
        //lastIndexOf
        String s17 = "mayank, masur";
        int s18 = s17.lastIndexOf("m");
        System.out.println(s18);
        //replace
        //replaceAll
        String s19 = "mayank, masur";
        String s20 = s19.replace("m", "b");
        System.out.println(s20);
        String s21 = "mayank, masur";
        String s22 = s21.replaceAll("m", "b");
        System.out.println(s22);
        //startsWith
        //endsWith
        String s23 = "yukta";
        System.out.println(s23.startsWith("ku"));
        System.out.println(s23.endsWith("ku"));
        //replaceAll
        String s24 = "mayank564, masur";
        String s25 = s24.replaceAll("\\d", "hj,");//replaces all the integer value with mentioned  String
        System.out.println(s25);

    }
}
