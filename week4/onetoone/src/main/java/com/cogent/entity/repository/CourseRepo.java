package com.cogent.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
