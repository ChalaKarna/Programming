package strings;

public class Pattern {
	public static void main(String[] args) {
		String s="BANGALORE*";
		int n=4;
		int k=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<n;i++) {
		
			for(int j=0;j<n;j++) {
				if(i>=j)
				System.out.print(ch[k++]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


