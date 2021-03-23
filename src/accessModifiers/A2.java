package accessModifiers;

import defaultAccessModifierExample.DefaultExampleClass;

public class A2 {
	
	protected void msg() {
		System.out.println("Hello");
		DefaultExampleClass obj = new DefaultExampleClass();
		obj.display();
	}

	

}
