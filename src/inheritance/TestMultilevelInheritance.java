package inheritance;

class Animal_TestMultilevelInheritance {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog_TestMultilevelInheritance extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog_TestMultilevelInheritance {
	void weep() {
		System.out.println("weeping...");
	}
}

class TestMultilevelInheritance {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}
