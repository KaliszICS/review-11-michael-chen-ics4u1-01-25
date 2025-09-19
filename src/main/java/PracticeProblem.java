public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] arr = {1, 2, 3, 4, 5};
		return arr;
	}

	public static String[] createArray(String a, String b, String c, String d) {
		String[] arr = {a, b, c, d};
		return arr;
	}

	public static int findValue(int a, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String a, String[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				count += 1;
			}
			if (count == 3) {
				return i;
			}
		}
		return -1;
	}
}
