package basic;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a 2 number");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("enter which calculation you want +,-,*,/");
	char operator=scan.next().charAt(0);
	
	int res=0;
	
	switch(operator) {
	case '+':
		res=a+b;
		System.out.println(res);
		break;
	case '-':
		res=a-b;
		System.out.println(res);
		break;
	
   case '*':
	res=a*b;
	System.out.println(res);
	break;
    
   case '/':
		res=a/b;
		System.out.println(res);
		break;
	}
	}
	
}

