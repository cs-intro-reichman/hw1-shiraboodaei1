// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currValue = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		double numOfYears = Double.parseDouble(args[2]);
		//Calc future value
		double futureValue = (currValue * (Math.pow((1 + interestRate),numOfYears)))/100;
		System.out.println("After " + (int) numOfYears + " years, $" +
							(int) currValue + " saved at " + interestRate +
							"% will yield $" + (int) futureValue);
	}
}