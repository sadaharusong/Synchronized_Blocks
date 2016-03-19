package sadaharu.example;

import java.util.concurrent.TimeUnit;

public class SynchronizedTest 
{
	Thread t1 = new Thread(new Runnable()
	{
		
		@Override
		public void run()
		{
			// TODO Auto-generated method stub
			MyClass.log1("msg11", "msg12");
		}
	});
	
	Thread t2 = new Thread(new Runnable()
	{
		
		@Override
		public void run()
		{
			// TODO Auto-generated method stub
			MyClass.log2("msg21", "msg22");
		}
	});
	
	Thread t3 = new Thread(new Runnable()
	{
		
		@Override
		public void run()
		{
			// TODO Auto-generated method stub
			MyClass.log3("msg31", "msg32");
		}
	});
	
	Thread t4 = new Thread(new Runnable()
	{
		
		@Override
		public void run()
		{
			// TODO Auto-generated method stub
			MyClass.log4("msg41", "msg42");
		}
	});
	
	Thread t5 = new Thread(new Runnable()
	{
		
		@Override
		public void run()
		{
			// TODO Auto-generated method stub
		  new MyClass().log5("msg51", "msg52");
		}
	});
	
	public static void main(String agrs[])
	{
		SynchronizedTest test = new SynchronizedTest();
		
		test.t1.start();
		test.t2.start();
		test.t3.start();
		test.t4.start();
		test.t5.start();
		
		int i = 0;
		while (true)
		{
			try
			{
				TimeUnit.SECONDS.sleep(1);
				System.out.println("------------>" + i);
				i++;
				
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (i > 10)
			{
				break;
			}
		}
	}
}
