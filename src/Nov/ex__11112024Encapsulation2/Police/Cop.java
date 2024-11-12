package Nov.ex__11112024Encapsulation2.Police;

public class Cop {
    //Private-instance variable is always private
    //Protected-within the package not outside the package
    // Public
    //default-it also acts as protected
    //parent constructor can be called using super();
    //this();+current object

    private int gun;
    public String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }






}
