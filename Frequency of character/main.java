import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String=");
		String s1=sc.next();
		char c;
		System.out.println("Enter a character whose frequency is to be searched=");
		char x=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(c==x)
			{
				count++;
			}
			
		}
		System.out.println("Frequency of the character "+x+" is "+count);

	}
}