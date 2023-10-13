package in.com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("Himanshu", 12545);
		m.put("Ram", 54569);
		m.put("Hariom", 4587);
		System.out.println(m);
		System.out.println("contains key Ram : "+m.containsKey("Ram"));
		System.out.println("contain values: "+m.containsValue(12545));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
//		m.remove("Ram");
//		System.out.println(m);
		System.out.println(m);
		System.out.println(m.remove("Ram", 54569));
		System.out.println(m);
		m.put("Riyansh", 101);
		System.out.println(m);
		System.out.println("tostring() method "+m.toString());
	//	m.merge("Himanshu Jain", 102, remappingFunction);

	}

}
