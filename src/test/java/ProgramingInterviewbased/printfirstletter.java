package ProgramingInterviewbased;

public class printfirstletter {

	public static void main(String[] args) {
		//Write a java program to print first letter of each word
		
		String s= "Swapnali Umakant kajale";
		splitWords(s);
		//String[]str=s.split(" ");
		
	}
	
	private static void splitWords(String s) {
	String words[]=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String str= words[i];
			System.out.println(str.charAt(0));
		}
//}

}
}