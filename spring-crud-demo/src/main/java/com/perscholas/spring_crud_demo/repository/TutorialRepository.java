package com.perscholas.spring_crud_demo.repository;

import com.perscholas.spring_crud_demo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
    // Tutorial → Entity type and Long --> primary key
{
    // findByPublished is a custom method()
    public List<Tutorial> findByPublished(boolean published);
}