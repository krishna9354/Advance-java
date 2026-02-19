package java8;

interface Message {
    void displayMsg();
    //till java 8, interface can only have abstract methods but from java 8 onwards,
    // we can have default and static methods in interface.
    default void displayMsg(String msg){
        System.out.println(msg);
    }
    //static method in interface can be called without creating an instance of the class that implements the interface.
    static void displayInfo() {
        System.out.println("This is static method in interface");
    }
    //it is not necessary to override the default method in the implementing class but if we want to override it, we can do it.
    default void displayMsg() {
        System.out.println("This is default display method");
    }
    
}
class DisplayMessage implements Message {

    @Override
    public void displayMsg() {
        System.out.println("This is main display method");
    }

    @override
    public void displayMsg(String msg) {
        System.out.println("This is default display method");
    }

}

public class MainInter {

    public static void main(String[] args) {

        DisplayMessage dm = new DisplayMessage();
        dm.displayMsg();
        dm.displayMsg("This is default display method");
        Message.displayInfo();

    }

}