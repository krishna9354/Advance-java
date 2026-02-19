package varp;

public class MainVar {
    // var r=0;
//local variable type instance.
//which is var.
//once initialized the data type of the variable is fixed and cannot be changed later in the program.
    public static void main(String[] args) {

        var r="Java 10";
        var n1 =10.50;
        var n2 =20;
        var s=n1+n2;
        System.out.println("Sum: "+s);

    }
}

//triple quotes are the text block literals in java 15 and later versions which allow us to create multi-line string literals without the need for escape characters. 
// They are denoted by three double quotes (""") at the beginning and end of the string. 
// Text blocks can contain line breaks, tabs, and other special characters without the need for escaping them, making it easier to write and read multi-line strings in Java.