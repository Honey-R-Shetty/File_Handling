package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LargeDataFileProcessing {
	public static void main(String[] args) {
		String inputFile = "D:\\honey\\source.txt";
		String outputFile = "D:\\honey\\destination.txt";
		double threshold = 1000.0; // Amount > 1000

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			String line;

			while ((line = reader.readLine()) != null) {
				// TransactionID,CustomerID,TransactionAmount,Date
				String[] parts = line.split(",");

				if (parts.length == 4) {
					try {
						double amount = Double.parseDouble(parts[2].trim());

						if (amount > threshold) {
							writer.write(line);
							writer.newLine();
						}
					} catch (NumberFormatException e) {
						System.out.println("Invalid amount in record: " + line);
					}
				} else
					System.out.println("Invalid record format: " + line);
			}
			System.out.println("Filtered transactions written successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
