import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String=");
		String s1=sc.next();
		boolean x,y;
		char c;
		int alphabets=0,digits=0,special=0;
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			x=Character.isLetter(c);
			y=Character.isDigit(c);
			if(x)
			{
				alphabets++;
			}
			if(y)
			{
				digits++;
			}
			if(!x && !y)
			{
				special++;
			}
		}
		System.out.println("Alphabets="+alphabets+"\nDigits="+digits+"\nSpecial Characters="+special);

	}
}