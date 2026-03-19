import java.util.*;

public class MapQ6 {
    public static void main(String[] args) {

        List<String> marks = Arrays.asList("Java","Python","API");

        List<Integer> lengths = marks.stream()
                .map(n -> n.length())
                .toList();

        System.out.println(lengths);
    }
}