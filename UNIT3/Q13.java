import java.util.*;

public class Q13 {
    public static void main(String[] args) {

        List<String> number = Arrays.asList("10","20","20","30","30");

        List<Integer> num = number.stream()
                .map(Integer::parseInt)
                .distinct()
                .filter(n -> n > 13)
                .toList();

        System.out.println(num);
    }
}