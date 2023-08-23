package strings;

public class CharArrToString {

	public static void main(String[] args) {
		/*Using Constructor of String
		char[]ch= {'d','e','e','k','s','h','a'};
		String s=new String(ch);
		System.out.println(s);*/
		
		
		//without using built in constructor
		
		char[]ch= {'d','e','e','k','s','h','a'};
		String s="";
		for(int i=0;i<ch.length;i++) {
			s=s+ch[i];
		}
		System.out.println(s);
	}
}
