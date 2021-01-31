package thread;

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("Im runnning as new thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completion of my thread");
	}
}

public class SimmpleThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		 MyThread threadObj = new MyThread();
		 threadObj.start();
		 System.out.println("next line");
		 System.out.println("next line2");
		 System.out.println("Completion of main thread");
	}
}
