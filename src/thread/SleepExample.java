package thread;
class TestSleepMethod1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								System.out.println("I have been interrupted by someone.");
							}
			
			System.out.println(i + " "+ Thread.currentThread().getName());
		}
	}
}
public class SleepExample {
	public static void main(String args[]) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		TestSleepMethod1 t3 = new TestSleepMethod1();
		t1.setName("Example Thread for sleep1");
		t1.start();
		
		t2.setName("Example Thread for sleep2");
		t2.start();
		
		t3.setName("Example Thread for sleep3");
		t3.start();
		
	}

}
