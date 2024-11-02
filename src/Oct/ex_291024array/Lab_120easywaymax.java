package Oct.ex_291024array;

import java.util.Arrays;

public class Lab_120easywaymax {
    public static void main(String[] args) {
        int[] marks={12,13,15,19,11};
        Arrays.sort(marks);
        //here we have sorted the marks and then below we will be printing the last element
        System.out.println(marks[marks.length-1]);

    }
}
