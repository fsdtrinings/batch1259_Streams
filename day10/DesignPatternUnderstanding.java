package day10;

class Animal
{
	String name;
	int weight;
	int age;
	int height;
	
	
	public Animal setName(String name)
	{
		this.name = name;
		return this;
	}
	public Animal setAge(int age)
	{
		this.age = age;
		return this;
	}
	public Animal setWeight(int weight)
	{
		this.weight = weight;
		return this;
	}
	

}


public class DesignPatternUnderstanding {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		dog = dog.setName("jojo");
		print(dog);
		dog = dog.setWeight(25);
		print(dog);
		dog = dog.setAge(10);
		print(dog);
		
		// --------------------------
		
		Animal cat = new Animal();
		cat.setName("tomcat")
		.setAge(6)
		.setWeight(14);
		
		print(cat);
		
		
	}
	
	public static void print(Animal a)
	{
		System.out.println("--------------------");
		System.out.println("Name "+a.name);
		System.out.println("Age "+a.age);
		System.out.println("Weight "+a.weight);
		
	}
	
	
}










