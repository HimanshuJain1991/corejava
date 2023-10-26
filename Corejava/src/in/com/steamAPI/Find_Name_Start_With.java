package in.com.steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Name_Start_With {

	public static void main(String[] args) {
	List<String> name_list= List.of("Ram","Rays","Rohit","Rohan","Hariom");
	List<String> new_name=name_list.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
System.out.println(new_name);


List<String> list= new ArrayList<String>();
list.add("Ram");
list.add("Rohit");
list.add("Himanshu");
List<String> s=list.stream().filter(d->d.startsWith("R")).collect(Collectors.toList());
System.out.println(s);
	}

}
