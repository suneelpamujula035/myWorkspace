package multi_threading;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	}	
}
public class Thread_Demo_02 {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
