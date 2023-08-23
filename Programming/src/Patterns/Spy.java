package Patterns;

public class Spy {
	public static void main(String[] args) {
		System.out.println("Spy numbers from 1 to 10000");
		for (int i = 1; i < 10000; i++) {
			int num=i;
			int sum=0;
			int pro=1;
			while (num>0) {
				int rem=num%10;
				sum=sum+rem;
				pro=pro*rem;
				num=num/10;
			}
			if (sum==pro) {
				System.out.println(i);
			}
		}
	}

}
