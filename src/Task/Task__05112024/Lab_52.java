package Task.Task__05112024;

public class Lab_52 {
    public static void main(String[] args){
        Dog_5 d1=new Dog_5();
        d1.name="Buddy";
        System.out.println(d1.name);
         d1.breed= "Golden Retriever";
        System.out.println(d1.breed);
          d1.age=3;
        System.out.println(d1.age);
          d1.weight= 30.0;
        System.out.println(d1.weight);
        d1.bark("high");
        d1.eat();
        d1.play(2);


        Dog_5 d2=new Dog_5();
        d2.name="Charlie";
        System.out.println(d2.name);
        d2.breed="Beagle" ;
        System.out.println(d2.breed);
        d2.age=1;
        System.out.println(d2.age);
        d2.weight= 18.0;
        System.out.println(d2.weight);
        d2.bark("low");
        d2.eat();
        d2.play(3);

        Dog_5 d3=new Dog_5();
        d3.name="Max";
        System.out.println(d3.name);
        d3.breed="German Shepherd" ;
        System.out.println(d3.breed);
        d3.age=5;
        System.out.println(d3.age);
        d3.weight= 35.0;
        System.out.println(d3.weight);
        d3.bark("middle");
        d3.eat();
        d3.play(4);

        Dog_5 d4=new Dog_5();
        d4.name="Bella";
        System.out.println(d4.name);
        d4.breed="Bulldog" ;
        System.out.println(d4.breed);
        d4.age=2;
        System.out.println(d4.age);
        d4.weight= 25.0;
        System.out.println(d4.weight);
        d4.bark("very high");
        d4.eat();
        d4.play(5);

        Dog_5 d5=new Dog_5();
        d5.name="Lucy";
        System.out.println(d5.name);
        d5.breed="Poodle" ;
        System.out.println(d5.breed);
        d5.age=4;
        System.out.println(d5.age);
        d5.weight= 20.0;
        System.out.println(d5.weight);
        d5.bark("high");
        d5.eat();
        d5.play(6);


    }
    static class Dog_5 {
        String name;
        int age;
        String breed;
        double weight;

        void bark(String pitch) {
            System.out.println(name + "  barks with " + pitch + " pitch");
        }

        void eat() {
            System.out.println(name + " is eating.");
        }

        void play(int balls) {
            System.out.println(name + " plays with " + balls + " balls");
        }
    }
}
