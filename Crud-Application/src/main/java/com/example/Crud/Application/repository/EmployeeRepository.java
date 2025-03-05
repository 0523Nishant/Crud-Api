package com.example.Crud.Application.repository;

import com.example.Crud.Application.Entity.GeneralEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<GeneralEntity, Integer> {


}
