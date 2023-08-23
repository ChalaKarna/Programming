package arrays;

import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter 5 integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min){
			min=a[i];
			 }
			else if(a[i]>max){
				max=a[i];}
		}
		System.out.println("Smallest element present="+min);
		System.out.println("Largest element present="+max);
		
		/*int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				a[i]=max;
			}
		}
		System.out.println("Largest element present="+max);*/
	}
}
