// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int RightNum = num%10;
		int MiddleNum = (num/10)%10;
		int LeftNum = (num/100);

		//needs to work fo 123, 35,100,999,0,80,0,404,110,2024
	    System.out.println(LeftNum+" hundreds, "+MiddleNum+" tens, and "+RightNum+" ones.");

	}
}
