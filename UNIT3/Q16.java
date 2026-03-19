//CREATE A STUDENT CLASS (NAME,MARKS ) AND WRITE A JAVA PROGRAM USING STREAM API FILTER() TO PRINT STUDENTS WHOSE MARKS ARE GREATER THAN 60.

// import java.util.*;

// class Student {
//     String name;
//     int marks;

//     Student(String name, int marks) {
//         this.name = name;
//         this.marks = marks;
//     }
// }

// public class Q16 {
//     public static void main(String[] args) {

//         List<Student> students = Arrays.asList(
//                 new Student("Krishna", 75),
//                 new Student("Aman", 50),
//                 new Student("Ravi", 90),
//                 new Student("Neha", 60),
//                 new Student("Piyush",30),
//                 new Student("Ritik",80)
//         );

//         students.stream()
//                 .filter(s -> s.marks > 60)
//                 .forEach(s -> System.out.println(s.marks));
//     }
// }

package streamapi;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int sid;
    private String name;
    private int marks;

    Student(int sid, String name, int marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }


    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
    return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
    }
}
public class Q16 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Student 1", 60));
        list.add(new Student(2, "Student 2", 40));
        list.add(new Student(3, "Student 3", 45));
        list.add(new Student(4, "Student 4", 75));
        list.add(new Student(5, "Student 5", 90));

        List<Student> g60 = list.stream()
                                .filter(student -> student.getMarks() > 60)
                                .toList();

        g60.forEach(System.out::println);
    }
}