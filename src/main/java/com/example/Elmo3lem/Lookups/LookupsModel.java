package com.example.Elmo3lem.Lookups;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Lookups")
public class LookupsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer LookupId;
	@Column
	private Integer parentId;

	private String LookupNameAr;
	private String LookupNameEn;
	
	private Long subsidiaryId;

	@Transient
	private String LookupName;
	@Transient
	private String Lang;
 


	LookupsModel() {

	}   

	public LookupsModel(Integer lookupId, Integer parentId, String lookupNameAr, String lookupNameEn, Long subsidiaryId,
			  String lookupName) {
 		LookupName = lookupName; 
		LookupId = lookupId;
		this.parentId = parentId;
		LookupNameAr = lookupNameAr;
		LookupNameEn = lookupNameEn;
		this.subsidiaryId = subsidiaryId; 
 	}
 

	public String getLookupName() {
		return LookupName;
	}

	public void setLookupName(String lookupName) {
		LookupName = lookupName;
	}

	public Integer getLookupId() {
		return LookupId;
	}

	public Long getSubsidiaryId() {
		return subsidiaryId;
	}

	public void setSubsidiaryId(Long subsidiaryId) {
		this.subsidiaryId = subsidiaryId;
	}

	public void setLookupId(Integer lookupId) {
		LookupId = lookupId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
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
