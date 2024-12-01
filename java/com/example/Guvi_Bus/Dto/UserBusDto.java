package com.example.Guvi_Bus.Dto;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBusDto {
	@NotNull
	  private Long id;
	@NotEmpty(message = " Name cannot be empty")
	  private String name;
	@NotEmpty(message = " Starting point cannot be empty")
	  private String startingPoint;
	@NotEmpty(message = " Destination cannot be empty")
	  private String destination;
	@NotEmpty(message = "Bus Name cannot be empty")
	private String busName;
	private String busNo;
	private Time startingTime;
	private Time destinationTime;
}
