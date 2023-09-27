package First_Program;

public class Array {
	public static void main(String args[]) {
	String[] fruits = {"Apple", "Orange","Mango","Jackfruit"};
	System.out.println(fruits[2]);
	
//Calling variables from Object class - OBJECT.
	Objects cls = new Objects();
	System.out.println(cls.x);
	System.out.println(cls.flower);

//Checking Access Specifier - EXERCISE.
	Exercises calc= new Exercises();
	int ans2= calc.sub(4,2);
	System.out.println("Subtraction: "+ans2);
	}}
