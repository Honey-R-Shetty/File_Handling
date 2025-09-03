package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFileContent {
	public static void main(String[] args) {
		String inputFile = "D:\\honey\\source.txt";
		String outputFile = "D:\\honey\\destination.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			StringBuilder content = new StringBuilder();
			String line;
			
			// Read file
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
			
			// Reverse the content
			content.reverse();
			
			// Write to reversed
			writer.write(content.toString());

			System.out.println("File reversed successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
