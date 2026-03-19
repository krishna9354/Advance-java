package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamEx {
    public static void main(String[] args) {
        // List data = Arrays.asList(23, 45, 12, 56, 78, 90);

        // Stream info = Stream.of(23, 45, 67, 89, 90, "info");


        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(73);
        // list.addAll(data);
        // System.out.println(list);

        // Stream listStream = data.stream();

        // Stream listStream = list.stream();
        // listStream.Filter(null).toList();
        // list.stream().filter(null)
        // List.stream()

        List<Integer> data = Arrays.asList(23, 45, 12, 56, 78, 90);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(data);
        System.out.println(list);
        List<Integer> g50=list.stream().filter((n->n>50)).toList();
        System.out.println(g50);
        list.stream().filter((n->n>50 && n<70)).forEach(System.out::println);
        System.out.println();
        System.out.println("map");

    
    }
}