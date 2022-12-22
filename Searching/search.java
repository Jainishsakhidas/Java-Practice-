import java.util.*;
class main
{
	public static void main(String args[])
	{
		int n,i,j,x,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt(); 
		int[] a=new int[n];
		System.out.println("Enter Array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{	pos=i+1;
				break;
			}
			else
				pos=-1;
		}
		if(pos==-1)
		{
			System.out.println("Element not found");	
		}
		else
		{
			System.out.println("Element found at postion:"+pos);
		}

	}
}