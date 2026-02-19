package enc;
import java.util.*;

class Product {
// the data can be private to hide it from the outside world to ensure data is not misused. 
    private int pid;
    private String productName;
    private double price;
    private int quantity;
    //there is the parent class is the object class and it is the super class of all the classes in java. 
    public Product(int pid, double price, String productName, int quantity) {
        this.pid = pid;
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    
}

public class MainEnc {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"Mobile", 10000, 10));
        list.add(new Product(2,"Mobile", 20000, 30));
        list.add(new Product(3,"Laptop", 30000, 20));
        list.add(new Product(4,"Tablet", 40000, 50));
        list.add(new Product(5,"Headphones", 50000, 12));
        list.add(new Product(6,"Keyboard", 60000, 19));
        System.out.println("Product ID\tProduct Name\tPrice\tQuantity");
        for(Product p: list) {
        
            String result = String.format("Pid: %d, Product Name: %s, Price: %.2f, Quantity: %d",
                p.getPid(),
                p.getProductName(),
                p.getPrice(),
                p.getQuantity());
            System.out.println(result);
        }
    }
}

//abstract class object is not initialized and it is used as a base for other classes. 
//abstract vs interface: abstract class can have both abstract and non-abstract methods but interface can only have abstract methods.
//abstract class can have constructors but interface cannot have constructors.
//abstract class can have instance variables but interface cannot have instance variables.
//abstract class can have static methods but interface cannot have static methods.
//abstract class data members can be private, protected, public but interface data members are public by default.

//if new keyword is passed in object creation then there will be no reference sharing .
//they will be different objects in memory and they will not share the same reference variable.
//they will have differnt memory location.

//static keyword is used to have all updates in objects to be reflected in all the instances of the class.
//we need to share a common variable among all the instances of the class then we can use static keyword.

//final keyword is constannt in variable
//final method cannot be overridden but it can be overloaded.
//final class cannot be inherited but it can be instantiated.

// this keyword is used to refer to the current object of the class.
// super keyword is used to refer to the parent class of the current object of the class.

//static keyword in data initialization is used to initialize the static variables of the class.
//static block is used to initialize the static variables of the class and it is executed only once when the class is loaded in memory.
//static is used to update the default value of the static variable and it is shared among all the instances of the class.
