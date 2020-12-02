package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class FileReader {

	public Scanner readIn(String path) {
		try {
			URL url = getClass().getClassLoader().getResource(path);
			if(url == null) {
				errorMessage(path);
				return null;
			}
			File file = new File(url.getPath());
			return new Scanner(file);
		} catch (FileNotFoundException e) {
			errorMessage(path);
			System.out.println(e.getMessage());
			return null;
		}
	}

	private void errorMessage(String path) {
		System.out.println("The file was not found...");
		System.out.println("Folders must start with ./");
		System.out.println("An example would be ./textfiles/input.txt");
	}
}
