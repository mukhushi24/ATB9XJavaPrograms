package Oct.ex_291024array;

public class Lab_118Arraymax {
    public static void main(String[] args) {
        int [] marks = {41,89,76,56,47,87};// here the input values are declared
        int max_values=f2max(marks);
        System.out.println(max_values);


    }
    static int f2max(int [] marks){//here marks ids taken as input as we used to take int marks or int i

        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;
    }
}
