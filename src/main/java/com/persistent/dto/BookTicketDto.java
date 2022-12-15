package com.persistent.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookTicketDto {
	private Long passengerId;
	private TrainInfoDto train;
	private PassengerDto passenger;
	private Long trainId;
	private Long cardNumber;
	private String cardType;

	private Double ticketCost;
	private String startingLocation;
	private String destination;
	private Date date;
	private String berthType;
}
