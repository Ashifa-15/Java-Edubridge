package First_Program;
import java.util.Scanner;
public class Loops {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
// Conditional Loops.
	int marks=90;
	if(marks>=90){
	System.out.println("First Class");
	}
	else if(marks>=80) {
		System.out.println("Second Class");
		}
	else if(marks>=70) {
		System.out.println("Third Class");
		}
     else {
    	 System.out.println("Normal");
     }
	
//Switch Case.
	System.out.println("What do you want?");
	String name=sc.nextLine();
	switch(name) {
	case "my name":
		System.out.println("Ashifa");
	break;
	case "father name":
		System.out.println("Safiulla");
	break;
	case "mother name":
		System.out.println("Vahidha");
	break;
	default:
		System.out.println("Invalid");
	}
	
//While loop.
	System.out.println("Enter The Number");
	int loop = sc.nextInt();
	while(loop<=5) {
		System.out.println("Five");
		loop++;
	}
	
//1.For Loop.
	int i,n=5, val=0;
	for(i=0;i<=n;i++){
     val+=i;
	}
	System.out.println("Sum of " +n +" Natural Number:" +val);

//2.For Loop.
	int j;
    for( j=0;j<=5;++j) {
    System.out.println(j);	
    }
  
    for(int z=0;z<=5;z++) {
        System.out.println(z);	
        }
//3. For Loop.
	int t, sub,sum=0;
	System.out.println("Enter the number of Subjects:");
	sub=sc.nextInt();
	 for(t=1;t<=sub;t++) {
	System.out.println("Enter Subject "+t+" :");
	sum+= sc.nextInt();
}
	float avg=sum/sub;
	System.out.println("Average: "+avg);
	
	
}}   
