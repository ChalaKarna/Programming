package strings;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.nextLine();
		int[]a=Anagram.frequency(s1);
		boolean res=isPangram(a);
		if(res)
			System.out.println("Pangram");
		else
			System.out.println("Not a Pangram");
	}

	public static boolean isPangram(int[]a) {
		for (int  i= 0;  i< a.length; i++) {
			if(a[i]==0)
				return false;
		}
		return true;
	}
}
