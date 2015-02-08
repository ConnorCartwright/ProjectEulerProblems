
public class Problem1 {
	
	public static void main(String [] args) {
		run();
	}
	
	
	public static void run() {
		int count = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				count += i;
			}
		}
		System.out.println(count);
	}
}
