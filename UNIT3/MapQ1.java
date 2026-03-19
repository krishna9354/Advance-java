import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MapQ1 {

	public static void main(String[] args) {
	
		List<String> marks = Arrays.asList("sachin","rahul","amit");
			ArrayList<String> list = new ArrayList<String>();
			list.addAll(marks);
			System.out.println(list);
			List<String> grace5 =list.stream().map(mark->mark.toUpperCase()).toList();
			System.out.println(grace5);
	}

}