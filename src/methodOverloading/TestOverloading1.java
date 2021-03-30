package methodOverloading;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static float add(float a, float b){
		return a+b;
	}
}

class TestOverloading1 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		System.out.println(Adder.add(10.5f, 7.2f));
	}
}
