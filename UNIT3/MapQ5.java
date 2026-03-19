import java.util.*;

public class MapQ5 {
    public static void main(String[] args) {

        List<String> marks = Arrays.asList("A","B","C");

        List<String> firstLetters = marks.stream()
                .map(n -> "item-"+n)
                .toList();

        System.out.println(firstLetters);
    }
}