package basic;

import java.util.Arrays;

public class StringToArray {
public static void main(String[] args) {
	String s="achal";
	int len=s.length();
	char[] numbers = new char[len];

	for(int i=0;i<s.length();i++) {
		numbers[i]=s.charAt(i);
	}
	System.out.println(Arrays.toString(numbers));
}
}
