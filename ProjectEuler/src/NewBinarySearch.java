
public class NewBinarySearch {
	
	private static int[] a = {1,3,4,4,6,17,79,81,90};
	private static int n = a.length -1;
	private static int search = 79; // number to search for

	public static void main(String[] args) {
		System.out.println("Found desired number " + search + ", at index " + binarySearch());
	}
	
	public static int binarySearch() {
		int left = 0, right = n, mid;
		while (left < right) {
			mid = ( left + right ) / 2;
			if (search > a[mid]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		if (a[left] == search) {
			return left;
		}
		else {
			return -1;
		}
	}
}