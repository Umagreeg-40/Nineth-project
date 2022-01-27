package methods;

public class MethodCalling 
{
	static int v1=700, v2=15, sum, sub, pro, div, mod;
		
	//sum
	public static void sum1()
	{
		sum=v1+v2;
		System.out.println("Sum: "+sum);
	}
		
	//subtraction
	public static void sub1()
	{
		sub=v1-v2;
		System.out.println("Difference: "+sub);
	}
		
	//product
	public static void product1()
	{
		pro=v1*v2;
		System.out.println("Product: "+pro);
	}
		
	//division
	public static void division1()
	{
		div=v1/v2;
		System.out.println("Division: "+div);
	}
		
	//modulo
	public static void modulo1()
	{
		mod=v1%v2;
		System.out.println("Modulo: "+mod);
	}

	//main method	
	public static void main(String[] args)
	{
		sum1();
		modulo1();
	}
}
