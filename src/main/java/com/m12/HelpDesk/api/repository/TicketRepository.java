package com.m12.HelpDesk.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.m12.HelpDesk.api.entity.Ticket;
import com.m12.HelpDesk.api.entity.User;

public interface TicketRepository extends MongoRepository<Ticket, String> {
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
			String title, String status, String priority, Pageable pages );
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(
			String title, String status, String priority,String userId,Pageable pages );
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDateDesc(
			String title, String status, String priority, String userId ,Pageable pages );
	
	Page<Ticket> findByNumber(Integer number, Pageable pages);
}
