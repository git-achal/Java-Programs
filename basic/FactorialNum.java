package basic;

import java.util.Scanner;

public class FactorialNum {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the Positive number");
	
	int a=scan.nextInt();
	int fact=1;

	for(int i=2;i<=a;i++) {
		 fact *= i;
	}
System.out.println("factorial of "+ a +" "+fact );
scan.close();
}
}

