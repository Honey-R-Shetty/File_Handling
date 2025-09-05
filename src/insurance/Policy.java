package insurance;

public class Policy {
	private int policyId;
	private String holderName;
	private double amount;

	public Policy(int policyId, String holderName, double amount) {
		this.policyId = policyId;
		this.holderName = holderName;
		this.amount = amount;
	}

	public int getPolicyId() {
		return policyId;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getAmount() {
		return amount;
	}
}
