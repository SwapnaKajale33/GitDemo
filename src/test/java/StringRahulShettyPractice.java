import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class StringRahulShettyPractice {

	public static void main(String[] args) {
		/*String is am object that repesent sequence of characters 
		 * 
		 * so if the text is same no matter how many string variables you created in the backend
		 * java say only one object will get created.
		 * 
		 */
		//String s ="Rahul shetty Academy";// string literal
		//String s1 ="Rahul shetty Academy";
		
        String s2 = new String ("Welcome");//new
       // but here no matter if it is the same string value it will still explicitly created new object in the memory space
        
        String s3 = new String ("Welcome");
       String s = "Rahul Shetty Academy";
       
     String [] splittedString= s.split("Shetty");
     System.out.println(splittedString[0]);
     System.out.println(splittedString[1]);
    System.out.println(splittedString[1].trim());
    for(int i=0;i<s.length();i++)
    {
   System.out.println( s.charAt(i)); 
  
    	// it will iterate every time and every time it will pull one character and it will give you in the output
    	
    }
	}

}
