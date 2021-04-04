package stringbuilderandbuffer;

class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println(sb);
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		
		sb.insert(6,"Besant ");//now original string is changed  
		System.out.println(sb);//prints HJavaello 
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer();  
		System.out.println(sb1.capacity());
	}
}
