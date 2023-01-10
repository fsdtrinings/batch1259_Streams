package day10;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamAPIDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,5,6,78,69,30,88,67,120,130,105);
		
		for (Integer x : list) {
			if(x>=50 && x<=100)
				System.out.println(x);
		}
		
		System.out.println("----------------------------------");
		Stream<Integer>	streamList = list.stream();
		streamList.filter((p)->{
			if(p>=50 && p<=100) return true;
			else return false;
		}).
		forEach((p)->{
			System.out.println(p);
		});
		
		
		
	}//end main
	
}//end class
