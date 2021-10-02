/* Reading Text File */

package com.vev.iosd.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		int ch, charCount, wordCount, lineCount;
		charCount = wordCount = lineCount = 0;
		try (FileReader fr = new FileReader("names.txt")){
			
			while ((ch = fr.read()) != -1) {
				charCount++;
				if (ch == 32)
					wordCount++;
				if (ch == 13) {
					lineCount++;
				}
			}
			System.out.println("Characters = " + charCount);
			System.out.println("Words = " + (wordCount + lineCount));
			System.out.println("Lines = " + lineCount);
		} catch(FileNotFoundException excep) {
			System.out.println("no such file available");
		} catch(IOException excep) {
			System.out.println("cannot read file");
		} 
	}

}
