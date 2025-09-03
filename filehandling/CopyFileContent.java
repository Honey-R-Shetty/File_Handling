package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String sourceFile = "D:\\honey\\source.txt";
		String destinationFile = "D:\\honey\\destination.txt";

		try (FileReader reader = new FileReader(sourceFile);FileWriter writer = new FileWriter(destinationFile)) {
				//read
				int data = reader.read();
				while (data != -1) {
					//write 
					writer.write((char) data);
					data = reader.read();
				}
				 System.out.println("File copied successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
