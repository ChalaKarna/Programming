package strings;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String s="Deeksha@9697";
		char[]ch=s.toCharArray();
		int vowel=0;
		int consonant=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z') {
				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					vowel++;
				}
				else {
					consonant++;
					
				}
			}
		}
		System.out.println("Vowels :"+vowel);
		System.out.println("Consonants :"+consonant);
	}

}
