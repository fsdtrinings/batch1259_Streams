package day10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,5,6,78,69,30,88,67,120,130,105);
		
		Stream<Integer> myStream = list.stream();
		
		myStream.forEach(new Consumer<Integer>() {

			@Override   // this is the method to pass input
			public void accept(Integer element) {
				System.out.println(element);
				
			}
			
		});
		
		
	}

}
