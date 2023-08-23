package testAssignment;

public class PrimeOrNot {
	public static void main(String[] args) {
		int sum=0;
		for(int n=1;n<=10;n++) {
			for(int i=2;i<=n;i++) {
				int count=0;
				if(n%i==0) {
					count++;
					break;
				}
			if(count==0 && n!=1) {
				sum=sum+n;
			}
			}
		}
		System.out.println(sum);
	}
}

