package collection;

public class User {
	String firstName;
	String lastName;
	int phoneNumber;
	
	public void saveInformation(){
		
	}
	
	public void editInformation(){
		
	}
	
	public void cancelInformation(){
		
	}
	
	
	
//	@Override
//	public String toString() {
//		return "[firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
//	}

	public static void main(){
		User user1= new User();
		user1.firstName = "Vishnu";
		user1.lastName = "Ragupathy";
		user1.phoneNumber =1234567;
		
		User user2= new User();
		user2.firstName = "Swathi";
		
		System.out.println(user1);
		System.out.println(user2);
	}
	
	public static void main(String args[]){
		
	}
	
}


