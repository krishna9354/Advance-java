// package streamapi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Java", "Python", "C", "React", "C#", "Next.js", "Node.js");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(name);
        List<String> Str = list.stream().filter(n -> n.length()>4).toList();
        System.out.println(Str);
    }
}