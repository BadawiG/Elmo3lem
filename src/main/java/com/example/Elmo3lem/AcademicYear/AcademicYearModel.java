package com.example.Elmo3lem.AcademicYear;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="AcademicYear")
public class AcademicYearModel {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long AcademicYearid;
	
	@Column
	private Long AcademicYearNameAr;
	private Long AcademicYearNameEn;

	private Date AcademicYearStartDate;
	private Date AcademicYearEndDate;
	
	private Long AcademicYearPid;

	private Long subsidiaryId;

	AcademicYearModel(){
		
	}
	
	public Long getAcademicYearid() {
		return AcademicYearid;
	}

	public void setAcademicYearid(Long academicYearid) {
		AcademicYearid = academicYearid;
	}

	public Long getAcademicYearNameAr() {
		return AcademicYearNameAr;
	}

	public void setAcademicYearNameAr(Long academicYearNameAr) {
		AcademicYearNameAr = academicYearNameAr;
	}

	public Long getAcademicYearNameEn() {
		return AcademicYearNameEn;
	}

	public void setAcademicYearNameEn(Long academicYearNameEn) {
		AcademicYearNameEn = academicYearNameEn;
	}

	public Date getAcademicYearStartDate() {
		return AcademicYearStartDate;
	}

	public void setAcademicYearStartDate(Date academicYearStartDate) {
		AcademicYearStartDate = academicYearStartDate;
	}

	public Date getAcademicYearEndDate() {
		return AcademicYearEndDate;
	}

	public void setAcademicYearEndDate(Date academicYearEndDate) {
		AcademicYearEndDate = academicYearEndDate;
	}

	public Long getAcademicYearPid() {
		return AcademicYearPid;
	}

	public void setAcademicYearPid(Long academicYearPid) {
		AcademicYearPid = academicYearPid;
	}

	public Long getSubsidiaryId() {
		return subsidiaryId;
	}

	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}

}
