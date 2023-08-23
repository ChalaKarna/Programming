//To find the nth largest element from int [] (by reading inputs from user)

package arrays;				

public class NthLargestElement {

	public static void main(String[] args) {
		int[]a= {10,5,25,20,35,15,30};
		int n=2; //take input from user in RealTime


		for(n=1;n<a.length;n++) {//loop to find 1st,2nd,3rd,4th....nth largesr elements in single program
			for(int i=0;i<a.length;i++) {
				int count=0;

				for(int j=0;j<a.length;j++) {
					if(a[j]>a[i])
					{
						count++;
					}
				}

				if(count==n-1)
				{
					System.out.println(n+"th largest element ="+a[i]);
					break;
				}
			}
		}
	}
}

