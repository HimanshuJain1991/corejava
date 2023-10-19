package in.com.steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Even_Number_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a_list=new ArrayList<Integer>();
		a_list.add(106);
		a_list.add(785);
		a_list.add(456);
		a_list.add(78+2);
		a_list.add(5);
//		System.out.println(a_list);
//		for (Integer i : a_list) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
		Stream<Integer> stream=a_list.stream();
//		List<Integer> newlist=stream.filter(e->e%2==0).collect(Collectors.toList());
//       System.out.println(newlist);
      List<Integer> newlist1=stream.filter(e1->e1>50).collect(Collectors.toList());
       System.out.println(newlist1);
	}

}
