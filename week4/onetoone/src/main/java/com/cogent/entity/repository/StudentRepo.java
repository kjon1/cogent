package com.cogent.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cogent.entity.Course;
import com.cogent.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
