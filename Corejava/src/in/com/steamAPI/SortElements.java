package in.com.steamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortElements {

	public static void main(String[] args) {
		List<Integer> list= List.of(45,65,89,74,1,5);
		List<Integer> l=list.stream().sorted().collect(Collectors.toList());
             System.out.println(l);
             Stream<Integer> new_list=list.stream();
	       
	}

}
