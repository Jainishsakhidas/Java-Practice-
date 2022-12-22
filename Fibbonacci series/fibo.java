import java.util.*;
class fibo
{
	public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in);
		int i,n;
		int f=1,s=1,t;
		System.out.println("Enter n to generate fibbonacci series till nth term:");
		n=sc.nextInt();
		System.out.println("Fibonacci series till nth term:");
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{	
				System.out.println(f);
			}
			else if(i==2)
			{
				System.out.println(s);
			}	
			else
			{		
				t=f+s;
				System.out.println(t);
				f=s;
				s=t;
			}
		}
	}
}