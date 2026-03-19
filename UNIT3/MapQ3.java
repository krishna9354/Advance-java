import java.util.*;

public class MapQ3 {
    public static void main(String[] args) {

        List<String> marks = Arrays.asList("Java","Python","C");

        List<String> firstLetters = marks.stream()
                .map(n -> String.valueOf(n.charAt(0)))
                .toList();

        System.out.println(firstLetters);
    }
}