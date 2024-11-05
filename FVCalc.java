// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int CurrentVal = Integer.parseInt(args[0]);
		int InterestRate = Integer.parseInt(args[1]);
		Double Rate = (double)InterestRate/100;
		//Double InterestRate = Double.parseDouble(args[1])
		int n = Integer.parseInt(args[2]);  //number of years
		Double power = Math.pow(1+Rate,n);
		Double Futureval = (int)CurrentVal*power;
		System.out.println("After "+n +" years, $"+CurrentVal + " saved at "+InterestRate +"% will yield $" +Math.round(Futureval));
	}
}