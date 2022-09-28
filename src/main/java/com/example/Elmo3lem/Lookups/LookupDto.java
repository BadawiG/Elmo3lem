package com.example.Elmo3lem.Lookups;

public class LookupDto {

	Integer lookup_id, parent_id;
	String lookup_name_ar;
	String LookupName;
	
	String lookup_name_en;

	public Integer getLookup_id() {
		return lookup_id;
	}

	public void setLookup_id(Integer lookup_id) {
		this.lookup_id = lookup_id;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getLookup_name_ar() {
		return lookup_name_ar;
	}

	public void setLookup_name_ar(String lookup_name_ar) {
		this.lookup_name_ar = lookup_name_ar;
	}

	public String getLookupName() {
		return LookupName;
	}

	public void setLookupName(String lookupName) {
		LookupName = lookupName;
	}

	public String getLookup_name_en() {
		return lookup_name_en;
	}

	public void setLookup_name_en(String lookup_name_en) {
		this.lookup_name_en = lookup_name_en;
	}


	 
}
