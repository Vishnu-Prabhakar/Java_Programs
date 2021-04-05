package exceptionHandling;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			//int data = 100 / 0;
//			String s=null;  
//			System.out.println(s.charAt(1));//NullPointerException 
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException  
		}
		catch(ArithmeticException expObj){
			System.out.println("Error occured");
			expObj.printStackTrace();
		}
		catch(NullPointerException nullObj){
			System.out.println(nullObj);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : Exception occured in my program, sorry for the incovn.. caused to you");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception occured in my program, sorry for the incovn.. caused to you");
			//e.printStackTrace();
			System.out.println(e);
		}
//			finally{
//				System.out.println("Hey.. im the end");
//			}
		
		// rest code of the program
		
	}
}
