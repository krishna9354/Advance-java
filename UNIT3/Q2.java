// package streamapi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Amit", "Ravi", "Anil", "Vikas", "Ashok", "Rahul");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(name);
        List<String> filteredNames = list.stream().filter(n -> n.startsWith("A")).toList();
        System.out.println(filteredNames);
    }
}