package stringExample;

public class Basic_String {

	public static void main(String args[]) {

		char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
		//System.out.println(ch);

		String s = "Sachin";
		String s1 = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable
								// objects
		System.out.println(s.concat(" Tendulkar"));
		
		System.out.println("Fourth output:" + s);

		String s2 = "Sachin";
		String s3="Ratan";  
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		  
		
		String s4="Sachin"+" Tendulkar";  
		System.out.println(s4);
		
		String s5="hello"; 

		
		try{
			System.out.println(s5.substring(1));
		}
			catch(StringIndexOutOfBoundsException e){
			System.out.println("Catched exception "+e);
		}
		finally{
		System.out.println("finally block");
		}
		System.out.println("after----");
		
		String test= null;
		try{
		System.out.println(test.length());
		}catch(NullPointerException e){
			System.out.println("catched exception:"+e);
		}
		System.out.println("end");
//		
//		
//		
//		
//		try{
//		System.out.println("SUBsTRING :"+s5.substring(0,2));
//		}catch(Exception e){
//			System.out.println("Catched exception "+e);
//		}finally{
//			System.out.println("finally block");
//			}
//		
		System.out.println(s5.toUpperCase());//SACHIN  
		System.out.println(s5.toLowerCase());
//		
//		
//		System.out.println(s5.length());
//		
//		
		String s6="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s6.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);    
	
		String testString = "something";
		System.out.println(testString.isEmpty());
		
	}

}
