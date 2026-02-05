package calc;

class sum {
    int num1,num2;

    Sum()
    {//default constructor-user defined

        this(10,10);//calling parameterized constructor from default constructor using this keyword.

    }

    Sum(int num1, int num2)//local variables are known within the constructor only- it can't be accessed outside.
    {
        this.num1=num1;
        this.num2=num2;
    }
        
    void getSum(){
        System.out.println("Sum =" +(num1+num2));
    }  

}
public class Calculator {
    public static void main(String[] args){
        Sum s1; 
        //reference variable - declaration
        // s1=new Sum(10,20); 
        //object instentation and constructor call

        Sum s1 =new Sum(10,20); 
        //this will give error as no default constructor is defined as we have defined a parameterized constructor.
        s1.getSum();
        new Sum(30,40).getSum();
            Sum s2=new Sum(); 
            //this will work as we have defined a default constructor.
            s2.getSum();
            
        // int s2;
        // s2.getSum(); 

    }
}