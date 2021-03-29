package interfaceExample;

interface Drawable1 {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
	
	static void colour(String colour){
		System.out.println("Colouring "+ colour);
	}
}

class Rectangle1 implements Drawable1 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawable1 d = new Rectangle1();
		d.draw();
		d.msg();
		Drawable1.colour("White");
	}
}