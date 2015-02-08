import java.math.BigInteger;
import java.util.ArrayList;

public class Problem10 {

	public static void main (String[] args) {
		double startTime = System.currentTimeMillis();
		run(2000000);
		double endTime = System.currentTimeMillis();
		System.out.println("Took "+((endTime - startTime) / 1000)+" seconds"); 
	}
	
	public static void run(int max) {
		ArrayList<Boolean> numbers = new ArrayList<Boolean>();
		for (int i = 0; i < max; i++) {
			numbers.add(i>=2);
		}
		
		BigInteger sumOfPrimes = BigInteger.ZERO;
		for (int i = 0; i < max; i++) {
			if (numbers.get(i)) { // checking whether the index is prime, so we can remove multiples
				sumOfPrimes = sumOfPrimes.add(BigInteger.valueOf(i)); 
					for (int j = i; j < numbers.size(); j+=i) { // removing all multiples so it is quicker to find other primes
						if(numbers.get(j) == true) {
							numbers.set(j, false);
						}
					}
			}
		}
		System.out.println("The sum of all primes below 2 million is:  " + sumOfPrimes);
	}
}
