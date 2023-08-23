//To print elements present in EVEN INDEX of an array
package arrays;

public class PrintEvenIndexElements {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				System.out.println(a[i]);
		}
	}
}
