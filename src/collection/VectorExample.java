package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> test = new Vector<>();
		test.addElement("one");
		test.add("two");
		test.add("two");
		test.add("null");
		Iterator it = test.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(String str: test){
			System.out.println(str);
		}
	}

}
