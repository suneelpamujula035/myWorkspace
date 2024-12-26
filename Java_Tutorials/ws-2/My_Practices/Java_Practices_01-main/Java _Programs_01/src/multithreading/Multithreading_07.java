package multithreading;

public class Multithreading_07 implements Runnable {

	int count;
	
	public synchronized void run()//one object access only one thread at a time with Synchronized
	{
		for(int i=1; i<=10000; i++)
		{
			count++;
		}
	}
	public static void main(String[] args) throws InterruptedException {

		Multithreading_07 mt = new Multithreading_07();
			Thread t1 = new Thread(mt);
		    Thread t2 = new Thread(mt);
		    
		    t1.start();
		    t2.start();
		    
		    //t1.setPriority(Thread.MAX_PRIORITY);
		    //t2.setPriority(Thread.MIN_PRIORITY);
		    
		    t1.setPriority(1);
		    t2.setPriority(10);
		    
		    t1.setName("My Thread 1");
		    t2.setName("My Thread 2");

		    System.out.println(t1.getName());
		    System.out.println(t2.getName());
		    
		    System.out.println(t1.getPriority());
		    System.out.println(t2.getPriority());
		    
		    t1.join();
		    t2.join();
		    
		    System.out.println(mt.count);

	}

}

