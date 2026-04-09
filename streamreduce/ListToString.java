// package streamreduce;

import java.util.Arrays;
import java.util.List;

public class ListToString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,14,54,67,14,178,209,96);
        int result = list.stream().reduce("",(a,b)->a+" "+b);
        System.out.println(result);
    }
}