import java.util.Arrays;


public class BinarySearch {
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			// key is the key to find. search through the ordered list
			// and find the mid point each time. keep narrowing your
			// search by re-assigning the lo and high to search through. 
			// there is no looping, you just keep narrowing in the lo 
			// and hi. 
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
