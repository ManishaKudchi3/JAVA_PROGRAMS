package conditional_statement;

import java.util.Scanner;

public class Discount1 {

	public static void main(String[] args) {
		String pname;
		float pprice,discount,amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name");
		pname=sc.nextLine();
		
		System.out.println("Enter the product price");
		pprice=sc.nextFloat();
		
		if(pprice>0 && pprice<=1000) {
			discount=pprice*0.02f;
		}
		else if(pprice>1000 && pprice<=3000) {
			discount =pprice*0.1f;
		}
		
		else {
			discount=pprice*0.15f;
		}
		amt=pprice-discount;
		
		System.out.println("The product name"+pname);
		System.out.println("The product price is"+pprice);
		System.out.println("The discount is"+discount);
		System.out.println("The amount to be paid"+amt);

	}

}