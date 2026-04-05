package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("myfile.txt");
		fw.write("files of java are good");
		fw.close();
		System.out.println("succsssfully written");
		
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
