package inheritance;

class Animal_TestHierarchicalInheritance {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog_TestHierarchicalInheritance extends Animal_TestHierarchicalInheritance {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal_TestHierarchicalInheritance {
	void meow() {
		System.out.println("meowing...");
	}
}


class TestHierarchicalInheritance {
	public static void main(String args[]) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		//c.bark();//C.T.Error
	}
}
