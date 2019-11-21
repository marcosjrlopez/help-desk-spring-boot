package com.m12.HelpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.m12.HelpDesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);
}
