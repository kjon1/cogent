package com.e.assessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.User;

public interface MovieRepository extends JpaRepository<com.e.assessment.entity.User,Integer> {

	com.e.assessment.entity.User findByUserName(String username);

}
