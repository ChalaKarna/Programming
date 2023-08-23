package strings;
//3)To print Unrepeated/Unique characters in a string
public class UniqueCharacters {

	public static void main(String[] args) {
		String s="aaabbcdeefg";
		char[]ch=s.toCharArray();
		boolean []b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count==1)
					System.out.println(ch[i]);
			}
		}

	}
}
