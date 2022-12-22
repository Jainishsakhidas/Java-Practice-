import java.util.*;
class NotIndiaException extends Exception
{
	NotIndiaException(String msg)
	{
		super(msg);
	}
}

class main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		
		try
		{
			if(!(s.equalsIgnoreCase("India")))
			{
				throw new NotIndiaException("Entered String is Not India");
			}
			else
			{
				System.out.println("Entered String is India");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}