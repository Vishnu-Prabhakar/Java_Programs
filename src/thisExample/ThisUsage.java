package thisExample;

class Student_ThisUsage {
	int rollno=10;
	String name, course;
	float fee;

	Student_ThisUsage(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student_ThisUsage(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class ThisUsage {
	public static void main(String args[]) {
		Student_ThisUsage s1 = new Student_ThisUsage(111, "ankit", "java");
		Student_ThisUsage s2 = new Student_ThisUsage(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}
