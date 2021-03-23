package accessModifiers;

class A1 {
	private A1() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
}

public class PrivateConstructor {
	public static void main(String args[]) {
		A1 obj = new A1();// Compile Time Error
	}
}