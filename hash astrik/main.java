class Dollar extends Thread
{
	public void run()
	{
		for(int i=0;i<50;i=i+2)
		{
			try{
				Thread.sleep(500);
				System.out.print("$");
			}catch(Exception e){
				System.out.print(e);
			}
		}
	}
}

class Astric extends Thread
{
	public void run()
	{
		for(int i=0;i<50;i=i+2)
		{
			try{
				Thread.sleep(501);
				System.out.print("#");
			}catch(Exception e){
				System.out.print(e);
			}	
		}
	}
}



class main
{
	public static void main(String args[])
	{
		Dollar t1= new Dollar();
		Astric t2= new Astric();
		t1.start();
		t2.start();
	}
}