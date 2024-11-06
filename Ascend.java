// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a= ((int)(Math.random()*lim));
		int b=((int)(Math.random()*lim));
		int c= ((int)(Math.random()*lim));
		int sum = a+b+c;
		System.out.println(a+" "+b+" "+c);
		int MinNum = Math.min(a,b);
		MinNum = Math.min (MinNum,c);
		int MaxNum = Math.max(a,b);
		MaxNum = Math.max (MaxNum,c);
		int MiddleNum = sum -(MinNum+MaxNum);
		System.out.println(MinNum+" "+MiddleNum+" "+MaxNum);

	}
}
