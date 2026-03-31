package basic;

public class StringPalindrome {
public static void main(String[] args) {
	String s="achal";
	boolean isPalindrome=true;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
			isPalindrome=false;
			break;
		}
	}
	System.out.println("palindrome ?" +isPalindrome);
}
}
;