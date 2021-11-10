package sourceCode.supportingClasses;

public class Passport {
	private String passportNumber;
	private String expiration;
	
	Passport() {
		this(null,null);
	}
	
	Passport(String passportNumber, String expiration) {
		this.passportNumber = passportNumber;
		this.expiration = expiration;
	}
	
	Passport(Passport passport) {
		this.passportNumber = passport.passportNumber;
		this.expiration = passport.expiration;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
}
