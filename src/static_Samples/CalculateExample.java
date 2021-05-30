package static_Samples;

class Calculate {
	static int cube(int x) {
		return x * x * x;
	}
	
	static int age= 17;
}

class CalculateExample{
	public static void main(String args[]) {
		Calculate calObj = new Calculate();
		System.out.println(calObj.cube(3));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.age);
	}
}
