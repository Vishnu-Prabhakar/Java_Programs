package recursion;

public class Factorial {
	static int fact(int n) {
		if (n == 1)
			return 1;
		else
			return (n * fact(n - 1));
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is: " + fact(5));
	}
}


//factorial(5) 
//factorial(4) 
//   factorial(3) 
//      factorial(2) 
//         factorial(1) 
//            return 1 
//         return 2*1 = 2 
//      return 3*2 = 6 
//   return 4*6 = 24 
//return 5*24 = 120
