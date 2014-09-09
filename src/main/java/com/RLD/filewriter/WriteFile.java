package com.RLD.filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
	
	public static void writeFile(String data) throws IOException {
        
            File file = new File("/home/ashen/Desktop/SaveFile.xlsx");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(data);
            output.close();
          
	}
}
