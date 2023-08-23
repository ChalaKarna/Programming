package arrays;

public class MergeInZigzagManner {

	public static void main(String[] args) {
		int[]a= {10,30,50,70,90};
		int[]b= {20,40,60,80};
		int res[]=new int[a.length+b.length];
		int i=0;//Hold the index of a and b array
		int j=0;//Hold the index of res array
		//To add a&b elements into res arr till a&b having same index
		while(j<a.length&&j<b.length) {
			res[i]=a[j];
			i++;

			res[i]=b[j];
			i++;
			j++;
		}
		//To add extra elements(if any,from arr a)
		while(j<a.length)
		{
			res[i]=a[j];
			i++;
			j++;
		}
		//To add extra elements(if any,from arr b)
		while(j<b.length)
		{
			res[i]=b[j];
			i++;
			j++;
		}
		for(int k=0;k<res.length;k++) {
			System.out.println(res[k]);
		}
	}
}


/*	public static void main(String[] args) {
		int[]a= {10,30,50,70,90};
		int[]b= {20,40,60,80};
		int res[]=new int[a.length+b.length];
        int j=0; 
        int k=0;
for(int i=0;i<res.length;i++) {
	if(i%2==0) 
		res[i]=a[j++];
	else
		res[i]=b[k++];
				for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
}*/

