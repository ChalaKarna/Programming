package strings;

public class LowercaseToUppercase {
	public static void main(String[] args) {
		String s="nagamani_srinivasakumar";
		char []ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]-=32;
		}
		String s1=new String(ch);
		System.out.println(s1);
	}
}
