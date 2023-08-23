package basics;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter physics marks");
		int p=s.nextInt();
		
		System.out.println("Enter chemistry marks");
		int c=s.nextInt();
		
		System.out.println("Enter biology marks");
		int b=s.nextInt();
		
		System.out.println("Enter mathematics marks");
		int m=s.nextInt();
		if (p>=35 && c>=35 && b>=35 && m>=35  ) {
			double per=(p+c+m+b)/4;
			
			if (per>85)
				System.out.println("Distiction");
			else if(per>=75)
			System.out.println();
			else if(per>=60)
				System.out.println("First class");
			else
				System.out.println("Just pass");
			}
		else 
System.out.println("Failed");	
	}
}
//WAJP to read 3 integer value and print the mid value
