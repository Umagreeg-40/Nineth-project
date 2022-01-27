package methods;

public class UserDefinedArguments 
{

		public static String getMessage1(String text)  //method head/signature
		{
			return(text);
		}
		
		public static void main(String[] args)
		{
			String text=getMessage1("Hello hi");
			
			System.out.println(text);
		}


	}

