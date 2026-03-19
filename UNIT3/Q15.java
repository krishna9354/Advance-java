// package streamapi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30,35);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);
        List<Integer> MultiFilter = list.stream()
        .filter(n-> n%2==0)
        .filter(n-> n>15)
        .toList();
        System.out.println(MultiFilter);

    }
}