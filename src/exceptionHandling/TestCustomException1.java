package exceptionHandling;

class TestCustomException1 {
	static void validate(int age) throws InvalidAgeException  {
		if (age < 18)
			throw new InvalidAgeException("not valid age: you are not allowed to vote");
		else{
			System.out.println("welcome to vote");
			
		}
	}
	public static void main(String args[]) throws InvalidAgeException {
//		try {
			validatePerMethod(13);
//		} catch (Exception m) {
//			System.out.println("Exception occured: " + m);
//		}

		System.out.println("rest of the code...");
	}
	private static void validatePerMethod(int i) throws InvalidAgeException {
		validate(i);
		
	}
}
