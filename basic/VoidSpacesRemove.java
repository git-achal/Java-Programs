package basic;

import java.util.Arrays;

public class VoidSpacesRemove {
public static void main(String[] args) {
	String a="Swapnil Patil 01";
	String b="";
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i) != ' ') {
			  b += a.charAt(i);
			
		}
	}
	System.out.println(b);
}
}
