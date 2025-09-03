package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	public static void main(String[] args) throws IOException {
		String destinationFile = "D:\\honey\\destination.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(destinationFile))) {
			int word = reader.read();
			int count = 0;
			boolean isFound = false;

			while (word != -1) {
				char ch = (char) word;
				if (Character.isLetterOrDigit(ch)) {
					if (!isFound) {
						count++;
						isFound = true;
					}
				} else {
					isFound = false;
				}
				word = reader.read();
			}
			System.out.println("Word count: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
