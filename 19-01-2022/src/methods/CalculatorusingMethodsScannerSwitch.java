package methods;

import java.util.Scanner;

public class CalculatorusingMethodsScannerSwitch 
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
		Scanner s=new Scanner(System.in);
		
		System.out.println("Calculator Menu:\n");
		System.out.println("1.Sum");
		System.out.println("2.Subtraction");
		System.out.println("3.Product");
		System.out.println("4.Division");
		System.out.println("5.Modulo\n");
		
		System.out.println("Select your operation: ");
		
		int operator=s.nextInt();
		
		switch(operator)
		{
			case 1:
				sum1();
				break;
			
			case 2:
				sub1();
				break;
					
			case 3:
				product1();
				break;
					
			case 4:
				division1();
				break;
						
			case 5:
				modulo1();
				break;
				
			default:
				System.out.println("select valid operation....!");
							
				
	}
	s.close();
		
}
	
	}
