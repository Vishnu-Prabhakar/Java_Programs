package thisExample;

class Student_ThisNotRequired {
	int rollno;
	String name;
	float fee;

	Student_ThisNotRequired(int r, String n, float f) {
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class ThisNotRequired {
	public static void main(String args[]) {
		Student_ThisNotRequired s1 = new Student_ThisNotRequired(111, "ankit", 5000f);
		Student_ThisNotRequired s2 = new Student_ThisNotRequired(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
