package com.example.Elmo3lem.login;

import java.sql.Date;

import javax.persistence.*;

 
@Entity 
@Table(name="Users")

public class UserModel {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	@Column
	// personal info
	private String firestName;
	private String secondName;
	private Long Gender;
	private Date birthDate;
	private Long nationality;
	private String passportNumber;
	private String nationalIdNumber;
	private String userImage;

 	//contact info
	private Long mobileNumber1;
	private Long mobileNumber2;
	private String eMail;
	private String adress1;
	private String adress2;
	
	// job info
	private Long subjectsFkId;
	private Date hireDate;
 
	//user account info
	private String userName;
	private String password;
	
	
	private Long userType;
	private Long subsidiaryId;
	
	
	UserModel()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirestName() {
		return firestName;
	}
	public void setFirestName(String firestName) {
		this.firestName = firestName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Long getGender() {
		return Gender;
	}
	public void setGender(Long gender) {
		Gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Long getNationality() {
		return nationality;
	}
	public void setNationality(Long nationality) {
		this.nationality = nationality;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getNationalIdNumber() {
		return nationalIdNumber;
	}
	public void setNationalIdNumber(String nationalIdNumber) {
		this.nationalIdNumber = nationalIdNumber;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public Long getMobileNumber1() {
		return mobileNumber1;
	}
	public void setMobileNumber1(Long mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}
	public Long getMobileNumber2() {
		return mobileNumber2;
	}
	public void setMobileNumber2(Long mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAdress1() {
		return adress1;
	}
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	public String getAdress2() {
		return adress2;
	}
	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}
	public Long getSubjectsFkId() {
		return subjectsFkId;
	}
	public void setSubjectsFkId(Long subjectsFkId) {
		this.subjectsFkId = subjectsFkId;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getUserType() {
		return userType;
	}
	public void setUserType(Long userType) {
		this.userType = userType;
	}
	public Long getSubsidiaryId() {
		return subsidiaryId;
	}
	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}
	
	@Override
	public String toString() {
		return " {id=" + id + ", firestName=" + firestName + ", secondName=" + secondName + ", Gender="
				+ Gender + ", birthDate=" + birthDate + ", nationality=" + nationality + ", passportNumber="
				+ passportNumber + ", nationalIdNumber=" + nationalIdNumber + ", userImage=" + userImage
				+ ", mobileNumber1=" + mobileNumber1 + ", mobileNumber2=" + mobileNumber2 + ", eMail=" + eMail
				+ ", adress1=" + adress1 + ", adress2=" + adress2 + ", subjectsFkId=" + subjectsFkId + ", hireDate="
				+ hireDate + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", subsidiaryId=" + subsidiaryId + "}";
	}
	
}
