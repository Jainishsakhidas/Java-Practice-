import java.util.*;
class main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String=");
		String s1=sc.next();
		s1=s1.toLowerCase();
		char c;
		int vowels=0,consonants=0;
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}	
		}
		System.out.println("Vowels:"+vowels+"\nConsonants:"+consonants);

	}
}