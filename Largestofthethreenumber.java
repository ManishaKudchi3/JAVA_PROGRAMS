package conditional_statement;

import java.util.Scanner;

public class Largestofthethreenumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		
		System.out.println("Enter b");
		b=sc.nextInt();
		
		System.out.println("Enter c");
		c=sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("The largest number is "+a);
		}
		if(b>a&&b>c) {
			System.out.println("The largest number is "+b);
		}
		if(c>a&&c>b) {
			System.out.println("The largest number is "+b);
		}
		
		
					
		}
		
		
		
	}


