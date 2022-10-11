package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;

// Starting to work on files, and relative paths
public class TextReadWriteDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// Relative path generally best thing to use because of file location
		String relativeFilepath = "resources/temp.txt";
		File file = new File(relativeFilepath);
		// File represents a folder/ directory
		File resourceFolder = new File("resources1");
		
		
		// check if file exists at relative path location specified
		System.out.println("Does file exist?" + relativeFilepath + ":" + file.exists());

		// if file does not exist, make it 
		if (file.exists()) {
			try {
				if (resourceFolder.mkdir()) {
					System.out.println("Folder: " + resourceFolder.getName());
					
				}
				file.createNewFile();
				
			} catch (IOException e) {
				System.out.println("File" + file.getName() + " could not created with path"
						 + " " + file.getPath());
			}
			file.createNewFile();
			System.out.println("File created: " + file.getName());
		}
	}

}
