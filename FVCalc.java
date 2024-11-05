// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int CurrentVal = Integer.parseInt(args[0]);
		double InterestRate = Double.parseDouble(args[1]);
		double Rate = InterestRate/100;
		//Double InterestRate = Double.parseDouble(args[1])
		int n = Integer.parseInt(args[2]);  //number of years
		double power = Math.pow(1+Rate,n);
		double Futureval = CurrentVal*power; 
		System.out.println("After "+n +" years, a $"+CurrentVal + " saved at "+Rate*100 +"% will yield $" + (int) Futureval );
	}
}