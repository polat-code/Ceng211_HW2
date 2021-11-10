package sourceCode;
import java.util.ArrayList;

import sourceCode.supportingClasses.*;

public abstract class Person implements Comparable<Person> {
	//Fields
	ApplicantInfo applicantInfo;
	Passport passport;
	Photo photo;
	FinancialStatus financialStatus;
	ArrayList<Document> document = new ArrayList<Document>();
	
	Person() {
		this(null,null,null,null,null);
	}
	Person(ApplicantInfo applicantInfo,Passport passport,Photo photo
			,FinancialStatus financialStatus,ArrayList<Document> document) {
		this.applicantInfo = applicantInfo;
		this.passport = passport;
		this.photo = photo;
		this.financialStatus = financialStatus;
		this.document.addAll(document);
	}
	
	Person(Person person) {
		this.applicantInfo = person.applicantInfo;
		this.passport = person.passport;
		this.photo = person.photo;
		this.financialStatus = person.financialStatus;
		this.document = person.document;		
	}
	
	/* 
	 * This is used for whether passport is valid.
	 * @precondition passport must not be null; 
	 * @postcondition if passport is valid return true, if invalid return false.
	 * @param None
	 * @return true or false.
	 * 
	 * */
	public abstract boolean checkPassport();
	
	
	/* This method checks resolution and position.
	 * precondition photo must not be null
	 * postcondition if photo is valid return true,if invalid return false. 
	 * @param None.
	 * @return true or false.
	 * */
	public abstract boolean checkPhoto();
	
	
	/* This method checks income and savings according to type of person.
	 * @precondition financialStatus must not be null
	 * @postcondition if financialStatus is valid return true , if invalid return false.
	 * @param None
	 * @return true or false
	 * 
	 * */
	public abstract boolean checkFinancialStatus();
	
	
	/* This method checks document type and decide whether it is valid according to type of person.
	 * @precondition document must not be null
	 * @postcondition according to convention in person if all documents or only one is valid 
	 * return true , otherwise return false.
	 * @param None
	 * @return true or false.
	 * */
	public abstract boolean checkDocument();
	
	
	/* This methods checks whether all conditions are satisfied.(Hint:Use other check methods)
	 * @precondition no instance variable must be null.
	 * @postcondition all check methods must be controlled
	 *  @param None
	 *  @return true or false
	 *  */
	public abstract boolean checkStatus();
	
	
	/*This method is used to get the detail information about whether it is accepted
	 * @precondition checkStatus must return false.
	 * @postcondition Obtain the detail information with String representation.
	 * @param None
	 * @return return message about rejection.
	 * */
	
	public abstract String checkStatusWithReason();
	 
	
	/* This method is used for sorting in Collections. it compares only ApplicantId instance 
	 * variable that is in applicantInfo class.
	 * @precondition parameter shouldn't be null
	 * @postcondition if variable instance ApplicantId is greater than ApplicantId that other 
	 * person has then return +1 , if they equal return 0 and otherwise return -1. 
	 * @param a Person object
	 * @return +1 or 0 or -1
	 * 
	 * 
	 * @Override
	   public int compareTo(Person o);
	 * 
	 * */
	
	
	/* This method is used to represent the Person object
	 * @precondition None
	 * @postCondition Return String representation
	 * @param None 
	 * @return String representation 
	 * 
	 * */
	public abstract String toString();
	
	
	/* This method is used for equality between two objects.Check only  ApplicantId whether it is equal.
	 * @precondition person must not be null
	 * @postcondition if they equal then return true otherwise return false.
	 * @param a Person object or type of object
	 * @return if they equal return true otherwise false.
	 * 
	 * */
	public abstract boolean equals(Person p);
	
	
	
}
