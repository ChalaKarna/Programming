package strings;

public class WithoutLengthMethod {

	public static void main(String[] args) {
		String s="Gaurdian Angel";
		int length=0;
		char []ch=s.toCharArray();
		for (char c : ch) {
			length++;
		}
		System.out.println(length);
	}
}


//without converting string into char[]
/*public static void main(String[] args) {
	String s="DEEKSHA";
	int length=0;
	for (int i = 0; i < s.length(); i++) {
		s.charAt(i);
		length++;
	}
	System.out.println(length);
}*/
