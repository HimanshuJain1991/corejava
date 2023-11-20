package in.com.steamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListCrate {
       //need of stream API it reduce the size of code
	//Without using Stream program
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(45);list.add(5);list.add(14);list.add(2);
		System.out.println(list);
		List<Integer> newList=List.of(5,45,68,98,2,3,4,6,8);
		System.out.println(newList);
		List<Integer> newList2=Arrays.asList(1,2,3,4,8,9,6,7,33);
		System.out.println(newList2);
		List<Integer> newList3=new ArrayList<Integer>();
		for (Integer integer : newList2) {
			if(integer%2==0) {
				newList3.add(integer);
			}
			
		}
		System.out.println("Normal Program"+newList3);
		
		//using Stream API
		Stream<Integer> stream=newList2.stream();
        //	List<Integer> newList4=stream.filter(i->i%2==0&& i>4).collect(Collectors.toList());	
          //   System.out.println("using Stream"+newList4);
             System.out.println(stream.filter(i->i%2==0&& i>4).collect(Collectors.toList()));
	}

}
