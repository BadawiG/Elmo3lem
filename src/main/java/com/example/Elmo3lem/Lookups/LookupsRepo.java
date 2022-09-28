package com.example.Elmo3lem.Lookups;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Transient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
  

public interface LookupsRepo extends JpaRepository<LookupsModel, Integer> {
	
	@Query("Select t from LookupsModel t where t.parentId= ?1 ")
	List<LookupsModel> getList(Integer listId);
	
 
	public static final String FIND_PROJECTS = "SELECT new com.example.Elmo3lem.Lookups.LookupsModel ( "
			+ " LookupId , "
			+ " parentId ,"
			+ " LookupNameAr ,"
			+ " LookupNameEn ,"
			+ " subsidiaryId ,"
 			+ " ( CASE "
 			+ "    WHEN( ?2 = 'ar') THEN LookupNameAr "
 			+ "    WHEN( ?2 = 'en') THEN LookupNameEn " 
 			+ "    ELSE LookupNameEn "
 			+ " END   ) as LookupName )"
 			+ " from LookupsModel "
			+ " where parentId= ?1 ";

	@Query(value = FIND_PROJECTS )
	
	public List<LookupsModel> findLists(Integer listId ,String Lang);
	
 
  
}
