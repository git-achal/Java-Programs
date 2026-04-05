package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)
    {

        try {
            File Obj = new File("myfile2.txt");
            System.out.println("shdgsfjwfds");
            
          	// Creating File
          	if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
      
      	// Exception Thrown
        catch (Exception e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    }

