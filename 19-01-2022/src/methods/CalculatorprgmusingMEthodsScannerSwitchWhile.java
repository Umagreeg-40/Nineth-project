package methods;

import java.util.Scanner;

public class CalculatorprgmusingMEthodsScannerSwitchWhile 
{
		static int v1, v2, sum, sub, pro, div, mod;
		
		static Scanner s=new Scanner(System.in);

		//sum
		public static void sum1()
		{
			System.out.println("Enter the value1: ");
			v1=s.nextInt();
			
			System.out.println("Enter the value2: ");
			v2=s.nextInt();
			
			
			sum=v1+v2;
			System.out.println("Sum: "+sum);
		}
		
		//subtraction
		public static void sub1()
		{
			System.out.println("Enter the value1: ");
			v1=s.nextInt();
			
			System.out.println("Enter the value2: ");
			v2=s.nextInt();
			
			sub=v1-v2;
			System.out.println("Difference: "+sub);
		}
		
		//product
		public static void product1()
		{
			System.out.println("Enter the value1: ");
			v1=s.nextInt();
			
			System.out.println("Enter the value2: ");
			v2=s.nextInt();
			
			pro=v1*v2;
			System.out.println("Product: "+pro);
		}
		
		//division
		public static void division1()
		{
			System.out.println("Enter the value1: ");
			v1=s.nextInt();
			
			System.out.println("Enter the value2: ");
			v2=s.nextInt();
			
			div=v1/v2;
			System.out.println("Division: "+div);
		}
		
		//modulo
		public static void modulo1()
		{
			System.out.println("Enter the value1: ");
			v1=s.nextInt();
			
			System.out.println("Enter the value2: ");
			v2=s.nextInt();
			
			mod=v1%v2;
			System.out.println("Modulo: "+mod);
		}
		
		//main method	
		public static void main(String[] args)
		{
			while(true)
			{
			
				System.out.println("Calculator Menu:\n");
				System.out.println("1.Sum");
				System.out.println("2.Subtraction");
				System.out.println("3.Product");
				System.out.println("4.Division");
				System.out.println("5.Modulo");
				System.out.println("6.Stop\n");
				
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
					
					case 6:
						System.exit(0);
						break;
						
					default:
						System.out.println("select valid operation....!");
									
						
			}
				
			}
			
		}
	
	}
