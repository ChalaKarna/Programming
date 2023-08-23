package testAssignment;

public class PalindromeNum {
	public static void main(String[] args) {
		int n=1221;
		int temp=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome number");
			int count=0;
			while(temp>0) {
				temp=temp/10;
				count++;			
			}
			System.out.println(count);
		}
		else {
			if(temp%2==0)
				System.out.println("Not a palindrome and divisible by 2");
			else
				System.out.println("Not a palindrome and not divisible by 2");
		}
	}
}
