package arrays;

public class NthSmallestElement {

	public static void main(String[] args) {

		int[]a= {0,10,5,25,20,35,15,30};
		int n=2; //take input from user in RealTime
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i])
				{
					count++;
				}
			}

			if(count==n-1)
			{
				System.out.println(n+"th smallest element ="+a[i]);
			}
		}
	}
}


