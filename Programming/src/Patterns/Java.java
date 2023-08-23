package Patterns;

import java.io.PrintStream;

public class Java {
	

	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ ) {
				
				if(i==0||j==n/2||i==n-1&&j<n/2) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )

				if(j==0|| i==0||i<=n && j==n-1|| i==n/2)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.print("  ");
			int i = 0;
			for(int j=0;j<n;j++)
			{
				
				if(j==0&&i<=n/2 || j==n-1&&i<=n/2||i==3&&j==1||i==3&&j==3||i==4&&j==2)
					System.out.print("* ");
				else
					System.out.print("  ");	
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
			
				if(j==0 || i==0||i<=n && j==n-1|| i==n/2)
				System.out.print("* ");
	
				System.out.print("  ");
			}
			System.out.println();
		}
	}

