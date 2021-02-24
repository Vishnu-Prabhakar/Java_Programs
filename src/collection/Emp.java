package collection;

import java.util.concurrent.SynchronousQueue;

public class Emp {
	
	private int id;  
	private String name,password,email,country;  
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public static void main(String[] args) {
		Emp obj = new Emp();
//		obj.id = 17;
//		obj.name = "Vishnu";
//		obj.email ="sdfhsdkj@gmail.com";
		obj.setId(17);
		obj.setName("vishnu");
		obj.setEmail("sdfsdf@gmail.com");
		System.out.println(obj.getId());
	}

}
