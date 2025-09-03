package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplayContent {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String sourceFile = "D:\\honey\\source.txt";
		try(FileReader reader = new FileReader(sourceFile)){
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
