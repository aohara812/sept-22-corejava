package com.cognixia.jump.fileio;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = null;
		FileWriter filewriter = null;
		BufferedWriter buffWriter = null;
		PrintWriter printWriter = null;
		
		try {
			file = new File("resources/temp.txt");
			
			if(file.exists()) {
				filewriter = new FileWriter(file, true);
				buffWriter = new BufferedWriter(filewriter);
				printWriter = new PrintWriter(buffWriter);
				
				// create some helper methods below to see different ways to write our files
				writeToFile(buffWriter, "Hello");
//				appendToFile(buffWriter, "New string added.");
//				writeWithPrintWriter(printWriter, "Print Writer wrote this!");
//				
			}
		

	} catch (Exception e) {
		
		e.printStackTrace();		
	} finally {
		if (buffWriter != null) {
			try {
				buffWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if (filewriter != null) {
			try {
				filewriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if (printWriter != null) {
			printWriter.close();
			
		}
	}

}

	private static void writeWithPrintWriter(PrintWriter printWriter, String string) {
		
		printWriter.println();
		printWriter.print(string);
		printWriter.println(string);
		printWriter.println(string);
		
	}

	private static void appendToFile(BufferedWriter buffWriter, String string) throws IOException {
		for (int i = 0; i < 3; i++) {
			buffWriter.append(string);
	}
		
	}

	private static void writeToFile(BufferedWriter buffWriter, String string) throws IOException {
		
		for (int i = 0; i < 3; i++) {
			buffWriter.write(string);
	}
}
}

