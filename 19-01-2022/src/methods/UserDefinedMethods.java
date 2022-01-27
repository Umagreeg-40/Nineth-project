package methods;

public class UserDefinedMethods 
{
	//user defined method definition  
	
	public static void getMessage(String text)  //text parameter
	{
		//method implementation
		System.out.println(text);
	}
	
	public static String getMessage1(String text)  //method head/signature
	{
		return(text);
	}
	
	public static void main(String[] args)
	{
		getMessage("Hello Welcome"); 
		//calling user defined method
		 
		System.out.println(getMessage1("Hello hi"));
		//method by passing arguments/values

	}

}
