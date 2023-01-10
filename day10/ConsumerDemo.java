package day10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,5,6,78,69,30,88,67,120,130,105);
		List<String> techList = Arrays.asList("java","angular","spring","microservices");
		
		Stream<Integer> myStream = list.stream();
		
		/* 1. Consumer is the interface
		 * 2. its a functional interface
		 * 3. Currently trying access it through any.. Inner class
		 * */
		
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override   // this is the method to pass input
			public void accept(Integer element) {
				System.out.println(element);
				
			}
			
		};
		
		// call forEach(_____as a argument it takes consumer object ____)
		myStream.forEach(c);
		
		
	}

}
