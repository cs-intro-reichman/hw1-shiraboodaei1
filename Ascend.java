// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		// Get 3 random numbers according to lim 
		double a = Math.random() * lim;
		double b = Math.random() * lim;
		double c = Math.random() * lim;
		// Calc max value 
		double max1 = Math.max(a,b); 
		double max2 = Math.max(b,c);
		double maxValue = Math.max(max1, max2);
		// Calc min value 
		double min1 = Math.min(a,b); 
		double min2 = Math.min(b,c);
		double minValue = Math.min(min1, min2);
		// Calc mid value 
		double midValue = Math.max(min1, min2);
		// Print asc 
		System.out.println ((int) a + " " + (int) b + " " + (int) c);
		System.out.println((int) minValue + " " + (int) midValue + " " + (int) maxValue);
	}
}
