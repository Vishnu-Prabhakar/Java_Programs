package static_Samples;

class StaticBlock {
	static {
		System.out.println("static block is invoked");
	}
	
	{
		System.out.println("Instance block");
	}
	
	StaticBlock(){
		System.out.println("Constructor");
	}

	public static void main(String args[]) {
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		System.out.println("Hello main");
	}
}
