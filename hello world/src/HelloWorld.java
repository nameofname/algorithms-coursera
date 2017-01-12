public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("scoopily doopily.");
		System.out.println(makeString());	
		char[] arr = makeArray(5);
		System.out.println(new String(arr));	
	}

	private static char[] makeArray (int num) {
		char[] arr = new char[num];
		for(int i=0; i<num; i++) {
			char c = 'r';
			arr[i] = c;
		}
		return arr;
	}
	
	private static String makeString () {
		String d = "you done it";
		return d;
	}
}
