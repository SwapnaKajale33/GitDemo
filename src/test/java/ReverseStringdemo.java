
public class ReverseStringdemo {

	public static void main(String[] args) {
		//String s="Swapnali Umakant kajale";
		
		//for(int i=s.length()-1; i>=0;i--)
		//{
		//	System.out.println(s.charAt(i));
	//	}

	
	
	//String s1 ="Swapnali Umakant Kajale";
	//String y ="";
	
	//for(int i=s1.length()-1;i>=0;i--)
//	{
	//	y=y+s1.charAt(i);
	//}
//	System.out.println(y);

	String s2 ="Swapnali umakant kajale";
	String []y1 =s2.split("");
	String z ="";
	
	for(int i=y1.length-1;i>=0;i--)
	{
		z=z+""+y1[i];
		
	}
	System.out.println(z);
}
}