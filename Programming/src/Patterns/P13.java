/*
A B C D 
1 1 1 1 
E F G H 
2 2 2 2 
*/

package Patterns;

import java.util.Iterator;

public class P13 {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		int k=1;
		
		for(int i=0;i<n;i++) {
		 for (int j = 0; j<n; j++) {
			 
			if(i%2==0)
				System.out.print(ch+++ " ");
			else
				System.out.print(k+ " ");
			
		}
		 System.out.println();
		 if(i%2==1)
			 k++;
		}
	}

}
