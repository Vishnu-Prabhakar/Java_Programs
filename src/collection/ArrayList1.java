package collection;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Employee{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}

class ArrayList1 {
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<>();// Creating arraylist
		
		Integer i = 17;//int
		Float f = 10.6f; //float
		Double d = 8.88;//double
		Long l = 1223453l;//long
		Byte b= 12;//byte
		Short s;//short
		ArrayList<Integer> integerLst = new ArrayList<>();
		
		integerLst.add(1);
		integerLst.add(2);
		integerLst.add(4);
		integerLst.add(4);
		integerLst.add(4);
		integerLst.add(4);
		integerLst.add(null);
	
		
		//integerLst.remove(4);
		System.out.println(integerLst);
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(null);
		// Invoking arraylist object
		System.out.println(list);
		
		
		 Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  
		 ListIterator itr1 =list.listIterator();
		 while(itr1.hasNext()){  
			   System.out.println(itr1.next());  
			  } 
		 
		
		  System.out.println("for each loop");
		  
		  
		for(Integer inte:integerLst){
			System.out.println(inte);
		}
		
		int a[]= new int[5];
		ArrayList<Employee> employeeList= new ArrayList<>();
		Employee empObj1 = new Employee();
		empObj1.setAge(17);
		empObj1.setName("Vishnu");
		
		Employee empObj2 = new Employee();
		empObj2.setAge(19);
		empObj2.setName("Prabhakar");
		
		employeeList.add(empObj1);
		employeeList.add(empObj2);
		
		ArrayList<Employee> empList2 = new ArrayList<>();
		empList2.addAll(employeeList);
		empList2.add(2, empObj2);
	
		
		System.out.println(empList2);
		
		System.out.println(employeeList.isEmpty());
		System.out.println(employeeList.size());
		employeeList.clear();
		System.out.println(employeeList);
		
		
	}
}
