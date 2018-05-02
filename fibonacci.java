package firstP;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = s.nextInt();
		int a=0,b = 1,c;
		for (int i=0; i<=n; i++)
		{
			c=a+b;
			System.out.println(" "+a+ " ");
			a=b;
			b=c;
		}
	}
}
