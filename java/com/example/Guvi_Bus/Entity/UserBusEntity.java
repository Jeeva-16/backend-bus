package com.example.Guvi_Bus.Entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "UserBusRecords")
public class UserBusEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
	@Column(nullable = false)
  private String name;
	@Column(nullable = false)
  private String startingPoint;
	@Column(nullable = false)
  private String destination;
	@Column(nullable = false)
  private String busName;
	@Column(nullable = false)
	  private String busNo;
	@Column(nullable = false)
	  private Time startingTime;
	@Column(nullable = false)
	  private Time destinationTime;
}
