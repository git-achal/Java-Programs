package basic;

public class fibonacciNumber {
public static void main(String[] args) {
	int num=10;
	int a=0;
	int b=1;
	System.out.println("a "+ num +" terms");
   for(int i=1;i<=num;++i) {
	   System.out.print(a + " + ");
	int next=a+b;
	a=b;
	b=next;
}
}
}
