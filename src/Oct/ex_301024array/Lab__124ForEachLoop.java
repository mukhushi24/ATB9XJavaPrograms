package Oct.ex_301024array;

public class Lab__124ForEachLoop {
    public static void main(String[] args) {
        //enhanced loop
        int[] a=new int[5];

        a[2]=41;
        a[1]=42;
        a[0]=43;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
       // for(dataType item:array) {syntax ....item can be anything,it is reference name

       // }
        for(int i:a){//for every integer i in case of a print i
            System.out.println(i);
        }
    }
}
