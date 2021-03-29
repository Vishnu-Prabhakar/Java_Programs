package interfaceExample;

interface Bank {
	String parentBankName = "RBI";
	int getRateOfInterest();
}

class SBI implements Bank {
	public int getRateOfInterest() {
		return 7;
	}
}

class PNB implements Bank {
	public int getRateOfInterest() {
		return 8;
	}
}

class TestBank {
	public static void main(String args[]) {
		Bank b = new SBI();
		System.out.println("Rate of Interest is sbi: " + b.getRateOfInterest() + " %");
		System.out.println(b.parentBankName);
		b= new PNB();
		System.out.println("Rate of Interest is Pnb: " + b.getRateOfInterest() + " %");
	}
}