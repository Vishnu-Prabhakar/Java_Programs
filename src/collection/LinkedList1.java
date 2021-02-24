package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1{  
	 public static void main(String args[]){  
	  
	  LinkedList<String> sdgrtr=new LinkedList<>();  
	  sdgrtr.add("Ravi");  
	  sdgrtr.add("Vijay");  
	  sdgrtr.add("Ravi");  
	  sdgrtr.add("Ajay"); 
	  
	  sdgrtr.addFirst("Besant");
	  sdgrtr.addLast("chennai");
	  
	  //sdgrtr.removeFirst();
	  
	  Iterator<String> iterator=sdgrtr.iterator();  
	  while(iterator.hasNext()){  
	   System.out.println(iterator.next());  
	  }
	  
	  System.out.println(sdgrtr.isEmpty());
		System.out.println(sdgrtr.size());
		sdgrtr.clear();
		System.out.println(sdgrtr);
	 }  
	}  