import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=sc.next();
		String p=reverse(s1);
		if(s1.equals(p))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not Pallindrome");	
		}
	}

	static String reverse(String s1)
	{
		char ch[]=s1.toCharArray();
		int i=0;
		int j=ch.length-1;
		char temp;
		while(i<j)
		{
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String p=new String(ch);
		return p;
	}
}