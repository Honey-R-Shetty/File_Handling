package insurance;

import java.io.IOException;
import java.util.List;

public class PolicyManager {
	private FileHandler fileHandler;

	public PolicyManager(FileHandler fileHandler) {
		this.fileHandler = fileHandler;
	}

	public void processPolicies(String inputFile, String outputFile) {
		try {
			List<Policy> policies = fileHandler.readPolicies(inputFile);

			int totalPolicies = policies.size();
			double totalAmount = policies.stream().mapToDouble(Policy::getAmount).sum();

			fileHandler.writeSummary(outputFile, totalPolicies, totalAmount);

			System.out.println("Processing Completed. Summary written to " + outputFile);

		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
