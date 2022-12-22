class Counter{
	int count;

	public synchronized void increment(){
		count++;
	}
}

class demo implements Runnable{

	Counter c;
	demo(Counter c){
		this.c=c;
	}

	public void run(){
		for(int i=1;i<=1000;i++){
			c.increment();
			
		}
	}
}

class main {
	public static void main(String args[]) throws Exception{
		Counter c = new Counter();
		demo d = new demo(c);
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}