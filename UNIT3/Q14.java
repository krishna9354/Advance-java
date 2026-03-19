// package streamapi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Java", "Python", "Go", "Ruby");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(name);
        List<String> Str = list.stream().filter(n -> n.contains("o")).toList();
        System.out.println(Str);
    }
}