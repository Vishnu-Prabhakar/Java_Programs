package polymorphism;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class RoyalEnfield extends Bike{
	void run(){
		System.out.println("RE runnning");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("running safely with 60km");
		//super.run();
	}

	public static void main(String args[]) {
		Bike b = new Splendor();// upcasting
		b.run();
		
		Bike bikeObj = new Bike();
		bikeObj.run();
		
		Bike re = new RoyalEnfield();//upcasting
		re.run();
		
		//Splendor spObj = (Splendor) new Bike(); //downcasting
	}
}
