
public class Problem2 {

	public static void main(String [] args) {
		run();
	}
	
	public static void run() {
		int count = 0;
		int a = 1;
		int b = 0;
		int c = 0;
		while (c < 4000000) {
			c = a + b;
			b = a;
			a = c;
			if (c % 2 == 0) {
				count += c;
			}
		}
		System.out.println(count);
	}
}
