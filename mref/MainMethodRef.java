package mref;

class Circle {
    //if the method will be static then, we have to change the method reference to Circle::area instead of c::area because static methods are associated with the class rather than an instance of the class.here the instance of the class is not required to invoke the static method.
    

    double area(int r) {
        return Math.PI * r * r;
    }
}

@FunctionalInterface
interface Area {
    double getArea(int num);
}

public class MainMethodRef {
    public static void main(String[] args) {

        Circle c = new Circle();
        Area ca = c::area; // Method reference to the instance method 'area' of the Circle class 
        // The method reference 'c::area' is used to create an instance of the Area functional interface, which can be invoked to calculate the area of a circle with a given radius.
        System.out.println("Area="+ca.getArea(34));
        CircleInfo ci = Circle::new; // Method reference to the constructor of the Circle class
        ci.getInfo("This is parameterized constructor"); // The method reference 'Circle::new' is used to create an instance of the CircleInfo functional interface, which can be invoked to create a new Circle object with a given string parameter.



    }

}