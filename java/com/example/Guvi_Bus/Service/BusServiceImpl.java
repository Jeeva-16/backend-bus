package com.example.Guvi_Bus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Guvi_Bus.Dto.BusDto;
import com.example.Guvi_Bus.Entity.BusEntity;
import com.example.Guvi_Bus.Mapper.BusMapper;
import com.example.Guvi_Bus.Repository.BusRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BusServiceImpl implements BusService{
	@Autowired
	private BusRepo busRepository;
	@Autowired
	private BusMapper busMapper;
	@Override
	public BusDto createBus(BusDto busDto) {
		BusEntity busEntity = busMapper.mapToBusEntity(busDto);
		
		
        BusEntity savedBus = busRepository.save(busEntity);
//        UserDto returnedDto = UserMapper.mapToUserDto(savedUser);
        BusDto returnedDto = busMapper.mapToBusDto(busEntity);
        busRepository.flush(); // Available if the repository extends JpaRepository

        return returnedDto;	
		
	}
	public List<String> getDropdownOptions(){
		return busRepository.findByStartingPoint();
	}
	
	public List<String> getDropdownOption(){
		return busRepository.findByDestination();
	}
	
	
	@Override
	public List<BusEntity> searchBuses(String startingPoint , String destination) {
		
		return busRepository.findBusByRoutes(startingPoint, destination);
	}
	
	}
   

