package exceptionHandling;

public class TryCatchExample2 {  
	  
    public static void main(String[] args) {  
        try  
        {  
//        
        	System.out.println("TEst");
        	try{
        		
        	}catch(Exception e){
        		
        	}
        }catch(Exception e){
        	System.out.println("Generic catch block");
        	
        }
        finally{
        	//DB connection close
        	System.out.println("Finally");
        } 
        
        try{
        	
        }catch(Exception e){
        	
        }
            //handling the exception  
//        catch(ArithmeticException e)  
//        {  
//            System.out.println(e);  
//        } 
//       
//        catch(NullPointerException e)  
//        {  
//            System.out.println(e);  
//        } 
        
       
        System.out.println("rest of the code");  
    }  
      
}  
