package com.example.Elmo3lem.AcademicYear;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 
@Table(name="AcademicYear")
public class AcademicYearModel {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String AcademicYearNameAr;
	private String AcademicYearNameEn;
	
	@Transient 
	private String AcademicYearName;

	private Date AcademicYearStartDate;
	private Date AcademicYearEndDate;
	
	private Integer AcademicYearPid;
	
	@Column(name = "academic_year_type_id")
	private int AcademicYearTypeId = 1; //year =  1 , semester =2

	private Long subsidiaryId =1L;

	AcademicYearModel(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcademicYearNameAr() {
		return AcademicYearNameAr;
	}

	public void setAcademicYearNameAr(String academicYearNameAr) {
		AcademicYearNameAr = academicYearNameAr;
	}

	public String getAcademicYearNameEn() {
		return AcademicYearNameEn;
	}

	public void setAcademicYearNameEn(String academicYearNameEn) {
		AcademicYearNameEn = academicYearNameEn;
	}

	public String getAcademicYearName() {
		return AcademicYearName;
	}

	public void setAcademicYearName(String academicYearName) {
		AcademicYearName = academicYearName;
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

	public Integer getAcademicYearPid() {
		return AcademicYearPid;
	}

	public void setAcademicYearPid(Integer academicYearPid) {
		AcademicYearPid = academicYearPid;
	}

	public int getAcademicYearTypeId() {
		return AcademicYearTypeId;
	}

	public void setAcademicYearTypeId(int academicYearTypeId) {
		AcademicYearTypeId = academicYearTypeId;
	}

	public Long getSubsidiaryId() {
		return subsidiaryId;
	}

	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}

	public AcademicYearModel(Integer id, String academicYearNameAr, String academicYearNameEn, String academicYearName,
			Date academicYearStartDate, Date academicYearEndDate, Integer academicYearPid, int academicYearTypeId,
			Long subsidiaryId) { 
		this.id = id;
		AcademicYearNameAr = academicYearNameAr;
		AcademicYearNameEn = academicYearNameEn;
		AcademicYearName = academicYearName;
		AcademicYearStartDate = academicYearStartDate;
		AcademicYearEndDate = academicYearEndDate;
		AcademicYearPid = academicYearPid;
		AcademicYearTypeId = academicYearTypeId;
		this.subsidiaryId = subsidiaryId;
	}

 

}
