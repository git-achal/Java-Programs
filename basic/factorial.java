package basic;

public class factorial {
public static void main(String[] args) {
	int num=4;
	int res=1;
	for(int i=1;i<=num;i++) {
		res*=i;
	}
	System.out.println("The factorial of "+num +"="+res);
}
}
