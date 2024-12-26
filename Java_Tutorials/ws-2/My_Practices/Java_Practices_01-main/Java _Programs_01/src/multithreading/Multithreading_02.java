package multithreading;

public class Multithreading_02 implements Runnable{

	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {

		Multithreading_02 mt = new Multithreading_02();
		 Thread t = new Thread(mt);
		 t.start();
	}

}
