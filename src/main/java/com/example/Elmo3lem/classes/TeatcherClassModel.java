package com.example.Elmo3lem.classes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeatcherClass")
public class TeatcherClassModel {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long classId;
	
	@Column
	private Long classTetcherId;
	private Long classSubjectId;

	
	private Long classAcademicYearId;
	private Long classAcademicSemesterId;
	private Date classStartDate;
	private Date classEndDate;
	
	private Long classDuration;

	
	private Long classSubjectCostPerStudent;
	private Long classStudentCount;
	
	private Long classExpectedTotalAmount;
	private Long classTotalAmountPayed;
	
	private int classStatusId =0;  // 0 =Created  ,1=Shared , 2=Started , 3=Ended , 4=PayedToCenter ,5=PayedToTeatcher ,6=Closed
	
	private Long classPayedAmountToCenter;
	private Long classRecivedAmountFromCenter;

	
	private String classTitel;
	private String classComments;


	private String classLatitude;
	private String classLongitude;

	private Long subsidiaryId;
	
	
	TeatcherClassModel()
	{
		
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassTetcherId() {
		return classTetcherId;
	}

	public void setClassTetcherId(Long classTetcherId) {
		this.classTetcherId = classTetcherId;
	}

	public Long getClassSubjectId() {
		return classSubjectId;
	}

	public void setClassSubjectId(Long classSubjectId) {
		this.classSubjectId = classSubjectId;
	}

	public Long getClassAcademicYearId() {
		return classAcademicYearId;
	}

	public void setClassAcademicYearId(Long classAcademicYearId) {
		this.classAcademicYearId = classAcademicYearId;
	}

	public Long getClassAcademicSemesterId() {
		return classAcademicSemesterId;
	}

	public void setClassAcademicSemesterId(Long classAcademicSemesterId) {
		this.classAcademicSemesterId = classAcademicSemesterId;
	}

	public Date getClassStartDate() {
		return classStartDate;
	}

	public void setClassStartDate(Date classStartDate) {
		this.classStartDate = classStartDate;
	}

	public Date getClassEndDate() {
		return classEndDate;
	}

	public void setClassEndDate(Date classEndDate) {
		this.classEndDate = classEndDate;
	}

	public Long getClassDuration() {
		return classDuration;
	}

	public void setClassDuration(Long classDuration) {
		this.classDuration = classDuration;
	}

	public Long getClassSubjectCostPerStudent() {
		return classSubjectCostPerStudent;
	}

	public void setClassSubjectCostPerStudent(Long classSubjectCostPerStudent) {
		this.classSubjectCostPerStudent = classSubjectCostPerStudent;
	}

	public Long getClassStudentCount() {
		return classStudentCount;
	}

	public void setClassStudentCount(Long classStudentCount) {
		this.classStudentCount = classStudentCount;
	}

	public Long getClassExpectedTotalAmount() {
		return classExpectedTotalAmount;
	}

	public void setClassExpectedTotalAmount(Long classExpectedTotalAmount) {
		this.classExpectedTotalAmount = classExpectedTotalAmount;
	}

	public Long getClassTotalAmountPayed() {
		return classTotalAmountPayed;
	}

	public void setClassTotalAmountPayed(Long classTotalAmountPayed) {
		this.classTotalAmountPayed = classTotalAmountPayed;
	}

	public int getClassStatusId() {
		return classStatusId;
	}

	public void setClassStatusId(int classStatusId) {
		this.classStatusId = classStatusId;
	}

	public Long getClassPayedAmountToCenter() {
		return classPayedAmountToCenter;
	}

	public void setClassPayedAmountToCenter(Long classPayedAmountToCenter) {
		this.classPayedAmountToCenter = classPayedAmountToCenter;
	}

	public Long getClassRecivedAmountFromCenter() {
		return classRecivedAmountFromCenter;
	}

	public void setClassRecivedAmountFromCenter(Long classRecivedAmountFromCenter) {
		this.classRecivedAmountFromCenter = classRecivedAmountFromCenter;
	}

	public String getClassTitel() {
		return classTitel;
	}

	public void setClassTitel(String classTitel) {
		this.classTitel = classTitel;
	}

	public String getClassComments() {
		return classComments;
	}

	public void setClassComments(String classComments) {
		this.classComments = classComments;
	}

	public String getClassLatitude() {
		return classLatitude;
	}

	public void setClassLatitude(String classLatitude) {
		this.classLatitude = classLatitude;
	}

	public String getClassLongitude() {
		return classLongitude;
	}

	public void setClassLongitude(String classLongitude) {
		this.classLongitude = classLongitude;
	}

	public Long getSubsidiaryId() {
		return subsidiaryId;
	}

	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}
 
	
}
