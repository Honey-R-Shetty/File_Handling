package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingBasicOperations{
	public static void main(String[] args) {
		String fileName = "D:\\honey\\honey.txt";

		// Write to file (create new file)
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write("Hello, this is the first line.\n");
			writer.write("This is the second line.");
			System.out.println("File created and written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Read from file
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			System.out.println("Reading file content:");
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Check File Information
		File file = new File(fileName);
		if (file.exists()) {
			System.out.println("\nFile Information:");
			System.out.println("Name: " + file.getName());
			System.out.println("Path: " + file.getAbsolutePath());
			System.out.println("Writable: " + file.canWrite());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Length: " + file.length());
		}

		// Delete file
		if (file.delete()) {
			System.out.println("\nFile deleted successfully: " + fileName);
		} else {
			System.out.println("\nFailed to delete the file.");
		}

	}
}
