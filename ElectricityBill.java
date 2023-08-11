package conditional_statement;
 
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		System.out.println("Enter the number of units consumed");
        Scanner sc = new Scanner(System.in);
        float units= sc.nextFloat();
        double amt =0;
        if (units<0)
        	System.out.println("Invaild number of units");
        else if(units<=200)
        {
          amt = units*3.80);
          System.out.println("Bill amount"+ amt);
        }
        else if(units>=200 && units<=300) {
        	amount=(float)(units*4.40);
        	System.out.println("Your Electricity bill is "+ amount);
        	}
        
	}

}
