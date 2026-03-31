package basic;

public class PrimeNum {
public static void main(String[] args) {
	int num=29;
	boolean prime=true;
	
	if(num == 1 || num ==2 || num==3) {
		prime=false;
	} else{
		
		for(int i=2;i<=num / 2;i++) {
			if(num % i== 0) {
			prime=false;
			break;
			}
		}
	}
	if(prime) {
		System.out.println( num +" prime number");
	}
	else {
		System.out.println(num +" not prime number");
	}
}
}
	


