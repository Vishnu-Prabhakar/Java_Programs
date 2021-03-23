package accessModifiers;

class A {
	private int data = 40;

	private void msg() {
		System.out.println("Hello java");
	}
	
	protected void msg1(){System.out.println("Hello");}  
}

public class PrivateSimple {
	private static int num=10;
	public static void main(String args[]) {
		System.out.println(num);
		A obj = new A();
		System.out.println(obj.data);// Compile Time Error
		obj.msg();// Compile Time Error
	}
}
