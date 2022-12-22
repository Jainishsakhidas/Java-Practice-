import java.util.*;
class prime
{
	public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in);
		int n,n1,n2,i,j;
		System.out.println("Enter n1");
		n1=sc.nextInt();
		System.out.println("Enter n2");
		n2=sc.nextInt();
		System.out.println("Prime nos from range n1 to n2 are:");
		for(n=n1;n<=n2;n++)
		{
			if(n==1)
				continue;
			if(n==2)
			{
				System.out.println(n);	
				continue;
			}
			j=1;
			for(i=2;i<n;i++)	
			{
				
				if(n%i==0)
				{	
					j=0;
					break;		
				}
			
			}
			if(j==1)
				System.out.println(n);
		}
		
	}
}