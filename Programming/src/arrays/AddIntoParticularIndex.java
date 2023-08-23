package arrays;

public class AddIntoParticularIndex {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,15};
		int[]b=new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			//System.out.println(b[i]);
			}
			for(int j=0;j<b.length;j++) {
				b[0]=0;
				b[j]=a[j+1];
				System.out.println(b[j]);}
	}
}
