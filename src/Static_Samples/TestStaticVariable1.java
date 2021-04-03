package Static_Samples;

class Student {
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	// constructor
	Student(int r, String n) {
		rollno = r;
		name = n;
	}
	// static method to change the value of static variable
	void change() {
		college = "BBDIT";
	}
	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
	static void test() {
		System.out.println("test method");
	}
}

// Test class to show the values of objects
class TestStaticVariable1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		s1.display();
		s2.display();
		
		System.out.println(Student.college);
		Student.test();
	}
}
