package com.brunosouza.student.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.brunosouza.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
