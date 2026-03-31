package basic;

import java.util.Scanner;

public class Addition {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number");
	int num=scan.nextInt();
	System.out.println("Enter second number");
	int num2=scan.nextInt();
	int add=num+num2;
	System.out.println("addition of two num " + add);
	scan.close();
	}
}
