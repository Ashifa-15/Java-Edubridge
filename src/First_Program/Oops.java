package First_Program;

public class Oops extends hiding {
//	private String name;
//	private int num;
//This Keyword to pass value to the instance variable using constructor.
	String name;
    int num;
	public Oops(String name){
//Assigning local variable name to the instance variable.
		this.name = name;
		int num= 5;
		this.num= 10;
//This keyword is used to differentiate local variable from instance variable.
		System.out.println("Printing local variable: "+ num);
		System.out.println("Printing instance variable: "+ this.num);
	}
public static void main (String args[]) {
	Oops obj = new Oops("Ashifa");
	System.out.println("The name is: "+ obj.name);
		
}
	
//Encapsulation
	public String getName() {
	return name;
}
	public void setName(String newname) {
	this.name = newname;
	  }

	public int getNum() {
	return num;
}
	public void setNum(int newnum) {
	this.num = newnum;
}
//Overriding
	public void run() {
		System.out.println("I'm Parent class");	
}
	public void play() {
		System.out.println("I'm Playing");
	}
	
//Abstraction
	public void capIndia() {
		System.out.println("Capital of India is Delhi");
	} 
}


