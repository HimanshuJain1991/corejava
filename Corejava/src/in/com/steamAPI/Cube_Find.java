package in.com.steamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Cube_Find {

	public static void main(String[] args) {
	List<Integer> s= List.of(1,2,3,4,5);
	List<Integer> square=s.stream().map(i->i*i*i).collect(Collectors.toList());
	System.out.println("cube"+square);
    
	}
	
}
