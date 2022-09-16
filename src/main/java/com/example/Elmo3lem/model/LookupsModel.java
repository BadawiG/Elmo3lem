package com.example.Elmo3lem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lookups")
public class LookupsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long LookupId;
	@Column
	private Long parentId;


	private String LookupNameAr;
	private String LookupNameEn;
	
	private Long subsidiaryId;

	public Long getLookupId() {
		return LookupId;
	}
	public Long getSubsidiaryId() {
		return subsidiaryId;
	}
	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}
	public void setLookupId(Long lookupId) {
		LookupId = lookupId;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getLookupNameAr() {
		return LookupNameAr;
	}
	public void setLookupNameAr(String lookupNameAr) {
		LookupNameAr = lookupNameAr;
	}
	public String getLookupNameEn() {
		return LookupNameEn;
	}
	public void setLookupNameEn(String lookupNameEn) {
		LookupNameEn = lookupNameEn;
	}

 

}
