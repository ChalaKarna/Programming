package testAssignment;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(5,1));
	}
	public static int fact(int n,int fact) {
		if(n>0) {
			fact=fact*n;
			n--;
		}
		if(n==1) {
			return fact;
		}
		return fact(n,fact);
	}
}
