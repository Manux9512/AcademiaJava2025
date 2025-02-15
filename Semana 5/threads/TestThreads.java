package threads;

class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
		System.out.println(count);
	}

	public int getCount() {
		return count;
	}
}

class MyThread extends Thread {
	private Counter counter;  //HAS-A

	public MyThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+" Count: "+ i);
			counter.increment();
		}
	}

}

public class TestThreads {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread t1 = new MyThread(counter); 
		Thread t2 = new MyThread(counter);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}

}