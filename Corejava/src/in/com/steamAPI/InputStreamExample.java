package in.com.steamAPI;

import java.util.stream.IntStream;

public class InputStreamExample  {

	public static void main(String[] args) {
		//IntStream.range(1, 10).forEach(e->System.out.println("first"+e));
   IntStream.range(2, 5).forEach(System.out::println);
   IntStream num= IntStream.iterate(2, a->a+1);
		   num.limit(10).forEach(s->System.out.println(s));
		   
		 
	} 

}
