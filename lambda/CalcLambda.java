package lambda;

interface Calc {
    void add(int n1, int n2);
}

public class CalcLambda {

    public static void main(String[] args) {
    
    Calc sum = (int n1, int n2) -> {
        System.out.print("Sum");
    System.out.println((n1+n2));
    };
    sum.add(10, 20);
    //signature mapping is the process of matching the parameters of the lambda expression with the parameters of the functional interface method.
    Calc sum1=(int n1, int n2) -> System.out.println("Sum: " + (n1+n2));
    sum1.add(23, 34);

    }
}