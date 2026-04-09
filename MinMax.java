import java.util.List;
import java.util.Arrays;

public class MinMax {
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(23,12,6,67,89,43);
    Optional<Integer> result = list.stream().max((a,b)->b-a);
    result.ifPresent(System.out::println);

    }
}