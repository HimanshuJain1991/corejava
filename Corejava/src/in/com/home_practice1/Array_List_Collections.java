package in.com.home_practice1;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Collections {

	public static void main(String[] args) {
		ArrayList<String> sname=new ArrayList<>();
		sname.add("Himanshu Jain");
		sname.add("Ram Sharma");
		sname.add("Lokesh");
		sname.add("Hariom");
		System.out.println(sname);
		sname.add(1, "Amit Bansal");
		System.out.println(sname);
		//ArrayList sname1=(ArrayList) 
				sname.clone();
		System.out.println("copy "+sname);
		
	  System.out.println(sname.contains("Himanshu Jain"));
	  
	  List<Integer> l=new ArrayList();
	  l.add(101);
	  l.add(101);
	  l.add(101);
	  System.out.println(l);
	  
	  List<Integer> oo=new ArrayList();
	  oo.add(508);
	  oo.add(547);
	  System.out.println(oo);
	  oo.addAll(l);
	  System.out.println(oo);
    System.out.println( oo.get(2));
    int i=oo.remove(1);
    System.out.println("removed value is="+i+"from List");
    System.out.println(oo);
     
  
	}

}
