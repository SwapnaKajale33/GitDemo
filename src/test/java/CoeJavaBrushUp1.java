
public class CoeJavaBrushUp1 {

	public static void main(String[] args) {
		/*java support different data type
		 * 
		 * 
		 * 
		 * 
		 */
              int myNum =3;
          String  webSite= "Rahul shetty Academy";
          char letter = 'r';
      double dec=5.99;
          boolean myCard = true;
          
          System.out.println(myNum +"is the stored in the myNum variable");
          
          /*Arrays- we can actually stored multiple values if you have a requirement of storing more than one value into a variable
           * []- it denotes that this variable is not just storing one integer it is storing multiple integer
           * new=will actually create memory for those many values what you are going to store in this variable 
           */
           int []arr = new int[5];// storing 5 element
           arr[0]=1;
           arr[1]=2;
           arr[2]=4;
           arr[3]=5;
           arr[4]=6;
           System.out.println(arr.length);
           int []arr2 = {1,2,4,5,6,8,9,10,122};
          // for loop using for loop can i iterate over the each and every element of this array print this value
         //  for(int i=0;i<arr.length; i++)
         //  {
        //	  System.out.println(arr[i]);
          //
           
           for(int i=0; i<arr2.length;i++)
           {
        	   System.out.println(arr2[i]);
           }
           
           String []names = {"rahul", "setty","selenium","Ritvi","Uk"};
           for(String s:names) {
        	   System.out.println(s);
           }
	}

}
