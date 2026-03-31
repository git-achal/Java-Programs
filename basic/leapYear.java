package basic;

public class leapYear {
public static void main(String[] args) {
	int year=2025;
	boolean isleapyear;
	if(year%4==0) {
		isleapyear=true;
		if(year%100==0){
			isleapyear=true;
			if(year%400==0) {
				isleapyear=true;
			}else {
					isleapyear=false;
				}
			}
		
			
			if(isleapyear=true)
			System.out.println("year is leapyear");
		}else {
			System.out.println("not");
		}
			
		}
}


