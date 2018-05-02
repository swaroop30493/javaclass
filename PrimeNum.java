package firstP;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		boolean isprime = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		if (a == 0 || a ==1)
		{
		System.out.println("You entered a non-prime number");
		}
		else
		{
			for (int i=2;i<a;i++)
			{
				if (a%i == 0) 
				{
					isprime=false;
					break;
					
				}
			}
			if(isprime)
			{	
			System.out.println("You entered a prime number");
			}
			else
			{
			System.out.println("You entered a non-prime number");	
			}	
		}
		
		}
	}
