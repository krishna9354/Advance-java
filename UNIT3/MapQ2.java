import java.util.*;

public class MapQ2 {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(marks);
        System.out.println(list);
        List<Integer> grace5 = list.stream()
                .map(n -> n*n)
                .toList();
        System.out.println(grace5);
    }
}
