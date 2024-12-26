package multithreading;

public class Multithreading_06 implements Runnable {

	int count;
	
	public synchronized void run()//one object access only one thread at a time with Synchronized
	{
		for(int i=1; i<=10000; i++)
		{
			count++;
		}
	}
	public static void main(String[] args) throws InterruptedException {

		Multithreading_06 mt = new Multithreading_06();
			Thread t1 = new Thread(mt);
		    Thread t2 = new Thread(mt);
		    Thread t3 = new Thread(mt);
		    
		    System.out.println(t1.isAlive());//Thread not started
		    t1.start();
		    System.out.println(t1.isAlive());//Thread started
		    t2.start();
		    System.out.println(t2.isAlive());//Thread started
		    
		    t1.join();
		    System.out.println(t2.isAlive());//Thread started

		    t2.join();//After join method  thread go to dead state
		    System.out.println(t2.isAlive());//Thread dead

		    
		    System.out.println(mt.count);
		    System.out.println(t2.isAlive());//Thread is in dead state
		    t3.start();

	}

}

