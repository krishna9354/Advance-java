import java.util.ArrayList;

public class MainForeach {
    public static void main(String[] args) {
        int data[] = new int[] {12, 23, 34, 45, 56};
        List<Integer> listData = Arrays.stream(data).boxed().collect(Collectors.toList());

        //here stream is used to convert the array of primitive int to a stream of Integer objects, which can then be collected into a List using the collect method and Collectors.toList().
        //boxed() is used to convert each primitive int in the stream to its corresponding Integer object, allowing us to work with a List of Integer instead of a List of primitive int.
        //collect(Collectors.toList()) is used to collect the elements of the stream into a List. It takes the elements from the stream and adds them to a new List, which is then returned as the result of the collect operation.   

        listData.forEach(System.out::println);


    }
}