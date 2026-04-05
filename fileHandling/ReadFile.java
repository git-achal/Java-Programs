package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
public static void main(String[] args) {
	try {
		File obj=new File("myfile.txt");
		Scanner scan=new Scanner(obj);
		while(scan.hasNextLine()) {
			String s=scan.nextLine();
			System.out.println(s);
		}
		
		scan.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
