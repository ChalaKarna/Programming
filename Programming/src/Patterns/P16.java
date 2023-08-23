package Patterns;

public class P16 {
	public static void main(String[] args) {
		int row=3;
		int col=4;
		char ch='A';
		int k=1;
		for(int i=0;i<row;i++) {
			for (int j = 0; j<col; j++) {
				if(j%2==0) {
					System.out.print(ch + " ");
					ch+=2;
				}
				else
					System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}
