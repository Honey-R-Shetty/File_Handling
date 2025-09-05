package insurance;

import java.io.IOException;
import java.util.List;

public interface FileHandler {
	List<Policy> readPolicies(String fileName) throws IOException;

	void writeSummary(String fileName, int totalPolicies, double totalAmount) throws IOException;
}
