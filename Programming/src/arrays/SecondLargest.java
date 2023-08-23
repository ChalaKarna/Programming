package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter 5 integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
	
			Arrays.sort(a);
			System.out.println(a[i]);
		}
		int num=a.length-1;
			System.out.println("Second largest element="+a[num-1]);
	
	}

}
