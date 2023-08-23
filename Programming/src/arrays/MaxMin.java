package arrays;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter elements into the array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min){
			min=a[i];
			}
				System.out.println(a[i]);
				
		}
	}

}
