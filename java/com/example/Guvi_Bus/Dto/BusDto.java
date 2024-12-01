package com.example.Guvi_Bus.Dto;

import java.sql.Time;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
	@NotNull
   private Long id;
   @NotEmpty(message = "Bus Name cannot be empty")
   private String busName;
   @NotEmpty(message = "Bus Number cannot be empty")

   private String busNo;
   @NotEmpty(message = "Starting point cannot be empty")

   private String startingPoint;
   @NotEmpty(message = "Destination cannot be empty")

   private String destination;
   
   private Time startingTime;
   private Time destinationTime;
}
