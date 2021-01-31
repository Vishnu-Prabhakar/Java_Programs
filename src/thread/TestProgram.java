package thread;

public class TestProgram {

	public static void main(String[] args) {
		int i=1;
		method1(i);
		method1(100);
		System.out.println(Thread.currentThread().getName());
	}

	private static void method1(int i) {
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(++i);
	}

}
