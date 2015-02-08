
public class Problem12 {
	
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		run();
		double endTime = System.currentTimeMillis();
		System.out.println("Took "+((endTime - startTime) / 1000)+" seconds"); 
	}
	
	public static void run() {
		long n = 1;
	    int maxDivisors = 500;
	    while (countDivisors((n+1)/2) * countDivisors(n) <= maxDivisors) {
	        n++;
	        if (countDivisors(n/2) * countDivisors(n+1) > maxDivisors) {
	            break;
	        }
	        n++;
	    }
	    long number = n*(n+1)/2;
	    System.out.println("The first triangle number with over "+maxDivisors+" divisors is: "+number);
	}
	
	public static long countDivisors(long number) {
		long divisors = 0;
		for (int i = 1; i*i <= number; i++) {
		       if (number % i == 0) {
		            if (i*i < number) {
		                divisors+=2;
		            } else {
		                divisors += 1;
		            }
		        }
		}
		return divisors;
	}
}