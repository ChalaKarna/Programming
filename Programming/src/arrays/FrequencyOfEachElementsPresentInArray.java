package arrays;

public class FrequencyOfEachElementsPresentInArray {

	public static void main(String[] args) {
		int[]a= {10,10,20,30,35,20,35,45,40,40};
		boolean[] b=new boolean[a.length];

		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[i]=true;
					}
				}
				System.out.println(a[i]+"==>"+count);
			}
		}
	}
}
