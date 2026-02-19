package funinter;
//functional interface are special interface that declared with fuunctional interface annotation and only contain one abstract method and it can have any number of default and static methods.
//Anotation @FunctionalInterface is used to indicate that an interface is a functional interface
//annotation is an important perimeter for functional interface.

@FunctionalInterface
interface Sub {
    int subtract(int n1, int n2);
}

public class MainF1{
    public static void main(String[] args) {

    Sub s = new Sub() {

    @override
    public int subtract(int n1, int n2){

        return n1 - n2;
    }};
    int r=s.subtract(100, 30);
    System.out.println("Subtraction: " + r);

    //lambda expression

    Sub s1 = (n1, n2) -> n1 - n2;

    int r1 = s1.subtract(100, 30);
    System.out.println("Subtraction: " + r1);

    }
}


//WHAT IS LAMBDA EXPRESSION?

//lambda expression is the short form of anonymous functions that always implements with functional interface.

// HOW TO USE LAMBDA EXPRESSION?
// ()->{}

// TYPES OF LAMBDA EXPRESSION:
// 1. No parameter, NO RETURN VALUE

//()->{
//   System.out.println("This is no parameter and no return value");
// }

//OR 

//()-> System.out.println("This is no parameter and no return value");

// 2. No parameter, WITH RETURN VALUE

//()->{ Int n1 = 10, n2 = 20; return n1 + n2;}

//OR

//()-> "Lambda expression";8
//()-> 20;

// 3. WITH ONE PARAMETER, NO RETURN VALUE

//(int n1) System.out.println(n1-10);
//(n1)-> System.out.println(n1-10);
//n1->(n1>10)? System.out.println(n1-10): System.out.println(n1<10); 

// 4. WITH ONE PARAMETER, WITH RETURN VALUE

// (int num) -> num + 10;
// (num) -> num + 20;
// num -> num + 30;

// 5. WITH MULTIPLE PARAMETER, NO RETURN VALUE

// (int n1, int n2)-> System.out.println("Sum of 2 numbers is: " + (n1+n2));


// 6. WITH MULTIPLE PARAMETER, WITH RETURN VALUE

// (int n1, int n2) -> n1 + n2;

