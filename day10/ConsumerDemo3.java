package day10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo3 {

	public static void main(String[] args) {

		ConsumerDemo3 mainObj = new ConsumerDemo3();

		List<Integer> list = Arrays.asList(10, 5, 6, 78, 69,58,98,87,63,74,91,55,62,73 , 30, 88, 67, 120, 130, 105);
		//mainObj.forEachDemo(list);
		//mainObj.getMinOrMax(list);

		mainObj.filterOperation(list);
	}

	public void forEachDemo(List<Integer> list) {
		Stream<Integer> myStream = list.stream();

		myStream.forEach((element) -> {
			element += 3; // any business objective
			System.out.println(" element " + element);
		});
	}

	public void filterOperation(List<Integer> list)
	{
		list.stream()
		.filter((ele)->{
			if(ele>=50 && ele<=100) return true;
			else return false;
		})
		.sorted((a,b)->{
			return a - b;
		})
		
		.forEach((a)->{
			System.out.println(a);
		});
		 
		// System.out.println(countNumbers);
	}
	
	
	public void getMinOrMax(List<Integer> list)
	{
		int minValue = list.stream()
		    .max((v1,v2)->{
			return v1-v2;
		    })
		    .get();
		
		System.out.println(minValue);
	}
	
	
	
}//end class
