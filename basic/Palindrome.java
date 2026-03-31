package basic;

public class Palindrome {
public static void main(String[] args) {
	int num=131;
	int Onum=num;
	int revNum = 0;
	while(num!=0) {
		int finalNum=num%10;
		revNum=revNum*10+finalNum;
		num=num/10;
	}
	if(Onum==revNum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not");
	}
}
}
