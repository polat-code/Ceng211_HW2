package sourceCode;

import java.util.ArrayList;

import sourceCode.supportingClasses.ApplicantInfo;
import sourceCode.supportingClasses.Document;
import sourceCode.supportingClasses.FinancialStatus;
import sourceCode.supportingClasses.Passport;
import sourceCode.supportingClasses.Photo;

public class Tourist  extends Person {

	Tourist() {
		super(null,null,null,null,null);
	}
	Tourist(ApplicantInfo applicantInfo,Passport passport,Photo photo
			,FinancialStatus financialStatus,ArrayList<Document> document) {
		super(applicantInfo,passport,photo,financialStatus,document);
	}
	Tourist(Tourist tourist) {
		super(tourist);
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkPassport() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkPhoto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkFinancialStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkDocument() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String checkStatusWithReason() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

}
