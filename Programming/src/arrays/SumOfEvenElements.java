//To find Sum of Even Elements present in an array
package arrays;

public class SumOfEvenElements {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of Even elements present="+sum);
	}
}
