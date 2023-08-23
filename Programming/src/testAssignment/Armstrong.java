package testAssignment;

public class Armstrong {
	public static void main(String[] args) 
	{
		int num=153;
		int temp=num;
		int temp1=num;
		int count=0;
		double sum=0;
		
		while (num>0)
		{
            num=num/10;
			count++;
		}

		while (temp>0)
		{
			int res=1;
			int pow=count;
			int rem=temp%10;
			while (pow>0)
			{
				
				res=res*rem;
				pow--;
			}
			sum=sum+res;
			temp=temp/10;
		}
		if(sum==temp1)
		System.out.println(temp1+" is an armstrong number");
		else
		System.out.println(temp1+" is not an armstrong number");
	}
}
