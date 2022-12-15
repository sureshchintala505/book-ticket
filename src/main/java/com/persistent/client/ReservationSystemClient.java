package com.persistent.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.persistent.dto.AvailabilityDto;
import com.persistent.dto.BookTicketDto;
import com.persistent.dto.CancelTicketDto;
import com.persistent.dto.PassengerDto;
import com.persistent.dto.SearchTrainDto;
import com.persistent.dto.StatusDto;
import com.persistent.dto.TicketDto;
import com.persistent.dto.TrainInfoDto;

@FeignClient(name = "reservation-system")
public interface ReservationSystemClient {

	@PostMapping("passeger/registration")
	public ResponseEntity<PassengerDto> addPassengerDetails(@RequestBody PassengerDto passenger);

	@PostMapping("update/profile")
	public ResponseEntity<PassengerDto> updatePassengerDetails(@RequestBody PassengerDto passenger);

	@GetMapping("passeger/{mobileNumber}")
	public ResponseEntity<PassengerDto> getPassengerDetails(@PathVariable String mobileNumber);

	@PostMapping("ticket/availability")
	public ResponseEntity<StatusDto> ticketAvailability(@RequestBody AvailabilityDto reqDto);

	@PostMapping("searchTrain")
	public ResponseEntity<List<TrainInfoDto>> searchTrain(@RequestBody SearchTrainDto reqDto);

	@PostMapping("book/ticket")
	public ResponseEntity<TicketDto> bookTicket(@RequestBody BookTicketDto reqDto);

	@PostMapping("cancel/ticket")
	public ResponseEntity<StatusDto> cancelTicket(@RequestBody CancelTicketDto reqDto);

}
