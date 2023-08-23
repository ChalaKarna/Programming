package arrays;

import java.util.Scanner;

public class ReverseIntArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter 5 values");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int i=0; int j=a.length-1;
		
		while(i<j) {
			int teopiuyjtrgefemp=a[i];
			a[i]=a[j];
			i++;
			j--;
			}
		System.out.println(a[i]);
		}
	}
