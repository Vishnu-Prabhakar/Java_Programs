package methodOverloading;

class Adder2 {
	 double add(int a, double b) {
		return a + b;
	}

	 double add(double a, int b) {
		return a + b;
	}
	

}

class TestOverloading3 {
	public static void main(String[] args) {
		Adder2 obj = new Adder2();
		System.out.println(obj.add(11, 11));
		// ambiguity
	}
}


