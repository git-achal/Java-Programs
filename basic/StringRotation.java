package basic;

public class StringRotation {
public static void main(String[] args) {
	String a="abcd";
	String b="cdab";
	if((a+b).contains(b)) {
		System.out.println("Rotation");
		
	}else {
		System.out.println("not Rotation");
	}
}
}
