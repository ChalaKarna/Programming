package Patterns;

public class P34 {
	public static void main(String[] args) {
		int n=4;
		int k=1;
		char ch='A';
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=n-1) {
					if(i%2==0)
						System.out.print(ch +" ");
					else
						System.out.print(k +" ");
				}
			}
			System.out.println();
			if(i%2==0)
			ch++;
			else
			k++;
		}
	}
}
