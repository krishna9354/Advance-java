// package streamapi;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,60,45,90,30,24,50,76);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);
        List<Integer> greaterlessNumbers = list.stream().filter(n->n>=50 && n<=60).toList();
        System.out.println(greaterlessNumbers);

    }
}