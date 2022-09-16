package com.example.Elmo3lem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Elmo3lem.model.AcademicYearModel;
import com.example.Elmo3lem.model.LookupsModel;

public interface LookupsRepo extends JpaRepository<LookupsModel, Long> {

}
