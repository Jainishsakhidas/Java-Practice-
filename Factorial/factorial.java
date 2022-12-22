import java.util.*;
class fact 

{ 

     public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,fact=1;
		System.out.println("Enter a number to find factorial:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}	
		System.out.println("The factorial of n is "+fact);	

	}
} 