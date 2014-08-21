package com.RLD.run;

import com.RLD.filewriter.WriteFile;
import java.io.IOException;

public class Run {
	
	public static void main(String [] args) throws IOException{
		
		String data = "This will test the writing method";
		
		WriteFile.writeFile(data);
		
	}

}
