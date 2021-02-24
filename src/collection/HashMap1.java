package collection;

import java.util.HashMap;
import java.util.Map;

class HashMap1{  
	 public static void main(String args[]){  
	   HashMap<Integer,String> hm=new HashMap<>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(102,"Vijay");
	      hm.put(102, "Vijay2");
	      hm.put(107,"Rahul"); 
	      hm.put(10,"vishnu");
	      hm.put(10,"prabhakar");
	       
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	        
	      hm.putIfAbsent(102, "Gaurav");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Ravi");  
	      map.putAll(hm);  
	      System.out.println(map.keySet());
	      System.out.println(map.values());
	     
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());
	          }  
	      
	      
	      System.out.println(map.get(107));
	      
	 }  
	}  
