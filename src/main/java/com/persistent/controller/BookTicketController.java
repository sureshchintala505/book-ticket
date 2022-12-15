package com.persistent.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.client.ReservationSystemClient;
import com.persistent.dto.AvailabilityDto;
import com.persistent.dto.BookTicketDto;
import com.persistent.dto.CancelTicketDto;
import com.persistent.dto.PassengerDto;
import com.persistent.dto.SearchTrainDto;
import com.persistent.dto.StatusDto;
import com.persistent.dto.TicketDto;
import com.persistent.dto.TrainInfoDto;

@RestController
public class BookTicketController {

	@Autowired
	private ReservationSystemClient service;

	@PostMapping("passeger/registration")
	public ResponseEntity<PassengerDto> addPassengerDetails(@RequestBody PassengerDto passenger) {
		return service.addPassengerDetails(passenger);
	}

	@PostMapping("update/profile")
	public ResponseEntity<PassengerDto> updatePassengerDetails(@RequestBody PassengerDto passenger) {
		return service.addPassengerDetails(passenger);
	}

	@GetMapping("passeger/{mobileNumber}")
	public ResponseEntity<PassengerDto> getPassengerDetails(@PathVariable String mobileNumber) {
		return service.getPassengerDetails(mobileNumber);
	}

	@PostMapping("searchTrain")
	public ResponseEntity<List<TrainInfoDto>> searchTrain(@RequestBody SearchTrainDto reqDto) {
		return service.searchTrain(reqDto);
	}

	@PostMapping("ticket/availability")
	public ResponseEntity<StatusDto> ticketAvailability(@RequestBody AvailabilityDto reqDto) {
		return service.ticketAvailability(reqDto);
	}

	@PostMapping("book/ticket")
	public ResponseEntity<TicketDto> bookTicket(@RequestBody BookTicketDto reqDto) {
		return service.bookTicket(reqDto);
	}

	@PostMapping("cancel/ticket")
	public ResponseEntity<StatusDto> cancelTicket(@RequestBody CancelTicketDto reqDto) {
		return service.cancelTicket(reqDto);
	}


}
// bookTicket makePayment cancelTicket

//updateSchedule modifyTicketCount