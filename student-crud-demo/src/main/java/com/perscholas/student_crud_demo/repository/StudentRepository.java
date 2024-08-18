package com.perscholas.student_crud_demo.repository;

import com.perscholas.student_crud_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    // following are custom methods
    Student findByAccountNo (Long accountNo) ;
    List<Student> findByNameContaining(String name);
}
