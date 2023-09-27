package First_Program;
import java.util.Scanner;
import Second_Program.*;

public class Exercises extends Access {
public static void main (String args[]) {
	
//Program for protected access specifier, for subclass in different package - ACCESS.	
	Exercises acc = new Exercises();
	acc.name();
	
//Calculator program for 1.Value passing to method, 2.Static and Non Static functions.	
	Scanner sc = new Scanner(System.in);
	Exercises calc= new Exercises();
	int ans1= sum(4,2);
	System.out.println("Addition: "+ans1);
	int ans2= calc.sub(4,2);
	System.out.println("Subtraction: "+ans2);
	int ans3= calc.mul(4,2);
	System.out.println("Multiplication: "+ans3);
	int ans4= div(4,2);
	System.out.println("Division: "+ans4);

//Program for getting Array input from user and displaying.
	int n,i;
	System.out.println("Enter the number of Integers");
	n= sc.nextInt();
	int[] nums = new int[n];
	for(i=0;i<=n-1;i++) {
	System.out.println("Enter num "+(i+1));
	nums[i]=sc.nextInt();
	}
	for(i=0;i<=n-1;i++) {
	System.out.println(nums[i]);
	}

//Encapsulation
	Oops encap = new Oops();
	encap.setName("Ashifa");
	System.out.println(encap.getName());
	encap.setNum(15);
	System.out.println(encap.getNum());
	}


/*---------------------------------------------------------------------------*/
//sum method.
	public static int sum(int a, int b) {
  return a+b;
}
//sub method.
	public int sub(int a, int b) {
	return a-b;
}
//mul method.
	public int mul(int a, int b) {
	return a*b;
	}
//div method.
	public static int div(int a, int b) {
	return a/b;
	}
	}



