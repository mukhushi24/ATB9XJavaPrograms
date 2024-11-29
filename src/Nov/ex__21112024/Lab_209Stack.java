package Nov.ex__21112024;


import java.util.Stack;

public class Lab_209Stack {
    //Stack-last in first out
    //Stack extends vector
    //peek-looks at the object at the top of the stack without removing it from the stack
    //pop-remove the element from the stack
    //add,push-same but add is coming from vector
    public static void main(String[] args) {
        // Stack
        // List In -> First Out

//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s);

        Stack s = new Stack();
        s.push("janvi");
        s.push("jeh");
        s.push("Amit");
        s.add("Amit2");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);

        s.add(0,"Lucky");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));










    }
}


