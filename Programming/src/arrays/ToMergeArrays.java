package arrays;

import java.util.Scanner;

public class ToMergeArrays {

	public static void main(String[] args) {
		int[]a=toRead();
		int[]b=toRead();
		int[]res=toMerge(a, b);
		System.out.println("Merged array elements are");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]+"");
		}
	}

	public static int[]toRead(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i = 0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		return a;
	}
	public static int[] toMerge(int[]a,int[]b) {
		int[]res=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			res[a.length+i]=b[i];
		}
		return res;
		}
	}
