package com.example.Elmo3lem.AcademicYear;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Elmo3lem.login.UserModel;

public interface AcademicYearRepo extends JpaRepository<AcademicYearModel,Integer > {
	
	
	
	AcademicYearModel   findById(int yearId);
	
	@Query("SELECT t from  AcademicYearModel t WHERE t.AcademicYearTypeId  = 1")
	List<AcademicYearModel> findAllYears();
 
	@Query("SELECT t from  AcademicYearModel t WHERE t.AcademicYearTypeId  = 2 and t.AcademicYearPid =?1")
	List<AcademicYearModel> findAllSemester(int yearId);
}
