package multithreading;

public class Multithreading_01 extends Thread {

	public void run()
	{
		System.out.println("run method is executed by JVM");
	}
	public static void main(String[] args) {

		Multithreading_01 mt = new Multithreading_01();
		mt.start();
	}

}
//Life cycle of Thread:
//1.New - The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
//2.Runnable - The thread is in runnable state after invocation of start() method, but thread scheduler has not selected it to be the running thread.
//3.Running - The thread is in running state if the thread scheduler has selected it.
//4.Blocked(Non-Runnable) - This is the state when the thread is still live, but currently not eligible to run.
//5.Terminated - A thread is in terminated or dead state when its run() method exists.

//Achieving Multithreading in java:
//1) In java language multithreading can be achieve in two different ways
//---->Using thread class
//---->Using Runnable interface

//Using Thread class (extending Thread class):
//--------------------------------------------
//1)Create any user defined class and make that one as a derived class of thread class.
//2)Override run() method of thread class.
//3)Create an object for user defined thread class and attached that object to predefined thread class objects.
//4)Call start() method of thread class to execute run() method.
