package strings;

public class PasswordValidation {

	public static void main(String[] args) {
		String s="Deeksha@0906";
		char[]ch=s.toCharArray();
		int up=0; int low=0; int space=0;
		int spCh=0; int digit=0;
		if(s.length()>=8 && s.length()<=15) {
			for(int i=0;i<ch.length;i++) {
				char c=ch[i];
				if(c>='A' && c<='Z')
					up++;
				else if(c>='a' && c<='z')
					low++;
				else if(c>='0' && c<='9')
					digit++;
				else if(c==' ')
					space++;
				else if(c=='$' || c=='#' || c=='@' || c=='!')
					spCh++;
			}
			if(up>=1 && low>=1 && digit>=1 && space==0 && spCh>=1) {
				System.out.println("Correct password");
			}
			else {
				System.out.println("Incorrect Password");
			}
		}
		else 
		{
			System.out.println("Incorrect password");
			System.out.println("it should contain 8 to 15 characters");
		}
	}

}
