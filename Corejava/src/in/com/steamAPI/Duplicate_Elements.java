package in.com.steamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_Elements {

	public static void main(String[] args) {
		List<Integer> list_num=List.of(5,6,8,1,5,30);
		List<Integer>num1=list_num.stream().distinct().collect(Collectors.toList());
System.out.println(num1);
	}

}
 
