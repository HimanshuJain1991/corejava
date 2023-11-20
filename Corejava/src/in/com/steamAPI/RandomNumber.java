package in.com.steamAPI;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumber {

	public static void main(String[] args) {
		Random random =new Random();
		Stream<Integer> rn=Stream.generate(random::nextInt);
		rn.limit(5).forEach(System.out::println);

	}

}
