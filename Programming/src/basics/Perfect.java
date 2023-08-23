package basics;

public class Perfect {

	public static void main(String[] args) {
		System.out.println(perfect(6,1));
	}
	public static  boolean perfect(int n,int i) {
		int sum=0;
		while(i<=n/2) {
			if(n%i==0) {
			sum=sum+i;
			}
			i++;
		}
		
		if(n==sum)
			return true;
		else 
			return false;
	}

}
