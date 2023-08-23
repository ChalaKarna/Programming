package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SumationOfIntegers {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 integer numbers");
		//to read 10 integers from user
		for (int i = 1; i <=10; i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		System.out.println(al);
		
		int sum=0;
		for (int i = 0; i < al.size(); i++) {
			Integer i1=(Integer) al.get(i);
			sum=sum+i1;
		}
		System.out.println(sum);
	}
}
