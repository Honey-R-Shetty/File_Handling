package insurance;

import java.io.*;
import java.util.*;

public class TextFileHandler implements FileHandler {

	@Override
	public List<Policy> readPolicies(String fileName) throws IOException {
		List<Policy> policies = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int id = Integer.parseInt(data[0].trim());
				String name = data[1].trim();
				double amount = Double.parseDouble(data[2].trim());
				policies.add(new Policy(id, name, amount));
			}
		}
		return policies;
	}

	@Override
	public void writeSummary(String fileName, int totalPolicies, double totalAmount) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			bw.write("Total Number of Policies: " + totalPolicies);
			bw.newLine();
			bw.write("Total Policy Amount: " + totalAmount);
		}
	}
}
