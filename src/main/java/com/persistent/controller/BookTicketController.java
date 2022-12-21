package com.persistent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.dao.Ticket;
import com.persistent.dto.BookTicketDto;
import com.persistent.serviceimpl.RegistrationServiceImpl;

@RestController
public class BookTicketController {

	@Autowired
	private RegistrationServiceImpl registrationServiceImpl;

	
	@PostMapping("book/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody BookTicketDto reqDto) {
		return ResponseEntity.ok(registrationServiceImpl.bookTicket(reqDto));
	}

	

}
// bookTicket makePayment cancelTicket

//updateSchedule modifyTicketCount