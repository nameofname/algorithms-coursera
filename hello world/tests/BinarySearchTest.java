import org.junit.Test;
import junit.framework.TestCase;


public class BinarySearchTest extends TestCase {
	protected int[] whitelist;

	protected void setUp() {
		int n = 100;
		int i = 0;
		whitelist = new int[n];
		while (i < n) { 
			whitelist[i] = i;
			i++;
		}
	}

	@Test
	public void testBinarySearch() {
		int found = BinarySearch.rank(24, whitelist);
		assertEquals(found, 24);
	}

	@Test
	public void testBinarySearchNotFound() { 
//		System.out.println("This is the guy here : " + java.util.Arrays.toString(whitelist));
		int found = BinarySearch.rank(23, whitelist);
		assertEquals(found, 23); // this should be marked as a failure, no idea why it isn't 
	}

}
