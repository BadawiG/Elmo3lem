package com.example.Elmo3lem.subsidiaries;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 
@Table(name="Subsidiaries")
public class SubsidiariesModel {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long subsidiarId;
	
	@Column
	private String subsidiaryNameAr;
	private String subsidiaryNameEn;
	
	@Transient
	private String subsidiaryName;

	private String subsidiaryAdress;

	private Date subsidiaryHireDate;
	
	private Long subsidiaryContactNumber1;
	private Long subsidiaryContactNumber2;
	
	
	SubsidiariesModel()
	{
		
	}
	
	
	public String getSubsidiaryName() {
		return subsidiaryName;
	}


	public void setSubsidiaryName(String subsidiaryName) {
		this.subsidiaryName = subsidiaryName;
	}

	public Long getSubsidiarId() {
		return subsidiarId;
	}
	public void setSubsidiarId(Long subsidiarId) {
		this.subsidiarId = subsidiarId;
	}
	public String getSubsidiaryNameAr() {
		return subsidiaryNameAr;
	}
	public void setSubsidiaryNameAr(String subsidiaryNameAr) {
		this.subsidiaryNameAr = subsidiaryNameAr;
	}
	public String getSubsidiaryNameEn() {
		return subsidiaryNameEn;
	}
	public void setSubsidiaryNameEn(String subsidiaryNameEn) {
		this.subsidiaryNameEn = subsidiaryNameEn;
	}
	public String getSubsidiaryAdress() {
		return subsidiaryAdress;
	}
	public void setSubsidiaryAdress(String subsidiaryAdress) {
		this.subsidiaryAdress = subsidiaryAdress;
	}
	public Date getSubsidiaryHireDate() {
		return subsidiaryHireDate;
	}
	public void setSubsidiaryHireDate(Date subsidiaryHireDate) {
		this.subsidiaryHireDate = subsidiaryHireDate;
	}
	public Long getSubsidiaryContactNumber1() {
		return subsidiaryContactNumber1;
	}
	public void setSubsidiaryContactNumber1(Long subsidiaryContactNumber1) {
		this.subsidiaryContactNumber1 = subsidiaryContactNumber1;
	}
	public Long getSubsidiaryContactNumber2() {
		return subsidiaryContactNumber2;
	}
	public void setSubsidiaryContactNumber2(Long subsidiaryContactNumber2) {
		this.subsidiaryContactNumber2 = subsidiaryContactNumber2;
	}


}
