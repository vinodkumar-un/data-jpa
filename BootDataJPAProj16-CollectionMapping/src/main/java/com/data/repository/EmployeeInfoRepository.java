package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.EmployeeInfo;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

}
