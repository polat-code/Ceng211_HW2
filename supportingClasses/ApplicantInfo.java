package sourceCode.supportingClasses;

public class ApplicantInfo {
	private String applicantId;
	private String applicantName;
	
	ApplicantInfo() {
		this(null,null);
	}
	
	ApplicantInfo(String applicantId,String applicantName) {
		this.applicantId = applicantId;
		this.applicantName = applicantName;
	}
	
	ApplicantInfo(ApplicantInfo applicantInfo){
		this.applicantId = applicantInfo.applicantId;
		this.applicantName = applicantInfo.applicantName;
	}
	

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	
	
	
}
