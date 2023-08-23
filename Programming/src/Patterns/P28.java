/*  1 2 3 4 
    2 3 4 5 
    4 5 6 7 
    7 8 9 10    */




package Patterns;

public class P28 {
	public static void main(String[] args) {
		int n=4;
		int k=1;
		for(int i=0;i<n;i++) {
			for (int j = 0; j<n; j++) {
				if(i>=j)
					System.out.print(k++ +" ");	
			}
			System.out.println();
		}
	}
}
