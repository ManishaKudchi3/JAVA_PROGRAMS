package conditional_statement;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
	   int age;
	   
	      Scanner sc = new Scanner(System.in);
	System.out.println("enter a age");
	age = sc.nextInt();
	if(age>=18) {
		System.out.println("Eligible for voting");
	}
	else {
		System.out.println("not eligible for voting");
	}

	}

}
