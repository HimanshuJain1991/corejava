package in.com.class_test_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Start_With {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Amit");
		list.add("Aman");
		list.add("Amar");
		list.add("Himanshu Jain");
         System.out.println(list);
        List<String> newList= list.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
         System.out.println(newList);
         
         
         LinkedList<Integer> l=new LinkedList<Integer>();
         l.add(101);l.add(3222);l.add(76754);
         l.add(67);
         System.out.println(l);
         Stream<Integer>st=l.stream();
        List<Integer> number=st.filter(d->(d%2==0)).collect(Collectors.toList());
        System.out.println(number);
         
        List<Integer> last=List.of(22,45,65,43,32,32);
        List<Integer>new_list1=last.stream().distinct().collect(Collectors.toList());
        System.out.println(new_list1);
        
        List<Integer> cu=List.of(1,2,3,4,5);
        List<Integer> cube=cu.stream().map(e->e*e*e).collect(Collectors.toList());
        System.out.println(cube);

	}

}
