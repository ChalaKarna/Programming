package strings;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s1="Divya";
		String s2="Vidya";
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String F1 = new String(ch1);
		String F2 = new String(ch2);

		if(F1.equals(F2))
			System.out.println("yes");
		else
			System.out.println("NO");
	}
}

