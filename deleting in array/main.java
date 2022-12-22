import java.util.*;
class main
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int i,j,t;
		System.out.println("Enter the array:");
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the element you want to delete:");
		int x=sc.nextInt();
		int pos=-1;
		for(i=0;i<n;i++)
		{	
			if(a[i]==x)
			{
				pos=i;
			}
		}
		if(pos!=-1)
		{	
		for(i=pos;i<n;i++)
		{
			if(i+1>=n)
			{
				a[i]=-1;
				break;
			}	
			a[i]=a[i+1];
		}
		for(i=0;i<n;i++)
		{	
			if(a[i]==-1)
				continue;
			System.out.println(a[i]);
		}
		}
		else{
			System.out.println("Element Not Found");
		}		
	}
}



