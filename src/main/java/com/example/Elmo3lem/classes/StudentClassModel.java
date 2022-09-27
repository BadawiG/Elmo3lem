package com.example.Elmo3lem.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "StudentClass")
public class StudentClassModel {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long StudentClassId;

	@Column
	private Long studentClassClassId;
	private Long studentClassStudentId;
	private Long studentClassRating; // 1,2,3,4,5
	
	
	private Long studentClassExpectedAmount;   
	private Long studentClassPayedAmount;  
	private Long studentClassReminingAmount;  

	private Long studentClassPayedStatus;  
	private Long subsidiaryId;
	private String commint;
	
	
	StudentClassModel()
	{
		
	}
	
	public Long getStudentClassId() {
		return StudentClassId;
	}
	public void setStudentClassId(Long studentClassId) {
		StudentClassId = studentClassId;
	}
	public Long getStudentClassClassId() {
		return studentClassClassId;
	}
	public void setStudentClassClassId(Long studentClassClassId) {
		this.studentClassClassId = studentClassClassId;
	}
	public Long getStudentClassStudentId() {
		return studentClassStudentId;
	}
	public void setStudentClassStudentId(Long studentClassStudentId) {
		this.studentClassStudentId = studentClassStudentId;
	}
	public Long getStudentClassRating() {
		return studentClassRating;
	}
	public void setStudentClassRating(Long studentClassRating) {
		this.studentClassRating = studentClassRating;
	}
	public Long getStudentClassExpectedAmount() {
		return studentClassExpectedAmount;
	}
	public void setStudentClassExpectedAmount(Long studentClassExpectedAmount) {
		this.studentClassExpectedAmount = studentClassExpectedAmount;
	}
	public Long getStudentClassPayedAmount() {
		return studentClassPayedAmount;
	}
	public void setStudentClassPayedAmount(Long studentClassPayedAmount) {
		this.studentClassPayedAmount = studentClassPayedAmount;
	}
	public Long getStudentClassReminingAmount() {
		return studentClassReminingAmount;
	}
	public void setStudentClassReminingAmount(Long studentClassReminingAmount) {
		this.studentClassReminingAmount = studentClassReminingAmount;
	}
	public Long getStudentClassPayedStatus() {
		return studentClassPayedStatus;
	}
	public void setStudentClassPayedStatus(Long studentClassPayedStatus) {
		this.studentClassPayedStatus = studentClassPayedStatus;
	}
	public Long getSubsidiaryId() {
		return subsidiaryId;
	}
	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}
	public String getCommint() {
		return commint;
	}
	public void setCommint(String commint) {
		this.commint = commint;
	}

	
	 

}
