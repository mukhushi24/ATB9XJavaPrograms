package Oct.ex_291024array;

import java.util.Arrays;

public class Lab_117Iterate {
    public static void main(String[] args){
        int [] marks = {41,89,76,56,47,87};
        System.out.println(marks.length);
        Arrays.sort(marks);
        //in order to get marks
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println("-_--___--");
        //in arrays for loop starts from 0 only
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        System.out.println("-_--___--");
            Arrays.sort(marks);
            int index=marks[1];
            System.out.println(index);
        System.out.println("-_--___--");
        int index1=Arrays.binarySearch(marks,100);
        System.out.println(index1);
        //in order to get index
        //binarySearch always require a sorted array
        int index2=Arrays.binarySearch(marks,47);
        System.out.println(index2);
        //have a quick look of different functions of arrays
        //add and delete becomes difficult because we need to use shift operation hence it is not used in data structures



    }
}
