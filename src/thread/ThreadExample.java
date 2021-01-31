package thread;

class Multi extends Thread {
	public void run() {
		System.out.println("thread is running...");
		long startime = System.currentTimeMillis();
		for(int i=1;i<=2;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
		long endtime = System.currentTimeMillis();
		System.out.println("My Thread ex time:"+ (endtime - startime));
	}
}
public class ThreadExample {
	public static void main(String args[]) {
		Multi t1 = new Multi();
		t1.setName("Vishnu's Thread");
		t1.start();
		System.out.println("Hi"+Thread.currentThread().getName());
		for(int i=1;i<=3;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
		Multi t2 = new Multi();
		t2.setName("MyThread Two");
		t2.start();
	}

}
