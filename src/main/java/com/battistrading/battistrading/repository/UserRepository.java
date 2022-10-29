package com.battistrading.battistrading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.battistrading.battistrading.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	

}
