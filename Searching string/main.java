import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		String s[]=new String[n];
		int pos=-1;
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter String:");
			s[i]=sc.next();
		}
		System.out.println("Enter the String to be searched:");
		String s1=sc.next();
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(s1))
			{
				pos=i+1;
				break;
			}
			else
			{
				pos=-1;
				System.out.println("String not found");
			}
		}
		if(pos!=-1)
		{
			System.out.println("String found at index "+pos);
		}

	}
}