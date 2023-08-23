package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="Malayalam";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		System.out.println("Given strong is Palindrome");
		else
			System.out.println("Given strong is not Palindrome");
	}

}
