package in.com.steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameStart {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Himanshu");list.add("Shruti");list.add("Riyansh");
		list.add("Rahul");list.add("Shruti");
		System.out.println(list);
		List <String> new_List=list.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
	      System.out.println(new_List);
	}

}
