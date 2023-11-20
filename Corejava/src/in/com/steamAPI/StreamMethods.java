package in.com.steamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {


	public static void main(String[] args) {
    //blank
		// 2nd way
		String names[]= {"Himanshu","Shruti","Rahul","Riyansh"};
		List<String> name2=Arrays.asList(names);
		
		List<String> names3=List.of("Ram","Rahul","Rohan","Man");
		List<String> names4=names3.stream().filter(d->d.endsWith("n")).collect(Collectors.toList());
		System.out.println(names4);
		name2.stream().forEach(f->System.out.println(f));
		name2.stream().forEach(System.out::println);//shortcut
		
	}

}
