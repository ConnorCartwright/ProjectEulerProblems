
public class BinarySearch {
	
	static int[] myArray = new int[100000000];
	private static int low = 0;
	private static int high = myArray.length -1;

	public static void main(String[] args) {
		run(99999999);
	}
	
	public static void run(int search) {
		for (int i = 0; i < 100000000; i++) {
			myArray[i] = i;
		}
		
		boolean notFound = true;
		
		while (notFound) {
			int mid = (high + low + 1) / 2;
			System.out.println ("Low is: " + low + ", Mid is: " + mid + ", High is: " + high);
			if(myArray[mid] > search) { // search is in first half
				high = mid;
				mid = (mid + low) / 2;
			}
			else if (myArray[mid] < search) { // search is in 2nd half
				low = mid;
				mid = (mid + high) / 2;
			}
			else {
				System.out.println("Found the search number at index: " + myArray[mid]);
				notFound = false;
			}
		}	
	}
}
