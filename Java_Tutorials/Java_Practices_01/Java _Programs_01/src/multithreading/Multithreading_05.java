package multithreading;

public class Multithreading_05 implements Runnable {

    String name;
	
	Multithreading_05(String n)
	{
		this.name = n;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(name+" : "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {

		Multithreading_05 mt1 = new Multithreading_05("Thread1");
		Multithreading_05 mt2 = new Multithreading_05("Thread2");
		Multithreading_05 mt3 = new Multithreading_05("Thread3");
		
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t2.start();
		t2.join();//Depending on the sequence of joins we mentioned
		t1.start();
		t1.join();
		Thread t3 = new Thread(mt3);
		t3.start();
		
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Main Thread:"+i);
		}
	}

}
//Java thread join method can be used to pass the current thread until unless specified thread is dead.
