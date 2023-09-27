package First_Program;

public class Variables {
//Global Variable.
	int ans;
	void sum() {
		int a=5,b=5;
		ans= a+b;
}
	
//Local Variable.
	void mul() {
		int res,x=5,y=5;
		res= x*y;
	}
public static void main (String args[]) {
Variables obj = new Variables();
obj.sum();
System.out.println(obj.ans);
obj.mul();
//System.out.println(obj.res);

}
}
