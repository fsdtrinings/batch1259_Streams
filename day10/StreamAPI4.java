package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import day5.sets.Laptop;

public class StreamAPI4 {

	public static void main(String[] args) {
		
		List<Laptop> allLaptops = new ArrayList<>();
		
		Laptop l1 = new Laptop(101, "Dell", 50000, 8);
		Laptop l2 = new Laptop(102, "HP", 20505, 4);
		Laptop l3 = new Laptop(103, "Acer", 30000, 8);
		Laptop l4 = new Laptop(104, "Dell", 150505, 16);
		Laptop l5 = new Laptop(104, "Dell", 90505, 16);
		Laptop l6 = new Laptop(104, "Dell", 60505, 16);
		Laptop l7 = new Laptop(104, "Dell", 55000, 8);
		Laptop l8 = new Laptop(104, "Dell", 78505, 16);
		
		
		Stream<Laptop> stream = Stream.of(l1,l2,l3,l4,l5); // of method is used to create stream
		
		//printAllLaptops(stream);
		//filterOnLaptops(stream);
		filterAndSortBasedOnPrice(stream);
		
	}//end main
	
	public static void printAllLaptops(Stream<Laptop> stream)
	{
		stream.forEach((laptop)->{
			System.out.println(laptop);
		});
	}
	
	public static void filterAndUpdate(Stream<Laptop> stream)
	{
		
		// for all laptop 8 gb ram , cost + 9999
		
		stream.filter((p)->{
			if((p.getRamSize() == 8)) return true;
			else return false; 
		}).map((lap8Gb)->{
			 int currentCost = lap8Gb.getCost();
			 int newCost = currentCost+999;
			 lap8Gb.setCost(newCost);
					 
		})
		
	}
	
	public static void filterAndSortBasedOnPrice(Stream<Laptop> stream)
	{
		stream.filter((laptop)->{
			if(laptop.getBranName().equals("Dell")) return true;
			else return false;
		}).
		sorted((l1,l2)->{
			return l1.getCost() - l2.getCost();
		}).
		forEach((laptop)->{
			System.out.println(laptop);
		});
	}
	
	
	
	
	
	public static void filterOnLaptops(Stream<Laptop> stream)
	{
		stream
		.filter((p)->{
			if((p.getRamSize() == 8)) return true;
			else return false; 
		})
		.forEach((c)->{
			System.out.println(c);
		});
		
		
	}
	
	
	
	
	
	
}//end of class



















