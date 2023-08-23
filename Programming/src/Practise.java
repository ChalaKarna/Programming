
public class Practise {

	public static void main(String[] args) {
		int n=50;
		int i=1;
		int j=n;
		for(n=50;n<=100;n++) {
			if(n%i==0&&n%j==0) {
				System.out.println(n);
			}
		}
	}

}
