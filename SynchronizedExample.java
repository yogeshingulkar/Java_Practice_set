class SynchronizedExample
{
	public static void main(String [] args)
	{
		IterationPrint obj = new IterationPrint();
		
		MyThread t1 = new MyThread(obj,"Ramesh");
		t1.start();
		
		MyThread t2 = new MyThread(obj,"Suresh");
		t2.start();
		
		obj.m1("main");
	}
}

class MyThread extends Thread
{
	IterationPrint obj;
	String threadName;
		
	MyThread(IterationPrint obj, String threadName)
	{
		this.obj = obj;
		this.threadName = threadName;
	}
		
	@Override
	public void run()
	{
		obj.m1(threadName);
	}
}

class IterationPrint
{
	public void m1(String threadName)
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.println(threadName + " : " + i);
		}
	}
}
