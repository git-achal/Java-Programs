package basic;

import java.util.Arrays;
import java.util.Scanner;

public class StringtoArraytest {
public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 
 System.out.println("enter a String");
 String s=scan.next();
 
 char ch[]=new char[s.length()];

  
 for(int i=0;i<s.length();i++) {
	 ch[i]=  s.charAt(i);
	 }
System.out.println(Arrays.toString(ch));
}
}
