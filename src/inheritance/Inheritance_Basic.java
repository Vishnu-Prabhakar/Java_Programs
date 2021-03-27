package inheritance;

class Employee {
	float salary = 40000;
	void display(){
		System.out.println("Parent Method");
	}
}

class Programmer extends Employee {
	int bonus = 10000;
	void displayProgrammer(){
		System.out.println("programmer method");
	}
}

public class Inheritance_Basic {

	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		p.displayProgrammer();
		p.display();
		System.out.println("Bonus of Programmer is:" + p.bonus );
		System.out.println("Bonus of Programmer is:" +( p.bonus +p.salary) );
	}
	
	//Types of inheritance

}
