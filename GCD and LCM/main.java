import java.util.*;
class main
{
	public static void main(String args[])
	{
		int m,n,i,g=0,l,max;
		System.out.println("Enter two integer values:");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		if((m==0 && n==0) || (m<0 || n<0))
		{
			System.out.println("Invalid Input");
		}
		else
		{
			max=m>n?m:n;
			for(i=1;i<=max;i++)
			{
				if(m%i==0 && n%i==0)
				{
					g=i;
				}
			}
			l=(m*n)/g;
			System.out.println("GCD:"+g+"\tLCM:"+l);
		}
	}
}