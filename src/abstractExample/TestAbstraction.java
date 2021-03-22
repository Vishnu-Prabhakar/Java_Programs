package abstractExample;

abstract class TwoWheeler {
	TwoWheeler() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

// Creating a Child class which inherits Abstract class
class TVS extends TwoWheeler {
	void run() {
		System.out.println("running safely..");
	}
}

// Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction {
	public static void main(String args[]) {
		TwoWheeler obj = new TVS();
		obj.run();
		obj.changeGear();
	}
}
