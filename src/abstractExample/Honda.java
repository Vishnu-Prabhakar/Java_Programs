package abstractExample;

abstract class Bike {
	abstract void run();
	void testBike(){
		System.out.println("ji");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.testBike();
	}
}
