package basic;

import java.util.Arrays;

public class VowelConsonentArray {
public static void main(String[] args) {
	String s="achal";
	char []Varr= new char[s.length()];
	char []Carr=  new char[s.length()];
	int j=0;
	int k=0;

	for(int i=0;i<s.length();i++) {
		if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u') {
			Varr[j++]=s.charAt(i);
		}else {
			Carr[k++]=s.charAt(i);
		}
}
	System.out.println(Arrays.toString(Carr));
	System.out.println(Arrays.toString(Varr));
}
}
