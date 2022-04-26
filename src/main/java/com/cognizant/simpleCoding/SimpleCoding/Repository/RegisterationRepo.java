package com.cognizant.simpleCoding.SimpleCoding.Repository;

import com.cognizant.simpleCoding.SimpleCoding.modelclass.StudentRegisteration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public interface RegisterationRepo extends
        JpaRepository<StudentRegisteration, Integer> {
}
