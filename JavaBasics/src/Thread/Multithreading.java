package Thread;

public class Multithreading {

	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo multi = new MultithreadingDemo();
			multi.start();
		}

		int n1 = 8; // Number of threads
		for (int i = 0; i < n1; i++) {
			Thread object = new Thread(new MultithreadingDemo());
			object.start();
		}
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

class MultithreadingDemo2 implements Runnable {
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