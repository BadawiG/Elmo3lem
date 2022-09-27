package com.example.Elmo3lem.classes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Elmo3lem.AcademicYear.AcademicYearModel;

public interface StudentClassRepo extends JpaRepository<StudentClassModel, Long> {

}
