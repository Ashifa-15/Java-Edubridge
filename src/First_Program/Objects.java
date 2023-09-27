package First_Program;

public class Objects {
	int x=10;
	String flower = "Rose";
	public static String name= "Ashifa";
	
//Static blocks can be executed even being outside the main function.
	static {
		System.out.println("Hello!");
	}
	
	public static void main(String[] args) {
	Objects ob = new Objects();
	Objects two = new Objects();

//Displaying with 1.ob.
	System.out.println("Before reassigning and printing using ob:");
	System.out.println(ob.x);
	System.out.println(ob.flower);
	System.out.println(Objects.name);
	
// Reassigning values in object "two" but the values will not be changed in object "ob".
	two.x=20;
	two.flower = "Lilly";
	two.name= "Sherene";
	
//Displaying with 1.ob.
	System.out.println("After reassigning and printing using ob:");
	System.out.println(ob.x);
	System.out.println(ob.flower);
	System.out.println(ob.name);
	
//Displaying with 2.two.
	System.out.println("After reassigning and printing using two:");
	System.out.println(two.x);
	System.out.println(two.flower);
	System.out.println(two.name);
	}
}
