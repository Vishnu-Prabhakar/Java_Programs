package thread;

class TestJoinMethod4 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadNameAndCurrentExample {
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());
		TestJoinMethod4 t1 = new TestJoinMethod4();
		TestJoinMethod4 t2 = new TestJoinMethod4();
		//t1.setName("First Thread");
		t1.start();
		//t2.setName("MyThread");
		t2.start();
	}
}
