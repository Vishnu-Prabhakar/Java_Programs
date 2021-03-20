package thisExample;

class Student7 {
	int rollno;
	String name;
	float fee;

	Student7(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class ThisProgram {
	public static void main(String args[]) {
		Student7 s1 = new Student7(111, "ankit", 5000f);
		Student7 s2 = new Student7(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
