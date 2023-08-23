package strings;

import java.util.Scanner;

public class ReplaceBlankSpaceByChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter one string");
		String s1=s.nextLine();
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		char[]c=s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' ')
			{
				c[i]=ch;
			}
		}
		s1=new String(c);
		System.out.println(s1);
	}

}
