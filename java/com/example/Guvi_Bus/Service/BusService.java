package com.example.Guvi_Bus.Service;

import java.util.List;

import com.example.Guvi_Bus.Dto.BusDto;
import com.example.Guvi_Bus.Entity.BusEntity;

public interface BusService {
	
	BusDto createBus(BusDto busDto);

	List<String> getDropdownOptions();

	List<String> getDropdownOption();
	
	

	List<BusEntity> searchBuses(String startingPoint, String destination);

}
