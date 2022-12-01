package ProgramingInterviewbased;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// Remove duplicates characters in the given String
		
		String str = "Programming";
		
		// Approach  1
		//StringBuilder sb1 = new StringBuilder();// in this pre defined method is here 
		//str.chars().distinct().forEach(c-> sb1.append(c));
				
       //Approach2
		
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<str.length();i++)
		{
			char ch =str.charAt(i);
			int idx =str.indexOf(ch, i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
	}

}
