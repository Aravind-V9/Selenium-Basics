package seleniumBasics;

public class methodAccess {

	
	public static void main(String[] args) {

		// TODO Auto-generated method stub



		methodAccess d = new methodAccess();

		String name = d.getData();

		System.out.println(name);

		//MethodsDemo2 d1 = new MethodsDemo2();

		//d1.getUserData();

		getData2();
	}



		public String getData()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}



		public static String getData2()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}

}
