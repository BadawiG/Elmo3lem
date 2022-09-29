package com.example.Elmo3lem.Lookups;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Transient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
  

public interface LookupsRepo extends JpaRepository<LookupsModel, Integer> {
	
	@Query("Select t from LookupsModel t where t.parentId= ?1 ")
	public Page<LookupsModel> getList(Integer listId ,Pageable pagable);
	
 
	public static final String FIND_PROJECTS = "SELECT new com.example.Elmo3lem.Lookups.LookupsModel ( "
			+ " L.LookupId , "
			+ " L.parentId ,"
			+ " L.LookupNameAr ,"
			+ " L.LookupNameEn ,"
			+ " L.subsidiaryId ,"
//			+ " L.LookupNameAr as LookupName )"
 			+ " ( CASE "
 			+ "    WHEN( :Lang = 'ar') THEN L.LookupNameAr "
 			+ "    WHEN( :Lang = 'en') THEN L.LookupNameEn " 
 			+ "    ELSE LookupNameEn "
 			+ " END   ) as LookupName )"
 			+ " from LookupsModel L"
			+ " where L.parentId= :listId "
 			;

	@Query(value = FIND_PROJECTS )
	
	public Page<LookupsModel> findLists(Integer listId ,String Lang,Pageable pagable);
	
   
}


