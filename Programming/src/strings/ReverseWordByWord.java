package strings;

import java.util.Scanner;

public class ReverseWordByWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one string");
		String s=sc.nextLine();
		String[]s1=s.split(" ");
		String temp=" ";

		for (int i=s1.length-1;i>=0;i--) 
		{
			temp=temp+s1[i]+" ";
		}
		System.out.println(temp);
	}
}


