package methodOverloading;

public class ConstructorOverloading {
	
	public ConstructorOverloading(){
		System.out.println("Default constructor");
		
	}
	
	public ConstructorOverloading(int a, int b){
		System.out.println("constructor with 2 parameters of int");
	}
	
	public ConstructorOverloading(float a, float b){
		System.out.println("constructor with 2 parameters of float");
	}

	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading();
		ConstructorOverloading obj2 = new ConstructorOverloading(7,8);
		ConstructorOverloading obj3 = new ConstructorOverloading(7.5f, 7.3f);
	}
	
	public static void main(String s){
		System.out.println(s);
	}

}
