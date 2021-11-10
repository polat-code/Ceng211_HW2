package sourceCode.supportingClasses;

public class FinancialStatus {
	private Integer income;
	private Integer savings;
	
	FinancialStatus() {
		this(null,null);
	}
	
	FinancialStatus(Integer income,Integer savings) {
		this.income = income;
		this.savings = savings;
	}
	
	FinancialStatus(FinancialStatus financialStatus) {
		this.income = financialStatus.income;
		this.savings = financialStatus.savings;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public Integer getSavings() {
		return savings;
	}

	public void setSavings(Integer savings) {
		this.savings = savings;
	}
	
}
