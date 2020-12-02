package days;

import java.util.Scanner;

import util.FileReader;

public class Day {
	protected final Scanner scanner;

	public Day(String path) {
		this.scanner = new FileReader().readIn(path);
		if (scanner == null) {
			throw new NullPointerException("Your path must be incorrect. Can't find " + path);
		}
	}

}
