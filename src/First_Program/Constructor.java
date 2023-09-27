package First_Program;

public class Constructor extends Oops {
	int val;
// Method Overloading.
	public static void sum(int a, int b){
	int ans= a+b;
	System.out.println("Answer of 2 val method:"+ans);
	}
	public static void sum(int x, int y, int z) {
		int res= x+y;
		System.out.println("Answer of 3 val method:"+res);
	}
	
//Constructor.
	public Constructor(int c) {
	val= c;
	}
	
	 public void run() {
			System.out.println("I'm Child class");
	}
	      
	public static void main(String[] args) {
	sum(2,3);
	sum(2,5,9);
	Constructor obj = new Constructor(3);
	System.out.println(obj.val);
	
// Method Overriding.
 	Constructor over = new Constructor());
		over.play();
	    over.run();
		
// For Abstraction
		Oops abs = new Oops();
		abs.capIndia();
	

}
}
