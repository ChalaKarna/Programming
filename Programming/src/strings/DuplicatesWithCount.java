package strings;
//4)To print Duplicate characters in a string with count
public class DuplicatesWithCount {
	public static void main(String[] args) {
		String s="aaabbcdeefg";
		char[]ch=s.toCharArray();
		boolean []b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(b[i]==false) {
				int count=0;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count>=1)
					System.out.println(ch[i]+"==>"+count);
			}
		}
	}
}
