package com.example.vedDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vedDB.domain.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {

}
