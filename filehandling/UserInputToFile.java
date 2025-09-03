package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputToFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String destinationFile = "D:\\honey\\destination.txt";
		try(FileWriter writer = new FileWriter(destinationFile)){
			//write to file
			System.out.println("Enter the text : ");
			writer.write(sc.nextLine());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
