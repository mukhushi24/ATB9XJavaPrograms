package Nov.ex__15112024WrapperException;

public class Lab_168 {
public static void main(String[] args){
    //we convert all primitive datatypes as wrapper class//collection framework works with objects so we convert
    //wrap primitive datatype
    //primitive datatype doesn't have method
    //Java loves when we work with class and object //hates primitive datatype because it doesn't have class ,object....
    //jave is not pure oops because of primitive datatype
    //primitive to wrapper

    int a=10;//boxing//small to big//int to Integer
    Integer b=a;
    System.out.println(b.intValue());
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);

    Integer a1=42;
    int a2=a1;//unboxing
    System.out.println();


    //directly we can convert
  //  int a3= Integer.parseInt(num);



}
}
