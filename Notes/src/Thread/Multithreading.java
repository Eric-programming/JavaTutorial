package Thread;

public class Multithreading {

	public static void main(String[] args) {
		Thread t1 = new MultithreadingDemo();
		t1.start();
	
		Thread t2 = new Thread(new MultithreadingDemo());
		t2.start();

	}

}

class MultithreadingDemo extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
