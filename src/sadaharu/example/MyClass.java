package sadaharu.example;

import java.util.concurrent.TimeUnit;


public class MyClass
{
	public static synchronized void log1(String msg1 , String msg2)
	{
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(msg1);
	System.out.println(msg2);
	}
	
	public static void log2(String msg1 , String msg2)
	{
		synchronized (MyClass.class)
		{
			try
			{
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg1);
			System.out.println(msg2);
		}
	}
	
	public static synchronized void log3(String msg1 , String msg2)
	{
		System.out.println(msg1);
		System.out.println(msg2);
	}
	
	public static void log4(String msg1 , String msg2)
	{
		synchronized (MyClass.class)
		{
			
			System.out.println(msg1);
			System.out.println(msg2);
		}
	}
	
	public void log5(String msg1 , String msg2)
	{
		synchronized (this)
		{
			
			System.out.println(msg1);
			System.out.println(msg2);
		}
	}
}
