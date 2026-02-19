package recordp;

// class Student{
//     int sid;
//     String name;
//     int rollno;

// }

record Student (int sid, String name, int rollno) {};

public class RecordMain {
    public static void main(String[] args) {

        Student s = new Student(1,"Student",1);
        System.out.println("Student ID: "+s.sid());
        System.out.println("Student Name: "+s.name());
        System.out.println("Student Roll No: "+s.rollno());

    
    

    }
}