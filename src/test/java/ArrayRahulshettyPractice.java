import java.util.ArrayList;

public class ArrayRahulshettyPractice {

	public static void main(String[] args) {
		
		int[]arr2 = {1,2,4,5,6,7,8,9,10,122};
		for(int i=0;i<arr2.length; i++)
		{
			if(arr2[i]%2==0)
	// if you are to compare two numbers in java , you have to put double equals two			
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i]+"is not multiple of 2");
			}
			/*Array: one problem here is that the memory allocation has to be done in the beginning
			 * so that means the size of array is fixed when your are initializing
			 * so later ,when you want to increase the size of it , its not possible
			 * 
			 * 
			 * 
			 * 
			 */
			ArrayList <String> a = new  ArrayList <String>();
			a.add("Rahul");
			a.add("shetty");
			a.add("academy");
			a.add("Selenium");
			//a.remove(2);
			System.out.println(a.get(3));
		}

	}

}
