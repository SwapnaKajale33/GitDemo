
public class MethodDemo {

	public static void main(String[] args) {
		// why Method:Can be reused in many places then you will create method for it
		//and wrap all that lines of code into that method
		MethodDemo d =new MethodDemo();
		d.getData();
		MethodsDemo2 d2 =new MethodsDemo2();
		d2.getUserData();
		getData2();
		

	}
	public void getData() {
		System.out.println("Hello World");
		
	}
	public static String getData2() {
		System.out.println("Helllloooo");
		return "Rahul shetty academy";
	}

}
