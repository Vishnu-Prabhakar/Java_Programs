package exceptionHandling;

class TestFinallyBlock {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} 
			catch (ArithmeticException e) {
			System.out.println("Caught exp"+e);
		} 
		finally {
			System.out.println("finally block is always executed");
		}
		
//		try{
//			
//		}finally{
//			System.out.println("Second finally");
//		}
		
		System.out.println("rest of the code...");
	}
}
