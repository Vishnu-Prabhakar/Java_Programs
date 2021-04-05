package exceptionHandling;

public class TestThrow1 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not allowed to watch the movie");
		else
			System.out.println("welcome");
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}
}