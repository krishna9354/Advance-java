import java.util.*;

public class MapEx {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(10,45,35,75,80,91,67,76);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(marks);

        System.out.println(list);

        List<Integer> grace5 = list.stream()
                .filter(n -> n < 40)
                .map(n -> n + 5)
                .toList();

        System.out.println(grace5);
    }
}