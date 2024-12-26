package multithreading;

public class Multithreading_03 implements Runnable{

	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Hiii "+t);
	}
	public static void main(String[] args) {

		Multithreading_03 mt = new Multithreading_03();
		Thread t1 = new Thread(mt);
		t1.start();
		Thread t = Thread.currentThread();//First executes main thread
		System.out.println("Main thread - "+t);
	}

}
