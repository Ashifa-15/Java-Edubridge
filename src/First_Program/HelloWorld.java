package First_Program;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
// SOP.
	System.out.println("Hello World");
	
// Arithmetic Operators.
	int a=5;
	float b=5.5f;
	System.out.println("The ans is "+ (a+b));
	System.out.println("The ans is "+ (a-b));
	System.out.println("The ans is "+ (a/b));
	System.out.println("The ans is "+ (a*b));
	System.out.println("The ans is "+ (a%b));
	
// String Concatenation.
	String Fname = "Ashifa ";
	String Lname = "Sherene";
	System.out.println(Fname+Lname);
	
// Type Casting.
	int x=20;
	float y=x;
	System.out.println(y);
	
// Increment/ Decrement.
	int num1=5, num2=5;
	System.out.println(num1++);
	System.out.println(--num1);
	System.out.println(--num1);
	System.out.println(++num2);
	System.out.println(num2--);
	
//Comparison Operator.
	int s =9, h=4;
	System.out.println("C1 "+(s==h));
	System.out.println("C2 "+(s!=h));
	System.out.println("C3 "+(s>h));
	System.out.println("C4 "+(s<h));
	System.out.println("C5 "+(s>=h));
	System.out.println("C6 "+(s<=h));
	
//Logical Operator.
	System.out.println("L1 "+(s>5 && h<5));
	System.out.println("L2 "+(s>5 && h<4));
	System.out.println("L3 "+(s>5 || h<4));
	System.out.println("L4 "+(s>10 || h<4));
	System.out.println("L5 "+!(s>5 && h<5));
	System.out.println("L6 "+!(s>5 && h<4));
	System.out.println("L7 "+(s&h));
	
//Assignment Operator.
	int z=5;
	System.out.println("A1 "+(z+=5));
	System.out.println("A2 "+(z-=2));
	System.out.println("A3 "+(z/=5));
	System.out.println("A4 "+(z%=4));

//Ternary Operator.
    int n1=5,n2=4;
    String compare;
    compare=(n1>n2)? "True":"False";
	System.out.println("Ternary: "+compare);
	
// 2.Ternary. 
	String str1="Ashifa";
	Scanner sc= new Scanner(System.in);
	System.out.println("Password\n");
	String str2= sc.nextLine();
	int comp= str1.compareTo (str2);
	String res= (comp==0)? "Valid Password.":"Invalid Password.";
	System.out.println(res);

}
}