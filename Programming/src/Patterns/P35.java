/*
2    
4 6   
8 10 12  
14 16 18 20    */


package Patterns;

public class P35 {
	public static void maicwefwqsssdcsn(String[] args) {
		int n=4;
		int k=2;
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
				System.out.print(k +" ");
				k=2;
				}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
			
		}
	}
}
