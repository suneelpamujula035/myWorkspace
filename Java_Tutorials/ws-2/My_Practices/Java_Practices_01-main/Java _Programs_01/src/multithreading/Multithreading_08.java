package multithreading;

public class Multithreading_08 implements Runnable{

	public void run()
	{
		System.out.println("Welcome to DEAMO Thread");
	}
	public static void main(String[] args) {

		Multithreading_08 mt = new Multithreading_08();
		Thread t = new Thread(mt);
		//t.setDaemon(true);
		Thread.currentThread().setDaemon(true);//We can not create DEamo thread for main thread
		t.start();
		System.out.println(t.isDaemon());
		
		//We can create Deamo threads for user threads before thread starts.
	}

}
