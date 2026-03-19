import java.util.*;

public class MapQ4 {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(10,20,30);

        System.out.println(marks);

        List<String> strList = marks.stream()
                .map(n -> String.valueOf(n))
                .toList();

        System.out.println(strList);
    }
}