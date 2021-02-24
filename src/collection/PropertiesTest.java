package collection;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:\\TrainingWS\\28-06-2019\\src\\collection_example\\test.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
    
    
    Properties p1=System.getProperties();  
    Set set=p1.entrySet();  
      
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
    Map.Entry entry=(Map.Entry)itr.next();  
    System.out.println(entry.getKey()+" = "+entry.getValue());  
    }  
}  
} 
