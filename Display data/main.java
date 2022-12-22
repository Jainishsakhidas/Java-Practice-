class DisplayData
{
	static void display(String x)
	{
		System.out.println(x);
	}
	static void display(int x)
	{
		System.out.println(x);
	}
	static void display(Float x)
	{
		System.out.println(x);
	}
}
class main
{
	public static void main(String args[])
	{
	System.out.println("String:");
	DisplayData.display("Hello");
	System.out.println("Integer:");
	DisplayData.display(5);
	System.out.println("Float:");
	DisplayData.display(2.0f);
	}
}