package arrays;

import java.util.Arrays;

public class SortUsingBuiltIn {

	public static void main(String[] args) {
		int[]a= {10,5,20,12,1};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

