package sourceCode.supportingClasses;

public class Document {
	private String documentType;
	/* Duration can be null*/
	private Integer duration;
	
	Document() {
		this(null,null);
	}
	
	Document(String documentType) {
		this(documentType,null);
	}
	
	Document(String documentType,Integer duration) {
		this.documentType = documentType;
		this.duration = duration;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
}
