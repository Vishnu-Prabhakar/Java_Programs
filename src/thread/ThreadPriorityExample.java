package thread;

class TestMultiPriority1 extends Thread {
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
	}
}

public class ThreadPriorityExample {

	public static void main(String args[]) {
		TestMultiPriority1 m1 = new TestMultiPriority1();
		TestMultiPriority1 m2 = new TestMultiPriority1();
		m1.setName("m1");
		// MIN_MIN_PRIORITY : 1
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setName("m2");
		// NORM_PRIORITY : 5
		m2.setPriority(Thread.NORM_PRIORITY);
		m1.start();
		m2.start();

	}

}
