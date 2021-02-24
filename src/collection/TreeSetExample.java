package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		 TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.iterator();
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
         
        
         TreeSet<Integer> intSet=new TreeSet<Integer>();  
         intSet.add(24);  
         intSet.add(66);  
         intSet.add(12);  
         intSet.add(15);  
         System.out.println(intSet);
         System.out.println("Lowest Value: "+intSet.pollFirst());  
         System.out.println("Highest Value: "+intSet.pollLast());  

	}

}
