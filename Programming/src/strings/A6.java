package strings;

public class A6 {
	public static void main(String[] args) {
		char ch ='A';
		int row=9;
		int col=4;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				System.out.print(ch++ +" ");
				ch+=1;
			}
			System.out.println();
		}
	}
}
