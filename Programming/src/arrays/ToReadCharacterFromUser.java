package arrays;

import java.util.Scanner;

public class ToReadCharacterFromUser{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character/string");
		char ch = s.next().charAt(0);
		System.out.println(ch);
	}
}
