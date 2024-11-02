package Oct.ex_291024array;

public class Lab_119Easywaymax {
    public static void main(String[] args) {
       int[] marks={12,13,14,15,11,19};
       int max=marks[0];
       for(int i=0;i<marks.length;i++){
           if(marks[i]>max){
               max=marks[i];
           }

       }
        System.out.println("Maximum number is:"+max);

    }
}
