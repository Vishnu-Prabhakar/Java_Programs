package interfaceExample;

interface Printable {
	void print();
}

class InterfaceExample implements Printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		obj.print();
	}
}