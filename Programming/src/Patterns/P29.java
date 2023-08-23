/*
A B C D 
B C D E 
D E F G 
G H I J    */



package Patterns;

public class P29 {
	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=0;i<n;i++) {
			for (int j = 0; j<n; j++) {
				if(i>=j)
					System.out.print(ch++ +" ");	
			}
			System.out.println();
		}
	}
}
