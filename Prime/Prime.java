import java.util.*;
class prime
{
	public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j=1;
		System.out.println("Enter a number to check if it is a prime numberor not :");
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				j=0;		
				break;
			}
			
		}
		if(j==0)
			System.out.println(n+" is not prime");	
		else
			System.out.println(n+" is  prime");
	}
}