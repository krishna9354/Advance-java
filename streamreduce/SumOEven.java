// package streamreduce;

import java.util.Arrays;
import java.util.List;

public class SumOEven{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,14,54,67,14,178,96);
        int result = list.stream().reduce(0, (a, b) -> (b % 2 == 0) ? a + b : a);
        System.out.println(result);
    }
}