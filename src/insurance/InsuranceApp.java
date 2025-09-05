package insurance;

public class InsuranceApp {
    public static void main(String[] args) {
        FileHandler fileHandler = new TextFileHandler();
        PolicyManager manager = new PolicyManager(fileHandler);

        manager.processPolicies("policies.txt", "summary.txt");
    }
}
