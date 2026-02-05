package area;

class Area {
    int r,l,b;
    //area constructor
    // Area() {
        // System.out.println("Area class Constructor");
    // }

    //parameterized constructor passed below

    Area(String msg){
        System.out.println(msg);
    }
    void getArea() {
        System.out.println("This is Area class");
    }
}
// Circle class inherits Area class
class Circle extends Area {
    final double Pi = 3.14;
    Circle(int r) {
        // Implicit call to super()
        //it should be the first statement in the constructor
        super("THis is the area consructor");
        this.r = r;
    }
    void getCircleArea(){
        double result = Pi*super.r*this.r;
        // this will only access the r of Circle class untill r is not defined in Circle class it will access the r of Area class.
        // super is directly accessing the r of Area class.
        System.out.println("Area of Circle = " + result); 
    }

}

public class AreaMain {
    public static void main(String[] args) {
// Create an object of Circle class
// and call getArea method
// it means it can access the method of parent class
        Circle c = new Circle(12);
        c.getArea();
        c.getCircleArea();


    }
}


//Sub Class Constructor implicitly calls Super Class Default Constructor(Always).  