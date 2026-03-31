package basic;

import java.util.Scanner;
//to check whether the given number  even or odd number
public class OddOrEven {
public static void main(String[] args) {
	Scanner scanner=new Scanner (System.in);
	System.out.println("enter a num");
	int num=scanner.nextInt();
	 if(num % 2 == 0) {
	System.out.println("num is even");
    }else {
	System.out.println("odd");
    }
	 scanner.close();
}
}
