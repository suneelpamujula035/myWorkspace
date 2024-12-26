package multithreading;

public class Multithreading_04 implements Runnable{

	String name;
	
	Multithreading_04(String n)
	{
		this.name = n;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

		Multithreading_04 mt1 = new Multithreading_04("Thread1");
		Multithreading_04 mt2 = new Multithreading_04("Thread2");
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
		
		for (int i = 1; i < 10; i++) 
		{
			System.out.println("Main Thread:"+i);
		}
	}

}
