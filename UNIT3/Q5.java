import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Java", null, "Spring", null, "React");

        List<String> Str = name.stream().filter(n -> n != null).toList();

        System.out.println(Str);
    }
}