package com.m12.HelpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.m12.HelpDesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
