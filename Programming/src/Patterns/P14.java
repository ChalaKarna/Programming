/*
A C E G 
I K M O 
Q S U W 

*/

package Patterns;

public class P14 {

	public static void main(String[] args) {
		int row=3;
		int col=4;
		char ch='A';
		for(int i=0;i<row;i++) {
			for (int j = 0; j<col; j++) {
				System.out.print(ch + " ");
				ch+=2;
			}
			System.out.println();
		}
	}
}
